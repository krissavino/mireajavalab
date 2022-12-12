package ru.mirea.lab4_15;

public class Employer {
    String firstName, lastName;
    double income;

    public Employer(String firstName, double income) {
        this.firstName = firstName;
        this.income = income;
    }

    public double getIncome() {
        return income;
    }
}

class Manager extends  Employer {
    double averageSum;
    public double getIncome() {
        return income + averageSum*12;
    }
    public Manager(String name, double income, double averageSum) {
        super(name, income);
        this.averageSum = averageSum;
    }
}
