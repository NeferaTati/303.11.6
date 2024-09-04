import java.util.HashMap;
import java.util.Comparator;
public class ExampleOneHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        languages.put(4, "C Sharp");

        System.out.println("HashMap: " + languages);
     HashMap;

        class Example1HashMap {
            public static void main(String[] args) {

                HashMap<Integer, String> languages = new HashMap<>();
                languages.put(1, "Java");
                languages.put(2, "Python");
                languages.put(3, "JavaScript");
                languages.put(4, "C Sharp");

                System.out.println("HashMap: " + languages);

                // remove element associated with key 2
                String value = languages.remove(2);
                System.out.println("Removed value: " + value);
                System.out.println("Updated HashMap: " + languages);
            }

            public static class CustomComparator implements Comparator<String> {

                @Override
                public int compare(String number1, String number2) {
                    int value =  number1.compareTo(number2);
                    if (value > 0) {
                        return -1;
                    }
                    else if (value < 0) {
                        return 1;
                    }
                    else {
                        return 0;
                    }
                }
            }

                }



