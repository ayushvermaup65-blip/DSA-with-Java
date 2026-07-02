package JavaCollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    static void main(String[] args) {

        Map<String, String> mapping = new HashMap<>();


        // Insertion -> put(K,V)
        mapping.put("in", "India");
//        mapping.put("in", "India2");
        mapping.put("en", "England");
        mapping.put("us", "United States");

        System.out.println(mapping);

        Map<String, String> table = new HashMap<>();
        table.put("br", "Brazil");


        // putAll() -> to insert old table to new table
        System.out.println("Before: " + table);
        table.putAll(mapping);
        System.out.println("After: " + table);



        // Remove(K)
        table.remove("en");
        System.out.println(table);



        // size()
//        System.out.println(table.size());
//        table.clear();
//        System.out.println(table.size());


        //putIfAbsent(K,V) -> Inserts the association if the key K is not already associated with the value V.
//        table.putIfAbsent("is", "India");
//        System.out.println(table);


        // get(K) -> Returns the value associated with the specified key K. If the key in not found, it returns null.
//        System.out.println(table.get("br"));


        // getOrDefault(K, defaultValue) -> Returns the value associated with the specified key K. If the key is not found, it returns the defaultValue.
//        System.out.println(table.getOrDefault("us", "None"));


        // containsKey(K)
        System.out.println(table.containsKey("in"));



        // containsValue(V)
        System.out.println(table.containsValue("Australia"));
    }
}
