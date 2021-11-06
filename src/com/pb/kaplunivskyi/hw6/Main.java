package com.pb.kaplunivskyi.hw6;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Horse("3","красный",12,"Кекс");
        Animal animal2= new Dog("2","черный",34,"Баксик");
        Veterinarian veterinarian = new Veterinarian("Сергей");
        Veterinarian veterinarian2 = new Veterinarian("Андрей");
        veterinarian.treatment(animal);
        veterinarian2.treatment(animal2);
    }
}