import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

     //   Wrapper classes, String




        Person p1 = new Person("richa");
        Person p2 = new Person("luthra");

        Set<Person> ss = new TreeSet<>((e1,e2)->e1.getName().compareTo(e2.getName()));
        ss.add(p1);
        ss.add(p2);
        System.out.println(ss);



        Set<Person> set = new HashSet<>();

        set.add(p1);
        set.add(p2);
        System.out.println(set);

//      //  p1.equals(p2);
//
//
//       // System.out.println(p.hashCode());
//        System.out.println("richa".hashCode());
//
//        Integer i = 2;
//        Integer i1= 2;
//
//        System.out.println(i.hashCode());
//        Set<Integer> set = new HashSet<>(20);
//        System.out.println(set.hashCode());
//        System.out.println(set.add(34));
//        set.add(64);
//        set.add(1);
//        System.out.println(set.add(1));
//        System.out.println(set);
    }
}
class Person implements Comparable<Person>{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public Person(String name) {
        this.name = name;
    }



    @Override
    public int compareTo(Person o) {

       // return o.getAge() -this.getAge();
        return o.name.compareTo(this.name);
    }
}