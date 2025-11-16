import java.util.Scanner;
    public class LabTask6b {
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a seq of integers(end with 0): ");
      int num = sc.nextInt();
      int countEven = 0;

      for(;num!=0;) {
        if (num % 2 == 0) {
           countEven++;
         }
        num = sc.nextInt();
       }
      System.out.println("Number of even elements: " + countEven);
      sc.close();
    }
  }