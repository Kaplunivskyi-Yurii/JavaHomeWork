package com.pb.kaplunivskyi.hw6;

public abstract class Animal {
    private String rarion;
    private String color;
    private int weight;
    public Animal(String rarion,String color,int weight){
        this.rarion=rarion;
        this.color=color;
        this.weight=weight;
    }

    public String getRarion() {
        return rarion;
    }

    public void setRarion(String rarion) {
        this.rarion = rarion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract String getVoice();
    public abstract void eat();
    public abstract void sleep();
    @Override
    public String toString() {
        return "Animal{" +
                "rarion='" + rarion + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
