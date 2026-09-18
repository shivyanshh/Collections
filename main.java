import java.util.*;
public class main {
    public static void main(String[] args) {
        System.out.println("hii");
        int[] arr = new int[5]; // fixed size
        List<Integer> list = new ArrayList<>(11);
        list.add(90);
        list.add(20);
        list.add(70);
        list.add(30);
        list.add(40);
        list.add(60);
        list.add(10);
        list.add(10);
        

//        System.out.println(list.get(1));
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        for(int x: list){
//            System.out.println(x);
//        }list.add(50.2);
        System.out.println("list size before removing " + list.size());
        list.remove(2);
        list.remove(2);
        list.remove(2);
        System.out.println("list size after removing "+ list.size());
        System.out.println(list.size());
        //list.trimToSize();
        //size can be known
        //capacity(default=10) cant be known through methods or any way.

        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.getClass().getName());   //ArrayList
        //Extra
        //Array
        List<String> list1 = Arrays.asList("Monday","Tuesday");
        System.out.println(list1.getClass().getName());  //Arrays$ArrayList
        list1.set(1,"Wednesday");                        //it doesnt have add method like in ArrayList
        System.out.println(list1);
        //only can swap/replace in index position.


        String[] array ={"Apple","Banana","Cherry"};
        //List<String> list2 = Arrays.asList(array);
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2.getClass().getName()); //Arrays$ArrayList
        //only can swap/replace in index position
    }
}