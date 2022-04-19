import java.util.Scanner;
import java.util.Arrays;

public class Main {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int array []= new int [10];

                for (int i=0; i<10; i++){
                        array[i]=Integer.parseInt(sc.nextLine());
                }
                int cont=0;
                Arrays.sort(array);
                int num = array[0];
                cont=0;
                for (int i = 0; i < 10; i++) {
                        if(num==array[i])
                                cont++;
                        else{
                                System.out.println(num + "-" + cont);
                                num=array[i];
                                cont=1;
                        }
                }

        }
}
