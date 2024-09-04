import java.util.HashMap;
import java.util.TreeMap;

public class ExampletwoHashMap {
    public static void main(String[] args) {
        HashMap<String, String> newHashMap = new HashMap<>();
// Addition of key and value
        newHashMap.put("Key1", "Lenovo");
        newHashMap.put("Key2", "Motorola");
        newHashMap.put("Key3", "Nokia");
        newHashMap.put("Key4", null);
        newHashMap.put(null, "Sony");
        System.out.println("Original map contains:" + newHashMap);
//getting size of Hashmap
        System.out.println("Size of original Map is:" + newHashMap.size());
//copy contains of one Hashmap to another
        HashMap<String, String> copyHashMap = new HashMap<>();
        copyHashMap.putAll(newHashMap);
        System.out.println("copyHashMap mappings= " + copyHashMap);
//Removal of null key
        String nullKeyValue = copyHashMap.remove(null);
        System.out.println("copyHashMap null key value = " + nullKeyValue);
        System.out.println("copyHashMap after removing null key = " + copyHashMap);
        System.out.println("Size of copyHashMap is:" + copyHashMap.size());
    }
    public static class exampleTreemapTwo {
        public static void main(String[] args) {
            TreeMap<String, Integer> numbers = new TreeMap<>();
            numbers.put("First", 1);
            numbers.put("Second", 2);
            numbers.put("Third", 3);
            System.out.println("TreeMap: " + numbers);

            // Using the firstKey() method
            String firstKey = numbers.firstKey();
            System.out.println("First Key: " + firstKey);

        }

