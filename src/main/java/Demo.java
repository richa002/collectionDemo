import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        String s = "A";
        System.out.println(s.compareTo("B"));
        System.out.println(list.size());
        for(int i=1;i<=11;i++){
            list.add(i);
        }
        System.out.println(list);
    }
}
