package com.aaron.core.java.serilization;

import java.io.*;

public class UserCredentials implements Serializable {

    private String id;

    private transient String password;

    private final transient int pinCode = 1234;

    static final String organizationId = "EB-US";

    public UserCredentials(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String toString(){
        return this.id + " " +this.password +" " + this.organizationId +" " +this.pinCode;
    }


    public static void main(String args[]) throws Exception {

        UserCredentials userCredentials1 = new UserCredentials("apark", "12345");

        FileOutputStream fileOutputStream = new FileOutputStream("Credentials.ser");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(userCredentials1);


        FileInputStream fileInputStream = new FileInputStream("Credentials.ser");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        UserCredentials userCredentialsResponse = (UserCredentials) objectInputStream.readObject();

        System.out.println("Response from merkle: "+userCredentialsResponse );

        //System.out.println(userCredentials1.organizationId);

    }

}
