package com.pb.kaplunivskyi.hw6;

public class Horse extends Animal{
    private String name;
    public Horse(String rarion,String color,int weight,String name){
        super(rarion,color,weight);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getVoice(){
        return "ггг-ггг";
    }
    @Override
    public void eat(){
        System.out.println("Ест");

    }
    @Override
    public void sleep(){
        System.out.println("Спит");

    }
}