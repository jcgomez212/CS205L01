package edu.monmouth.coffeemaker;

public class PremiumCoffeeMaker implements Comparable<PremiumCoffeeMaker>, CoffeeMaker {
    private boolean hasGrinder;
    private int capacity;

    // Constructor
    public PremiumCoffeeMaker(boolean hasGrinder, int capacity) {
        this.hasGrinder = hasGrinder;
        this.capacity = capacity;
    }

    // Getters and Setters
    public void setGrinder(boolean hasGrinder) {
        this.hasGrinder = hasGrinder;
    }

    public boolean getGrinder() {
        return hasGrinder;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    // Other methods
    @Override
    public void brew() {
        System.out.println("Brewing Premium Coffee");
    }

    @Override
    public String toString() {
        return "PremiumCoffeeMaker{hasGrinder=" + hasGrinder + ", capacity=" + capacity + "}";
    }

    @Override
    public int compareTo(PremiumCoffeeMaker other) {
        return Integer.compare(this.capacity, other.capacity);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PremiumCoffeeMaker that = (PremiumCoffeeMaker) obj;
        return this.hasGrinder == that.hasGrinder && this.capacity == that.capacity;
    }
}
