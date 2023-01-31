import java.sql.Array;
import java.util.ArrayList;

public class CatRunner {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat meowth = new Cat("Meowth");
        Cat mew = new Cat("Mew");
        Cat mewtwo = new Cat("Mewtwo");
        cats.add(meowth);
        cats.add(mew);
        cats.add(mewtwo);

        System.out.println(cats);

        Cat cat4 = new Cat("Roxy");
        Cat replaced = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(replaced);

        cat4.setName(cat4.getName() + " Meow");
        System.out.println(cats);

        for (int i = 0; i < cats.size(); i++){
            cats.get(i).setName(cats.get(i).getName().toUpperCase());
        }
        System.out.println(cats);

        cats.add(new Cat("SAM"));
        System.out.println(cats);
    }
}
