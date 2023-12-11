package edu.monmouth.coffeemaker;

public class BasicCoffeeMaker implements Comparable<BasicCoffeeMaker>, CoffeeMaker {
    private String name;

    // Constructor
    public BasicCoffeeMaker(String name) {
        this.name = name;
    }

    // Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Other methods
    @Override
    public void brew() {
        System.out.println("Brewing Basic Coffee");
    }

    @Override
    public String toString() {
        return "BasicCoffeeMaker{name='" + name + "'}";
    }

    @Override
    public int compareTo(BasicCoffeeMaker other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BasicCoffeeMaker that = (BasicCoffeeMaker) obj;
        return this.name.equals(that.name);
    }
}
