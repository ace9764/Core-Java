package com.aaron.core.java.serilization;



import java.math.BigInteger;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class Main {

    public static void main(String args[]) throws NoSuchAlgorithmException{


        StringBuilder query = new StringBuilder();

        query.append("ShipFromLocationId = ");
        query.append("'");
        query.append("1044");

        query.append("'");

        query.append(" AND ");

        query.append("OrgId = ");
        query.append("'");
        query.append("michaels-stage-us");
        query.append("'");

        query.append(" AND ");

        query.append(" FulfillmentLine.OrgId = ");
        query.append("'");
        query.append("michaels-stage-us");
        query.append("'");

        query.append(" AND ");

        query.append(" (FulfillmentLine.ItemId = ");
        query.append("'");
        query.append("10111193");
        query.append("'");


        query.append(" OR FulfillmentLine.UPC = ");
        query.append("'");
        query.append("10111193");
        query.append("' ) ");

        System.out.println(query);

//        String credentials = "E3D78ZAUNLA80UAM" + ":"
//                + "I6SmDY5cYdcesO4y1cC4Nqf6PoSuNWik";
//        String base64Credentials = new String(new Base64().encode(credentials.getBytes()));



        Animal x = new Animal();

        x.getDogList().clear();

        x.getDogList().add(new Dog("Test"));

        System.out.println("list of dog objects:"+ x.getDogList());

        System.out.println("dog object:"+ x.getDogList().get(0));



        System.out.println("uuid generated: "+UUID.randomUUID() + Calendar.getInstance().getTimeInMillis());

        Long orderedQty = 12L;

        Double pickedQty = 12.0;

        System.out.println("0? same? "+ Long.compare(orderedQty,pickedQty.longValue()));

        if(Long.compare(orderedQty,pickedQty.longValue()) ==0){
            System.out.println("0? same? "+ Long.compare(orderedQty,pickedQty.longValue()));
        }

        String test = "";

        System.out.println("length: "+ test.length() );

        Map<String,Object> testMap = new HashMap<>();

        testMap.put("test", false);

        if( Boolean.valueOf(testMap.get("test").toString()) ) {
            System.out.println("Value is: "+ testMap.get("test"));
        }

        List<String> stringList = new ArrayList<String>();

        System.out.println(stringList);

        if(stringList != null && !stringList.isEmpty()){
            System.out.println("null");
        }

        String[] tokenShopperRefence = "12345".split("@@");

        for(String token: tokenShopperRefence) {

            System.out.println("tokenShopperRefence 1 " + token);
        }

        Map<String,Object> fulfillmentLineShorts = new HashMap<String,Object>();

//        int shortQty = Integer.valueOf(null);

        StringBuilder mkey = new StringBuilder();
        mkey.append("ri7vm6mxifcxjkw9uyjnd8qp7av8sontgzf26naq" + "MTQ" + ",");
        mkey.append("A1" + "1141" + ",");
        mkey.append("TTActivateVirtualGift" +",");
        mkey.append("TGMICHAELSEGIFT" + ",");
        mkey.append("NN" + System.currentTimeMillis() / 1000L);

        System.out.println(mkey);

        System.out.println(getSHA256String(mkey));

        System.out.println(getSHA384String(mkey));
    }

    public static String getSHA256String(StringBuilder requestString) throws NoSuchAlgorithmException
    {
        MessageDigest digest;
        StringBuilder hashText = new StringBuilder();
        try
        {
            digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(requestString.toString().getBytes(StandardCharsets.UTF_8));
            BigInteger number = new BigInteger(1, hash);
            hashText.append(number.toString(16));
            while (hashText.length() < 64)
            {
                hashText.insert(0, "0");
            }
        }
        catch (NoSuchAlgorithmException e)
        {
            System.out.println("Error occured while generating getSHA256String");
            throw e;
        }

        return hashText.toString();
    }

    public static String getSHA384String(StringBuilder requestString) throws NoSuchAlgorithmException
    {
        MessageDigest digest;
        StringBuilder hashText = new StringBuilder();
        try
        {
            digest = MessageDigest.getInstance("SHA-384");
            byte[] hash = digest.digest(requestString.toString().getBytes(StandardCharsets.UTF_8));
            BigInteger number = new BigInteger(1, hash);
            hashText.append(number.toString(16));
            while (hashText.length() < 64)
            {
                hashText.insert(0, "0");
            }
        }
        catch (NoSuchAlgorithmException e)
        {
            System.out.println("Error occured while generating getSHA256String");
            throw e;
        }

        return hashText.toString();
    }

}
