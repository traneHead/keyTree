package keytree

import grails.rest.*

@Resource(readOnly = false, formats = ['json'])
class KeyNode {
  String key
  String value
  KeyNode children

  static constraints = {
    children nullable: true
  }
  static hasOne = [project: Project]
}
