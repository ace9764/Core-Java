package core.aaron.java.mocktest;
import java.util.*;
public class MockTest4 {


    public static void main(String args[]) {


        try {
            Map <String,Object> testMap = new HashMap<String,Object> ();

            testMap.get("test").toString();
        }

        catch(NullPointerException ne ) {

            System.out.println("NullPointerException happened " + ne);
            throw new RuntimeException("Method was called on null" ,new Throwable("Null PointerException ") );
        }

    }
}
