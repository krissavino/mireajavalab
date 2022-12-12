package ru.mirea.lab3;


import java.text.NumberFormat;
import java.util.*;

public class Currencies {
    public void task() {
        new Report().generateReport();
        Shop shop = new Shop();
        shop.use();
    }
}

class CurrencyConverter {
    public Map<String, Double> currencies;
    public CurrencyConverter() {
        currencies = new HashMap<String, Double>();
        currencies.put("P", 60.0);
        currencies.put("$", 1.0);
        currencies.put("Y", 6.9);
    }
    public double convert(double sum, String toWhat) {
        return sum*currencies.get(toWhat);
    }
    public void changeLocale(String toWhat) {
        if(toWhat.equals("P")) Locale.setDefault(Locale.getDefault());
        if(toWhat.equals("Y")) Locale.setDefault(Locale.CHINA);
        if(toWhat.equals("$")) Locale.setDefault(Locale.US);
    }
}

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Shop {
    private Product[] products;
    public Shop() {
        products = new Product[3];
        products[0] = new Product("Pilesos", 22.8);
        products[1] = new Product("Ventilator", 13.37);
        products[2] = new Product("Robot", 42.0);
    }
    public void use() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of products: ");
        int n = scanner.nextInt();
        double sum = 0;
        System.out.print("Enter products indexes (0 - 2): ");
        for(int i = 0; i < n; i++)
        {
            int index = scanner.nextInt();
            sum += products[index].price;
        }
        System.out.println("Total: " + sum + "$");
        System.out.print("Enter currency ($, P, Y): ");
        String currency = scanner.next();
        CurrencyConverter currencyConverter = new CurrencyConverter();
        sum = currencyConverter.convert(sum, currency);
        currencyConverter.changeLocale(currency);
        System.out.println("Total: " + NumberFormat.getCurrencyInstance().format(sum));
    }
}

class Employee {
    private String fullName;
    private double salary;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String toString() {
        return new Formatter().format("Name: %5s, Salary: %5s", fullName, NumberFormat.getCurrencyInstance().format(salary)).toString();
    }
}

class Report {
    static private Employee employers[];
    public Report() {
        employers = new Employee[2];
        employers[0] = new Employee("Petya", 100);
        employers[1] = new Employee("Vova", 2000);
    }
    static public void generateReport() {
        for(Employee e : employers) {
            System.out.println(e.toString());
        }
    }
}