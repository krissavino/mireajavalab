package ru.mirea.lab4;

enum Size {
    XXS(25) {
        String getDescription() {
            return "Child size";
        }
    }, XS(15), S(-5), M(0), L(0);
    private int euroSize;
    Size(int euroSize) {
        this.euroSize = euroSize;
    }
    String getDescription() {
        return "Adult size";
    }
}

public class Atelier  {

    public Atelier() {
        MenClothing menClothes[] = new MenClothing[3];
        menClothes[0] = new Pants(Size.M, "red", 100);
        menClothes[1] = new Tie(Size.S, "green", 300);
        menClothes[2] = new TShirt(Size.XXS, "brown", 400);
        dressMen(menClothes);

        WomenClothing womenClothes[] = new WomenClothing[3];
        womenClothes[0] = new Pants(Size.XXS, "red", 100);
        womenClothes[1] = new Skirt(Size.L, "green", 300);
        womenClothes[2] = new TShirt(Size.M, "brown", 400);
        dressWomen(womenClothes);
    }
    void dressWomen(WomenClothing clothes[]) {
        for(WomenClothing c : clothes) {
            c.dressWomen();
        }
    }

    void dressMen(MenClothing clothes[]) {
        for(MenClothing c : clothes) {
            c.dressMan();
        }
    }
}

interface MenClothing {
    void dressMan();
}

interface WomenClothing {
    void dressWomen();
}

abstract class Clothes {
    Size size;
    String color;
    double price;

    public Clothes(Size size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }
}

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, String color, double price) {
        super(size, color, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Man. Size: " + size.name() + " " + size.getDescription() + ". Color: " + color + " Price: " + price);
    }

    @Override
    public void dressWomen() {
        System.out.println("Women. Size: " + size.name() + " " + size.getDescription() + ". Color: " + color + " Price: " + price);
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, String color, double price) {
        super(size, color, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Man. Size: " + size.name() + " " + size.getDescription() + ". Color: " + color + " Price: " + price);
    }

    @Override
    public void dressWomen() {
        System.out.println("Women. Size: " + size.name() + " " + size.getDescription() + ". Color: " + color + " Price: " + price);
    }
}

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, String color, double price) {
        super(size, color, price);
    }

    @Override
    public void dressWomen() {
        System.out.println("Women. Size: " + size.name() + " " + size.getDescription() + ". Color: " + color + " Price: " + price);
    }
}

class Tie extends Clothes implements MenClothing {
    public Tie(Size size, String color, double price) {
        super(size, color, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Man. Size: " + size.name() + " " + size.getDescription() + ". Color: " + color + " Price: " + price);
    }
}