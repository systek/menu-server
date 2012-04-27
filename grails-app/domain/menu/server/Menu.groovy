package menu.server

import java.awt.MenuItem

class Menu {

    static constraints = {
    }

    String categoryName;

    static hasMany = [menuItems:MenuItem]

    Collection<MenuItem> menuItems;

    String toString(){
        return categoryName
    }

}
