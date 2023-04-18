package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    String name;
    double price;
    int id;
    public Menu (int id, String name, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public void Makanan(String name, double price){
        this.price = price;
        this.name = name;
    }
    public void Minuman(String name, double price){
       this.price = price;
       this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String toString() {
        return "Menu : " +
                name + " || Rp." + price;
    }
}
