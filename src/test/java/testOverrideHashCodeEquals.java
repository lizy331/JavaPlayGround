import java.util.HashSet;
import java.util.Set;


public class testOverrideHashCodeEquals {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();
        set.add(new Person(12,"li"));
        set.add(new Person(14,"liu"));
        set.add(new Person(12,"li"));
        set.add(new Person(14,"liu"));

        set.forEach(per -> {
            System.out.println(per);
        });
    }
}
