package core.aaron.java.mocktest;
import java.io.FileReader;
import java.io.IOException;

public class MockTest2 {

    public static void main(String args[]) {


        try(FileReader fileReader = new FileReader("test.txt")){

			fileReader.read();

        }
		catch(IOException fe){

            System.out.println("Exception occured for some reason " +fe);
        }

    }
}
