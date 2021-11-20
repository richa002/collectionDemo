import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class ListDemo {
    public static void main(String[] args) {

int [] arr = new int[10];


        List<Integer> list = new ArrayList<>();


        list.add(1);


        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        Predicate p = o->(Integer)o>9;

        list.stream().filter(p).forEach(e-> System.out.println(e));


  //      list.add(2,4);
       // list.addAll(1,2,3);



        for(Integer i:list){
            System.out.println( list.get(0));
        }


        System.out.println( list.indexOf(4));

        list.subList(2,4);
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


        // Integer integer = list.get(0);



    }


    public void demo(){


      PredicateDemo d = new PredicateDemo() {
          @Override
          public boolean test(Integer o) {
              return o>8;
          }
      };

        PredicateDemo predicateDemo = o->  o>3;
    }

 interface   PredicateDemo{
         boolean test(Integer o);

 }


}
