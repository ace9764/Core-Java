package core.aaron.java.mocktest;

public class MockTest3 {

    public static void main(String args[]) {


        try
        {
            int i = 5/0;
        }

        catch(ArithmeticException ae)
        {
            System.out.println("Exception occured during calculation " + ae.getCause() +" " +ae.getMessage());
        }

    }
}
