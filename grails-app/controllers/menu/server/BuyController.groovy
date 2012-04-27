package menu.server

import grails.converters.JSON

class BuyController {

    def scaffold = Buy

    def buy_item() {
        def table = params.id
        def id = params.get("item")
        def menuItem = MenuItem.findById(id.asType(Long.class));
        def b = new Buy(buy: menuItem, status: Buy.Status.ORDERD, table: table).save()
        render b as JSON
    }

    def status() {
        def status = params.id
        def table = params.get("table")
        def buy = new Buy(status: status.asType(Buy.Status), table: table)
        def items = Buy.findAll(buy)
        render items as JSON
    }

    def update() {
        def id = params.id;
        def newStatus = params.get("status").asType(Buy.Status);

        def buy = Buy.findById(id)
        buy.setStatus(newStatus)
        buy.save()
        render buy as JSON
    }

}
