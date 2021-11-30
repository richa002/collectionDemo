import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");
        Set<   Map.Entry<Integer, String>   > entries = map.entrySet();
       // map.
        for(Map.Entry<Integer,String> entry: entries){
            System.out.println(entry.getKey());
        }

    }

}
