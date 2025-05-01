package com.aaron.core.java;

import java.util.Scanner;
import java.util.Stack;

public class WebsiteSimulator {


    public static void main(String args[]){

        int counter = 0;
        Stack<Page> webSites = new Stack();
        generateWebsite(webSites);

        Stack<Page> userHistory = new Stack();

        System.out.println("Press the Page Number you would like to navigate to: ");

        do {
            if (counter <= 0) {
                printInfo(webSites);

                System.out.println("\n");

                Scanner scan = new Scanner(System.in);

                String input = scan.nextLine();

                if (input != null && !input.equals("") && (input.equals("1") || input.equals("2") || input.equals("3"))) {

                    if (input.equals("1") && !webSites.empty()) {

                        if (webSites.size() > Integer.parseInt(input) - 1 && webSites.get(Integer.parseInt(input) - 1) != null) {
                            System.out.println(webSites.get(Integer.parseInt(input) - 1).content);

                            userHistory.push(webSites.get(Integer.parseInt(input) - 1));
                            System.out.println("\n");
                        } else {
                            System.out.println("Such page does not exist! ");
                            System.out.println("\n");
                        }
                    } else if (input.equals("2") && !webSites.empty()) {

                        if (webSites.size() > Integer.parseInt(input) - 1 && webSites.get(Integer.parseInt(input) - 1) != null) {
                            System.out.println(webSites.get(Integer.parseInt(input) - 1).content);

                            userHistory.push(webSites.get(Integer.parseInt(input) - 1));
                            System.out.println("\n");
                        } else {
                            System.out.println("Such page does not exist! ");
                            System.out.println("\n");
                        }
                    } else if (input.equals("3") && !webSites.empty()) {

                        if (webSites.size() > Integer.parseInt(input) - 1 && webSites.get(Integer.parseInt(input) - 1) != null) {
                            System.out.println(webSites.get(Integer.parseInt(input) - 1).content);
                            userHistory.push(webSites.get(Integer.parseInt(input) - 1));
                            System.out.println("\n");
                        } else {
                            System.out.println("Such page does not exist! ");
                            System.out.println("\n");
                        }
                    }

                } else if (input != null && input.equalsIgnoreCase("Exit")) {

                    System.out.println("Program is closing. Good Bye! ");
                    System.out.println("\n");
                    System.exit(0);
                } else {
                    System.out.println("Invalid response. Please try again!: ");
                    System.out.println("\n");
                    continue;
                }


            }
            else{

                printInfo(webSites);

                System.out.println("\n");

                System.out.println("You also have these options: " + "4. Go Back " + "5. Forward " + "6. Show Browsing History ");

                System.out.println("\n");

                Scanner scan = new Scanner(System.in);

                String input = scan.nextLine();

                if (input != null && !input.equals("") && (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5") || input.equals("6") )) {

                    if (input.equals("1") && !webSites.empty()) {

                        if (webSites.size() > Integer.parseInt(input) - 1 && webSites.get(Integer.parseInt(input) - 1) != null) {
                            System.out.println(webSites.get(Integer.parseInt(input) - 1).content);

                            userHistory.push(webSites.get(Integer.parseInt(input) - 1));
                            System.out.println("\n");
                        } else {
                            System.out.println("Such page does not exist! ");
                            System.out.println("\n");
                        }
                    } else if (input.equals("2") && !webSites.empty()) {

                        if (webSites.size() > Integer.parseInt(input) - 1 && webSites.get(Integer.parseInt(input) - 1) != null) {
                            System.out.println(webSites.get(Integer.parseInt(input) - 1).content);

                            userHistory.push(webSites.get(Integer.parseInt(input) - 1));
                            System.out.println("\n");
                        } else {
                            System.out.println("Such page does not exist! ");
                            System.out.println("\n");
                        }
                    } else if (input.equals("3") && !webSites.empty()) {

                        if (webSites.size() > Integer.parseInt(input) - 1 && webSites.get(Integer.parseInt(input) - 1) != null) {
                            System.out.println(webSites.get(Integer.parseInt(input) - 1).content);
                            userHistory.push(webSites.get(Integer.parseInt(input) - 1));
                            System.out.println("\n");
                        } else {
                            System.out.println("Such page does not exist! ");
                            System.out.println("\n");
                        }
                    }

                    else if (input.equals("4") && !userHistory.empty()) {

                        userHistory.pop();
                        if(!userHistory.empty()) {
                            System.out.println(userHistory.peek().content);

                            System.out.println("\n");
                        }
                        else{
                            System.out.println("Error Occured. Please try again! ");
                        }

                        }


//                    else if (input.equals("5") && !webSites.empty()) {
//
//                        if (webSites.size() > Integer.parseInt(input) - 1 && webSites.get(Integer.parseInt(input) - 1) != null) {
//                            System.out.println(webSites.get(Integer.parseInt(input) - 1).content);
//                            System.out.println("\n");
//                        } else {
//                            System.out.println("Such page does not exist! ");
//                            System.out.println("\n");
//                        }
//                    }

                    else if(input.equals("6") && !userHistory.empty()){

                        showHistory(userHistory);

                    }

                    else if(input.equals("4") && userHistory.empty()){

                        System.out.println("Going back is not an option at this point. Please try again! \n");
                        continue;
                    }

//                    else if(input.equals("5") && webSites.empty()){
//
//                        System.out.println("Going forward is not an option at this point. Please try again! \n");
//                        continue;
//                    }


                    else if(input.equals("6") && userHistory.empty()){

                        System.out.println("We cannot show history at this moment! \n");
                        continue;
                    }

                    else{
                        System.out.println("Invalid option at this point. Please try again! \n");
                        continue;
                    }

                }

                else if (input != null && input.equalsIgnoreCase("Exit")) {

                    System.out.println("Program is closing. Good Bye! ");
                    System.out.println("\n");
                    System.exit(0);
                } else {
                    System.out.println("Invalid response. Please try again!: ");
                    System.out.println("\n");
                    continue;
                }
            }

            counter++;
        }
        while(true);

    }

    public static void generateWebsite(Stack<Page> webSites){


        webSites.push(new Page("About US","We are Aaron's!"));
        webSites.push(new Page("People","Aaron - CEO, Kevin - Programmer, Jake - Salesman"));
        webSites.push(new Page("Contact us","Please give us a call at: 678-111-2222! "));

    }

    public static void printInfo(Stack<Page> webSites){

        for(int i =0; i<3; i++){

            int page = i+1;
            System.out.println(  "page "+ page + " is " +  webSites.get(i).title  );
        }
    }

    public static void showHistory(Stack<Page> history){

        System.out.println("Displaying your broswing history!: ");
        for(int i =0; i<history.size(); i++){

            int page = i+1;
            System.out.println(  "page "+ page + " is " +  history.get(i).content  );
        }

        System.out.println(" \n");
    }

}
