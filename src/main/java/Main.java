import java.util.HashMap;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
                Integer[] array = new Integer[10];
                Scanner sc = new Scanner(System.in);

                for (int i = 0; i < array.length; i++) {
                        array[i] = sc.nextInt();
                }
                System.out.println(contarRepeticiones(array));

        }

        public static String contarRepeticiones(Integer[] array) {

                HashMap<Integer, Integer> map = new HashMap<>();
                for (Integer num : array) {
                        if (map.containsKey(num)) {
                                Integer value = map.get(num);
                                value++;
                                map.replace(num, value);
                        } else {
                                map.put(num, 1);
                        }
                }
                return map.toString();

        }
}