import java.util.Scanner;

public class FizzBuzzClass {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        for(int i = 1; i <= 100; i++) {
            if (((i % 5) == 0) && ((i % 3) == 0))
                System.out.println("fizzbuzz");
            else if ((i % 5) == 0)
                System.out.println("buzz");
            else if ((i % 3) == 0)
                System.out.println("fizz");
            else System.out.println(i);
          }
        System.out.println();
    }


}

