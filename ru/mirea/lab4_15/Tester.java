package ru.mirea.lab4_15;


public class Tester {

    public void task1() {
        Rectangle rectangle = new Rectangle(5, 10);
        Square square = new Square(10);
        Circle circle = new Circle(15);

        System.out.println(rectangle.toString() + " S: " + rectangle.getArea() + " P: " + rectangle.getPerimeter());
        System.out.println(square.toString() + " S: " + square.getArea() + " P: " + square.getPerimeter());
        System.out.println(circle.toString() + " S: " + circle.getArea() + " P: " + circle.getPerimeter());
    }
    public void task2() {
        Phone phone = new Phone("123", "qwe");
        System.out.println(phone.getNumber());
        phone.receiveCall("777");
        phone.receiveCall("666", "Satan");
        phone.sendMessage("123", "1234", "222");
    }
    public void task3() {
        Person[] persons = new Person[2];
        persons[0] = new Person();
        persons[1] = new Person("Nick", 21);
        persons[0].move();
        persons[1].move();
    }
    public void task4() {
        Matrix matrix1 = new Matrix(2, 2);
        Matrix matrix2 = new Matrix(2, 2);
        matrix1.show();
        matrix1.add(matrix2);
        matrix1.show();
        matrix1.multiplication(2);
        matrix1.show();
    }
    public void task5() {
        Reader reader = new Reader("Nick");
        reader.takeBook(new Book("Voyna i mir"));
        reader.takeBook(3);
        reader.takeBook("Voyna i mir", "Vishnevi sad");
        reader.returnBook(new Book("Voyna i mir"));
        reader.returnBook(3);
        reader.returnBook("Voyna i mir", "Vishnevi sad");
    }
    public void task6() {
        Employer[] employers = new Employer[2];
        employers[0] = new Employer("Ivan", 150);
        employers[1] = new Manager("Vasya", 100, 5);
        employers[0].getIncome();
        employers[1].getIncome();

    }
    public void task7() {
        Listener listeners[] = new Listener[3];
        listeners[0] = new Listener();
        listeners[1] = new Pupil();
        listeners[2] = new Student();
        for(Listener l : listeners)
            l.show();

    }
    public void task8() {
        System.out.println(new Circle(10, "Blue", true).toString());
        System.out.println(new Rectangle(10, 10, "Yellow", true).toString());
        System.out.println(new Square(10, "Red", true).toString());
    }
    public void task10() {
        Transport[] transport = new Transport[4];
        transport[0] = new Plane(10, 1000);
        transport[1] = new Ship(20, 700);
        transport[2] = new Plane(15, 300);
        transport[3] = new Vehicle(30, 900);
        for(Transport t : transport) {
            System.out.println("By " + t.toString() + ": time: " + t.getTime() + " price: " + t.getPrice());
        }
    }
}
