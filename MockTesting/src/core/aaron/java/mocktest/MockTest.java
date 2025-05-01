package core.aaron.java.mocktest;

import java.io.FileReader;
import java.io.IOException;

public class MockTest {


    public static void main (String args[]){


        FileReader fileReader = null;

        try {
            fileReader = new FileReader("test.txt");

            fileReader.read();
        }

        catch(IOException ie){
            System.out.println("Io Exception Happend! ");
        }

        finally{

            if(fileReader != null){
                try{
                    fileReader.close();
                }
                catch(IOException fe){
                    System.out.println("Exception occured during closing the resource! " + fe);
                }
            }
        }


    }

}
