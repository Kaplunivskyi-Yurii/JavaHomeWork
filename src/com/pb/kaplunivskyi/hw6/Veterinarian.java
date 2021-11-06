package com.pb.kaplunivskyi.hw6;

public class Veterinarian {
    private String name;
    public Veterinarian(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void treatment(Animal animal){
        if(animal.getClass()==Horse.class){
            System.out.println(((Horse) animal).getName()+" на лечении у ветиринара");
        }
        else {
            System.out.println(((Dog) animal).getName()+ " на лечении у ветиринара");
        }
    }
}