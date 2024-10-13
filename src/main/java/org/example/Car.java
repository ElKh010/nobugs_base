package org.example;

interface Drivable {
    void start();
    void stop();
    void drive(int distance);
}

class Car implements Drivable {
    private String brand;
    private String model;
    private int year;
    private boolean isRunning;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isRunning = false; // По умолчанию автомобиль не запущен
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(brand + " " + model + " запущен.");
        } else {
            System.out.println(brand + " " + model + " уже работает.");
        }
    }

    @Override
    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println(brand + " " + model + " остановлен.");
        } else {
            System.out.println(brand + " " + model + " уже остановлен.");
        }
    }

    @Override
    public void drive(int distance) {
        if (isRunning) {
            System.out.println(brand + " " + model + " проехал " + distance + " км.");
        } else {
            System.out.println("Автомобиль стоит!");
        }
    }
}
