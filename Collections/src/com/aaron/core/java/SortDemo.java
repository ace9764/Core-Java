package com.aaron.core.java;

import java.io.File;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;



public class SortDemo {

//    public static <T> T getEntityFromObject(String message, Class<T> tClass) throws IOException
//    {
//        ObjectMapper mapper = new ObjectMapper();
//        T entity = mapper.readValue(message, tClass);
//        return entity;
//    }
//
//    public static <T> T mapObjectToType(Object obj, Class<T> tClass)
//    {
//        ObjectMapper mapper = new ObjectMapper();
//        T pojo = mapper.convertValue(obj, tClass);
//        return pojo;
//    }

    public static void main(String args[]) throws ParseException {

        Object a = null;


        String dateString = "2023-12-05T20:12:59.36";

        // Define the formatter for the given string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SS");

        // Parse the string to LocalDateTime
        LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);

        // Output the result
        System.out.println("Parsed LocalDateTime: " + dateTime);

//        File file = new File("C:\\Users\\apark\\Downloads\\FulfillmentList.json");
//
//        String fulfillmentList = FileUtils.readFileToString(file, StandardCharsets.UTF_8.name() );
//
//       List<Object> orderJson1 = JSONDTOTranslator.getEntityFromObject(fulfillmentList, List.class);
//
//       System.out.println("order JSON: "+ JSONDTOTranslator.getJsonString(orderJson1));


//        String[] stringArray =  { "Kevin","David", "Caroline", " Aaron"};

//        Arrays.sort(stringArray);
//
//        System.out.println(Arrays.toString(stringArray));
//
//        String k = "kevin";
//
//        String D= "David";

//        Arrays.sort(stringArray, new DescnedingOrder() );
//
//        System.out.println(Arrays.toString(stringArray));

//        String k = "kevin";
//
//        String D= "David";



//        Arrays.sort(stringArray, String.CASE_INSENSITIVE_ORDER);
//
//        System.out.println(Arrays.toString(stringArray));


     }

     static class DescnedingOrder implements Comparator{

         @Override
         public int compare(Object o1, Object o2) {

             if(o1 instanceof String && o2 instanceof String ){

                 String s1 = (String) o1;

                 String s2 = (String) o2;

                 return s1.compareTo(s2) *-1;

             }

             return 0;
         }
     }

}
