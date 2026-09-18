import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetOverview{
    public static void main(String[] args){
        //set has no duplicate values
        //even while using key.set() in maps, keys are stored in set only as they dont have duplicate values
        //stores unordered values
        HashSet<Integer> set = new HashSet<>();
        //for ordered we can use
        //HashSet<Integer> set = new LinkedHashSet<>();
        set.add(76);
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(7);
        System.out.println(set);

        //thread safe incase if multiple user access the set, only one thread is given access to the set
        //so we use concurrentskiplistset
        ConcurrentSkipListSet<Integer> concurrentskiplistset = new ConcurrentSkipListSet<>();

        //this is same as copy on write arraylist and doesnt allow modifications while iterating
        CopyOnWriteArraySet<Integer> Copyonwriteset= new CopyOnWriteArraySet<>();

        //adding values
        for(int i=1;i<6;i++){
            Copyonwriteset.add(i);
            concurrentskiplistset.add(i);
        }
        System.out.println(Copyonwriteset);
        System.out.println(concurrentskiplistset);


        for(int x: Copyonwriteset){
            System.out.println(x);
            Copyonwriteset.add(6); //this will not be included while iterating
        }

        for(int y: concurrentskiplistset){
            System.out.println(y);
            concurrentskiplistset.add(6); //this will be included while iterating

            if(y==6){
                concurrentskiplistset.add(7); // this wont be included
            }
            //hence concurrentskiplist set is weakly consistent
        }

    }
}