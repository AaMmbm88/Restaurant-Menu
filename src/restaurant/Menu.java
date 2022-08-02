package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Menu {
        private ArrayList<MenuItem> menuItems ;
        private Date updateDate;


    public Menu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.updateDate = new Date();
    }

    public void add(MenuItem item){
        this.menuItems.add(item);
    }

    public ArrayList<MenuItem> getMenu() {
        return menuItems;
    }

    public void setMenu(ArrayList<MenuItem> restaurantMenu) {
        this.menuItems = restaurantMenu;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public void simpleRemove(int index){
        this.menuItems.remove(index);
    }
    public void remove() {

        Scanner input = new Scanner(System.in);
        System.out.println("Select the ID number of the dish you would like to remove from the menu: ");
        this.showAll();
        int idToDelete = input.nextInt();
        input.close();
        this.menuItems.remove(idToDelete);
    }
    public void showAll() {
        for (int i = 0; i < this.menuItems.size(); i++) {
            MenuItem theItem = this.menuItems.get(i);
            System.out.println(String.format("%s (ID#: %s): %s",  theItem.getName(), theItem.getId(), theItem.getPrice()));
        }
    }

    public void showItem(int index){
        MenuItem theItem = this.menuItems.get(index);
        System.out.println(theItem.getName() + ": " + theItem.getPrice());
    }
}

