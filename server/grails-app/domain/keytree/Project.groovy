package keytree

import grails.rest.Resource

@Resource(uri = "/projects")
class Project {

  String name
  String description

  static hasMany = [keyNodes: KeyNode]

  static constraints = {
    name nullable: false
    keyNodes nullable: false
    description nullable: true
  }

}
