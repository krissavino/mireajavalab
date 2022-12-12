package ru.mirea.lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    private String login;
    private String password;
    private double cash;
    private List<Product> cart;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        cash = 100;
        cart = new ArrayList<>();
    }


    public void addProduct(Product product) {
        cart.add(product);
    }

    public boolean auth(String login, String password) {
        if(this.login.equals(login) && this.password.equals(password)) return true;
        return false;
    }

    public boolean buy() {
        double sum = 0;
        for(Product p : cart)
            sum += p.price;
        if(cash >= sum) {
            cash -= sum;
            cart.clear();
            return true;
        }
        return false;
    }
    public void profile() {
        System.out.println("Login: " + login);
        System.out.println("Cash: " + cash);
        System.out.println("Your cart: ");
        double sum = 0;
        for(int i = 0; i < cart.size(); i++)
        {
            System.out.print(cart.get(i).name + " ");
            sum += cart.get(i).price;
        }
        System.out.println();
        System.out.println("Total: " + sum);
    }
}

enum Manufacturer {
    RUSSIA {
        public String getDescription() {
            return "Sdelano v Rossii!";
        }
    },
    USA {
        public String getDescription() {
            return "Made in USA";
        }
    }, CHINA;
    public String getDescription() {
        return "Made in China";
    }
}

class Product {
    String name;
    double price;
    Manufacturer manufacturer;

    public Product(String name, double price, Manufacturer manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }
}

class Catalog {
    String name;
    List<Product> products;

    public Catalog(String name) {
        this.name = name;
        products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }

    public void printProducts() {
        System.out.println("Products of " + name + ": ");
        for(int i = 0; i < products.size(); i++)
            System.out.println(i+1 + ". " + products.get(i).name);
    }
}

public class EShop {
    List<Catalog> catalogs;
    List<User> users;
    public EShop() {
        users = new ArrayList<>();
        users.add(new User("Bob", "123"));

        catalogs = new ArrayList<>();
        catalogs.add(new Catalog("Home"));
        catalogs.get(0).addProduct(new Product("Lantern", 21, Manufacturer.USA));
        catalogs.get(0).addProduct(new Product("Table", 27, Manufacturer.RUSSIA));

        catalogs.add(new Catalog("Games"));
        catalogs.get(1).addProduct(new Product("Spinner", 12, Manufacturer.CHINA));
        catalogs.get(1).addProduct(new Product("Puzzle", 14, Manufacturer.RUSSIA));
    }
    public boolean auth(String login, String password) {
        for(User u : users) {
            if(u.auth(login, password)) {
                System.out.println("Entered.");
                return true;
            }
        }
        System.out.println("Incorrect data.");
        return false;
    }
    public void enter() {
        Scanner scanner = new Scanner(System.in);
        String login, password;
        do {
            System.out.print("Login: ");
            login = scanner.next();
            System.out.print("Password: ");
            password = scanner.next();
        }while(!auth(login, password));

        System.out.println("Welcome to EShop!");
        System.out.println("Commands: ");
        System.out.println("catalogs: prints catalogs");
        System.out.println("catalog <name>: prints catalogs products");
        System.out.println("cart <name>: adds product to cart");
        System.out.println("product <name>: prints product info");
        System.out.println("profile: prints profile info");
        System.out.println("buy: buys products from cart");
        System.out.println("exit: exits EShop");

        String cmds[] = new String[2];
        do {
            cmds[0] = scanner.next();
            if (cmds[0].equals("catalog") || cmds[0].equals("cart") || cmds[0].equals("product"))
                cmds[1] = scanner.next();
            executeCommand(login, password, cmds);
        }while(!cmds[0].equals("exit"));
        scanner.close();
    }

    private void printCatalogs() {
        System.out.println("Catalogs: ");
        for(int i = 0; i < catalogs.size(); i++)
            System.out.println(i+1 + ". " + catalogs.get(i).name);
    }

    public void executeCommand(String login, String password, String[] cmds) {
        User user = null;
        for(User u : users) {
            if(u.auth(login, password)) {
                user = u;
            }
        }
        if(user == null) {
            System.out.println("Incorrect data");
            return;
        }
        switch (cmds[0]) {
            case "catalogs":
                printCatalogs();
                break;
            case "catalog":
                for(Catalog c : catalogs) {
                    if(c.name.equals(cmds[1]))
                        c.printProducts();
                }
                break;
            case "cart":
                for(Catalog c : catalogs)
                    for(Product p : c.products)
                        if(p.name.equals(cmds[1]))
                        {
                            user.addProduct(p);
                            System.out.println(p.name + " added.");
                        }
                break;
            case "product":
                for(Catalog c : catalogs)
                    for(Product p : c.products)
                        if(p.name.equals(cmds[1]))
                        {
                            System.out.println(p.name + ": " + p.manufacturer.getDescription());
                        }
                break;
            case "buy":
                if(!user.buy()) System.out.println("Error. Not enough cash");
                else System.out.println("Success.");
                break;
            case "profile":
                user.profile();
        }
    }
}
