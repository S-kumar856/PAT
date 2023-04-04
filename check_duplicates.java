import java.util.*;
// import java.util.Collections;

class check_duplicates {

    public static void main(String[] args) {
        List<String> li=new ArrayList<String>();
        li.add("mango");
        li.add("apple");
        li.add("orange");
        li.add("banana");
        li.add("graps");
        // for(String arr:li)
        Collections.sort(li);
        for(String arr:li)
        System.out.println(arr);

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(5);
        list1.add(3);
        list1.add(4);
        list1.add(2);

        Collections.sort(li);
        for (Integer num:list1)
        System.out.println(num);


    }

    
}
