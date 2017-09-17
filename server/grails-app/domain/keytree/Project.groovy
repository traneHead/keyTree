package keytree

import grails.rest.Resource

@Resource(uri = "/projects")
class Project {

  String name
  String description

  List<KeyNode> keyNodes

  static constraints = {
    keyNodes nullable: true
    description nullable: true
  }

}
