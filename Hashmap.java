import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();// new HashMap<>(size=17,load factor= 0.5)
        map.put(1,"Neha");
        map.put(2,"heer");
        map.put(56,"forum");
        map.put(69,"pranjal");
        map.put(3,"mansi");
        //these wouldnt be stored in an order. so u might get order different while iterating
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.containsKey(2));

        //for iteration we have to use sets or convert it in sets to do that

        //Set<data type> variable = map.method();
        Set<Integer> keys = map.keySet();//basically list of keys
        for(int i: keys){
            System.out.println(i + ":"+map.get(i));
        }
        //another way to iterate if we need both key and values
        Set<Map.Entry<Integer,String>> entries= map.entrySet();
        //cant use int i in loop as the data type isnt same in map entry
        //data type is:<Map.Entry<Integer,String>
        for(Map.Entry<Integer,String> entry: entries){
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        String remove = map.remove(1);
        boolean res = map.remove(56, "jainil"); //tries to remove a key pair with such values
        System.out.println("removed ? "+ res);
        //Working of hashmap
        //using the key, hash function gives a hashcode which points to an index in the array
        //incase of collision where two inputs give same hashcode , it uses linked list.
        //till the 8th collision O(n) after that a balanced tress is created O(log n)

        //Resizing
        //resizing of hashmap by default it has 16 size and load factor=0.75
        //incase after arary is full the size gets increase till previous size*load factor(16*0.75)
    }
}