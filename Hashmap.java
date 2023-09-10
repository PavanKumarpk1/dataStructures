import java.util.HashMap;
import java.util.Map;;

public class Hashmap {
    public static void main(String []args){
        HashMap<String,Integer> map = new HashMap<>();//Creating hashmap
        map.put("Pavan", 5);               //adding element
        map.put("Kumar", 4);
        map.put("P", 3);

        if(map.containsKey("Pavan")){ //checking if certain key exists
            System.out.println("Pavan key exists");
        }

        System.out.println(map);    //Printing entire map

        System.out.println(map.get("Pavan"));//to get one element

        for(Map.Entry<String,Integer> e : map.entrySet()){      //Iterate to print each key and its value
            System.out.println(e.getKey() + " "+ e.getValue());     //one at a time
        }




    }
     
}
