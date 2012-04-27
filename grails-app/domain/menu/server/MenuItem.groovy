package menu.server

class MenuItem {

    static belongsTo = [menu:Menu]

    static constraints = {
    }


    String name;

    String description;

    String imageUrl;

    String toString(){
        return name;
    }

}
