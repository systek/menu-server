package menu.server

import grails.converters.JSON

class MenuController {

    def scaffold = Menu


    def json = {
        render MenuItem.findByMenu(Menu.findByCategoryName(params.id)) as JSON
    }

}
