package restaurant;

import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class MenuItem {
    public static int nextId = 1;
    private String name;
    private final int id;
    private String description;
    private String category;
    private double price;
    private boolean isNew;

    public MenuItem() {

        this.id = nextId;


            Scanner inputName = new Scanner(System.in);
            System.out.println("Enter name of the dish: ");
            name = inputName.next();

            Scanner inputDescription = new Scanner(System.in);
            System.out.println("Enter description of the dish: ");
            description = inputDescription.next();

            Scanner inputCategory = new Scanner(System.in);
            System.out.println("Enter category of the dish: ");
            category = inputCategory.next();

            Scanner inputPrice = new Scanner(System.in);
            System.out.println("Enter price of the dish: ");
            price = inputPrice.nextDouble();

            nextId++;

            }



    public MenuItem(String name, String description, String category, double price) {
        this.id = nextId;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = true;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return id == menuItem.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
