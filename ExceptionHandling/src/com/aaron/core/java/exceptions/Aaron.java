package com.aaron.core.java.exceptions;
import java.util.ArrayList;
import java.util.List;
 public class Aaron {

    private String meal ;

    public Aaron(){

    }
    public Aaron(String meal){

        this.meal = meal;
    }

    public String getMeal(){

        return this.meal;
    }

    public void setMeal(String meal){

        this.meal = meal;

     }
    public void eat(String meal){

        try
        {
            System.out.println("Aaron is eating a meal of " + meal.length() + " course");
        }
        catch(NullPointerException ne)
        {
            throw new NothingToEatException("Meal is empty, please purhcase new meal ", ne);
        }

    }

    public List<Aaron> aaronList(boolean send){

        List<Aaron> aaronList = null;

        if(send){
            Aaron stupidAaron = new Aaron();
            aaronList = new ArrayList<Aaron>();

            aaronList.add(stupidAaron);
        }else{
System.out.println("do nothing");
        }

        return aaronList;
    }

    public static void main (String args[]){

        Aaron fatAaron =new Aaron(null);


        if(fatAaron!=null && fatAaron.getMeal() != null ){

            System.out.println("Length of meal is: " + fatAaron.getMeal().length());
        }

//        String meal = null;
//        fatAaron.eat(meal);
        if(fatAaron.aaronList(false)!=null) {
            System.out.println(fatAaron.aaronList(false));
        }
    }

}
