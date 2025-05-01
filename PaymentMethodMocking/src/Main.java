import com.aaron.core.Java.CardType;
import com.aaron.core.Java.PaymentMethod;

public class Main {
    public static void main(String[] args) {


        PaymentMethod paymentMethod = new PaymentMethod();

        paymentMethod.setCardType(null);

        System.out.println(paymentMethod.getCardType()) ;



//        try {
//            paymentMethod.getCardType().getCardTypeId();
//        }
//        catch(NullPointerException ne){
//
//            throw new RuntimeException("Null Pointer", new Throwable("Null!"));
//        }

    }
}