package keytree

import grails.rest.*

@Resource(readOnly = false, formats = ['json'])
class KeyNode {
  String key
  String value
  KeyNode children
}