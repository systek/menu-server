package menu.server

class Buy {

    static belongsTo = [buy: MenuItem]

    static constraints = {
    }

    Status status;

    String table

    enum Status {
        ORDERD, DELIVERED, PAYED
    }
}
