package bindtosubclassexample


import grails.rest.*
import grails.converters.*

class MasterController extends RestfulController<Master> {
	static responseFormats = ['json', 'xml']
	
    MasterController() {
        super(Master)
    }
}
