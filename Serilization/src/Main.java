import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String accountNumber = "9800108390359353";

        System.out.println(accountNumber.replaceAll("\\d","*"));

        HashMap<String,Object> testMap = new HashMap<String,Object>();

        if(testMap !=null)
            System.out.println("testMap is not null! "+ testMap);
    }
}