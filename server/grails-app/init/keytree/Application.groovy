package keytree

import groovy.util.logging.Slf4j
import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

@Slf4j
class Application extends GrailsAutoConfiguration {
  static void main(String[] args) {
    log.info('Running Application.main')
    GrailsApp.run(Application, args)
  }
}
