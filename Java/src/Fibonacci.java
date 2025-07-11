import java.util.Scanner;

public class Fibonacci {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the term number (n): ");
  int n = sc.nextInt();

  int a = 0, b = 1, next = 0;

  if (n == 1) {
   System.out.println("The " + n + "th Fibonacci term is: " + a);
  } else if (n == 2) {
   System.out.println("The " + n + "th Fibonacci term is: " + b);
  } else {
   for (int i = 3; i <= n; i++) {
    next = a + b;
    a = b;
    b = next;
   }
   System.out.println("The " + n + "th Fibonacci term is: " + next);
  }
 }
}




