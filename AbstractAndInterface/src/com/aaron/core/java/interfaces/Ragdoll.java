package com.aaron.core.java.interfaces;

public class Ragdoll extends Cat{

    private String eyeColor;

     Ragdoll(){

    }
     Ragdoll(String eyeColor, int noOfHoursOfSleep, int age ){

         super(noOfHoursOfSleep, age);
        this.eyeColor = eyeColor;

    }
    
    @Override
    public void eat(){
        System.out.println("Ragdoll just ate Orijen wet food");
    }

    @Override
    public void sleep(){
        System.out.println("Ragdoll just slep for 10 minutes");
    }

    @Override
    public String toString(){
        return "Eye color is "+this.eyeColor  + " Number of hours: "+ noOfHoursOfSleep +"/ Category: " +category +"/ Country: " + country +"/ is non human?: "+ isNonHuman;
    }

    @Override
    public void attack() {
        System.out.println("Ragdoll is attacking ");
    }

    @Override
    public void run() {
        System.out.println("Ragdoll is running");
    }
}
