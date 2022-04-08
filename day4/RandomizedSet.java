package day4;
import java.util.*;

    class RandomizedSet {
        Map<Integer,Integer> hold;
        List<Integer> list;

        public RandomizedSet() {
            hold = new HashMap<>();
            list = new ArrayList<>();
        }

        public boolean insert(int val) {
            if(hold.containsKey(val)== true) return false;

            System.out.print(list.size() + "--");
            hold.put(val , list.size());
            list.add(val);
            return true;

        }

        public boolean remove(int val) {

            if(hold.containsKey(val) == false) {  return false;}

            int st = hold.get(val);
            hold.remove(val);
            if(st == list.size()-1){
                list.remove(st);


                return true;
            }

            list.set(st , list.get(list.size()-1));


            list.remove(list.size()-1);

            hold.put(list.get(st),st);

            return true;

        }

        public int getRandom() {
            Random random = new Random();
            int v =random.nextInt(list.size());

            return list.get(v);
        }
    }

