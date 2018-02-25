package keytree

import grails.rest.*

@Resource(readOnly = false, formats = ['json'])
class KeyNode {

  String key
  String value
  Set<KeyNode> children

  static constraints = {
    children(nullable: true, validator: { Set<KeyNode> childrenInst, KeyNode self ->
        log.debug('children validation children {} and self {}', childrenInst, self)
        (self.value && childrenInst) || (!self.value && childrenInst) || (self.value && !childrenInst)
      })
    value(nullable: true, validator: { valueInst, self ->
      log.debug('value validation self {} and value {}', self, valueInst)
      (valueInst && self.children) || (!valueInst && self.children) || (valueInst && !self.children)
    })
  }

}
