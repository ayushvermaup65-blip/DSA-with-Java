package JavaCollectionFramework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main (String[] args) {
//        // List or Collection =-> interfaces
//
//        // ArrayList-> concrete class
//        java.util.ArrayList<Integer> list = new ArrayList<>(); // ise niche wale dono tarike se likh sakte hai
//
////                 or
////        List<Integer> list = new ArrayList<>();
//
////                 or
////        Collection<Integer> collection = new ArrayList<>();
//
//
//        // add()
//        list.add(10);
//        list.add(20);
//        list.add(30);
////        System.out.println(list);
//        list.add(40);
////        System.out.println(list);
//
//        // remove()
//        list.remove(0);
////        System.out.println(list);
//
//        // addAll
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(101);
//        list2.add(102);
//        list2.add(20);
//
//        list.addAll(list2);
////        System.out.println(list);
//
//        // removeAll
//        list.removeAll(list2);
////        System.out.println(list);
//
//        // size()
////        System.out.println(list.size());
////        System.out.println("Printing list2 : " + list2);
//
//        // clear
//        list2.clear();
////        System.out.println(list2.size());
//
//        // iterator() -> I want to traverse the list using iterator
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
////            System.out.println("Element: " + iterator.next());
//        }

        // get()
        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(14);
        System.out.println(list3.get(1));
        System.out.println("before list: " + list3);


        // set()
        list3.set(0,100);
        System.out.println("after list: " + list3);

        // toArray()
        Object[] arr = list3.toArray();
        for(Object obj: arr) {
            System.out.println(obj);
        }

        // contains()
        System.out.println(list3.contains(100));
     }
}