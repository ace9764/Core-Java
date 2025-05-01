import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


class Animal {

    public Animal(){

    }

    public Animal(String name, boolean isDog){

        this.name = name;
        this.isDog=isDog;
    }

    public String name ;

    public boolean isDog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDog() {
        return isDog;
    }

    public void setDog(boolean dog) {
        isDog = dog;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", isDog=" + isDog +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {



//        String x ="hello";
//
//        BigDecimal i = new BigDecimal(1.00);
//
//
//        List ab = new ArrayList<String>();
//
//        Animal a = new Animal("Aaron", true);
//
//        System.out.println("Before an update of animal: "+ a);
//
//        Animal updateA = new Animal();
//
//        updateA.setName("Bill");
//
//        System.out.println("Update to this new Animal! : "+ updateA);
//
//        if(updateA.getName() != null){
//
//            a.setName(updateA.getName());
//        }
//
//        a.setDog(updateA.isDog());
//
//        System.out.println("After an update of animal: "+ a);

        int i = (int) (Math.random() *10) +1;

        String chefIdString = "Aaron" + i;

        System.out.println(chefIdString);


//        Optional<Integer> op
//                = Optional.empty();
//
//        if(op.isPresent()){
//            System.out.println("not empty!");
//        }else{
//            System.out.println("empty! " + op);
//        }
    }
}

class Bird {

    public static Animal animal = new Animal();

}