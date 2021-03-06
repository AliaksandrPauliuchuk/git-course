package Package1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {


        List<String> list1 = new ArrayList<>();
        list1.add("name1");
        list1.add("name2");
        list1.add("name3");
        list1.add("name4");
        list1.add("name5");
        list1.add("name6");
        list1.add("name777");
        list1.add(3,"name8");
        System.out.println(list1);
        System.out.println(list1.get(3));
      list1.set(2,"name2222");
        System.out.println(list1);
        list1.remove(0);
        System.out.println(list1);
        String s = "madam!!";

        List<Character> charLinkedList = new LinkedList<>();
        for (char c:s.toCharArray()
             ) {
            charLinkedList.add(c);

        }
        System.out.println(charLinkedList);

        int[] arr1 = new int[5];
        arr1[2]= 5;
        System.out.println(arr1[2]);
    }
}
