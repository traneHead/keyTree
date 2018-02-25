package keytree

import groovy.util.logging.Slf4j

@Slf4j
class BootStrap {

  def init = { servletContext ->

    log.info('BootStraping in profile')
    Project project
    project = new Project(
    name: "Init project",
    description: "Test project during dev",
    keyNodes: [new KeyNode(
      key: 'app.gloabal.welcome', value: null,
      children: [new KeyNode(key: 'header', value: 'Welcome')]
      )
    ]
    )
   project.save(flush:true, failOnError:true)

    log.info('Project after save: {}', project)
  }

  def destroy = {
  }

}
