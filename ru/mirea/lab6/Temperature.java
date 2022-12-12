package ru.mirea.lab6;

public class Temperature implements Convertable {
    double temperature;

    public Temperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }


    @Override
    public double convert(TemperatureType to) {
        switch (to) {
            case Fahrenheit: return (temperature*9/5+32);
            case Kelvin: return (temperature+274.15);
        }
        return temperature;
    }
}
