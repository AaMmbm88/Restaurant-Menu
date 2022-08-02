package restaurant;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main (String[] args){
        ArrayList<MenuItem> myBucket = new ArrayList<>();
        boolean nextItem = false;
        MenuItem baconWrappedSprouts = new MenuItem("Bacon-Wrapped Brussels-Sprouts", "Sprouts wrapped in bacon", "Appetizer", 15.99);
        MenuItem banhMi = new MenuItem("Banh Mi", "Vietnamese Sandwich", "Entree", 9.99);

        do {
            MenuItem menuItem = new MenuItem();

            Scanner inputAnotherItem = new Scanner(System.in);
            System.out.println("Do you want to add another item? y/n: ");
            String anotherItem = inputAnotherItem.next();

            if (anotherItem == "y"){
                nextItem = true;
            }

            myBucket.add(menuItem);
        }while (nextItem);

        myBucket.add(baconWrappedSprouts);
        myBucket.add(banhMi);


        Menu myMenu = new Menu(myBucket);
        myMenu.showAll();
        myMenu.remove();
        myMenu.showAll();


    }
}
