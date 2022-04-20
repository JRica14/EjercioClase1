import java.util.HashMap;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
                Integer[] arrayNum = new Integer[10];
                Scanner sc = new Scanner(System.in);

                for (int i = 0; i < arrayNum.length; i++) {
                        arrayNum[i] = sc.nextInt();
                }
                System.out.println(contarRepeticiones(arrayNum));

        }

        public static String contarRepeticiones(Integer[] arrayNum) {

                HashMap<Integer, Integer> map = new HashMap<>();
                for (Integer num : arrayNum) {
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