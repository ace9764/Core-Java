package com.aaron.core.java.externalization;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.*;

public class ExternalizationDemo implements Externalizable {

    public String name;

    public int age;

    public String title;

    public int noOfExperiences;

    public ExternalizationDemo()
    {

        System.out.println("No Arg Constructor Created");
    }
    public ExternalizationDemo(String name, int age, String title, int noOfExperiences)
    {
        this.name = name;
        this.age = age;
        this.title = title;
        this.noOfExperiences = noOfExperiences;
    }
    @Override
    public String toString()
    {
        return this.name +" "+this.age +" " +this.title +" "+this.noOfExperiences;
    }
    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException
    {
        objectOutput.writeObject(this.name);
        System.out.println("Write External -> After Serialize name ");
        objectOutput.writeInt(this.age);
        System.out.println("Write External -> After Serialize age ");
    }
    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException
    {
         this.name = (String) objectInput.readObject();
        System.out.println("Read External -> After DeSerialize name ");
         this.age = (int) objectInput.readInt();
        System.out.println("Read External -> After DeSerialize age ");
    }

    public static void main(String args[]) throws IOException,ClassNotFoundException{

        ExternalizationDemo externalizationDemo = new ExternalizationDemo("Aaron", 26, "Analyst",0);

        FileOutputStream fileOutputStream = new FileOutputStream("Employee.ser");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        System.out.println("Before Serialize");

        objectOutputStream.writeObject (externalizationDemo);

        System.out.println("After Serialize");

        FileInputStream fileInputStream = new FileInputStream("Employee.ser");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        System.out.println("Before DeSerialize");

        ExternalizationDemo externalizationDemo1 = (ExternalizationDemo) objectInputStream.readObject();

        System.out.println("After DeSerialize");

        System.out.println(externalizationDemo1.name);

        System.out.println(externalizationDemo1.age);


        System.out.println(externalizationDemo1);


        List<Object> listObj = new ArrayList<>();

        listObj.contains("");

    }
}
