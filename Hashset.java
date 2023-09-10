import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[]args){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);                       // To add elements in Hashset
        set.add(2);
        set.add(3);

        if(set.contains(2)){     // To check if hashset conntains element
            System.out.println("Set contains 2");
        }

        System.out.println(set); // to print entire set

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
    
}
