package keytree

import grails.rest.Resource

@Resource(uri = "/projects")
class Project {

  String name
  String description

}
