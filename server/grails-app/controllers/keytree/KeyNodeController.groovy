package keytree

import grails.rest.*
import grails.converters.*

class KeyNodeController extends RestfulController {
    static responseFormats = ['json', 'xml']
    KeyNodeController() {
        super(KeyNode)
    }
}
