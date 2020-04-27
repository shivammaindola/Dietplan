package com.example.shubham.dietchartapp;

public class foodDetails {

    int id;
    String name;
    String size;
    String calories;

    public foodDetails(){};

    public foodDetails(String name,String size, String calories){

        this.name = name;
        this.calories = calories;
        this.size = size;

    };

    public String details(){

        return this.id+","+this.name+","+this.size+","+this.calories;
    };


}