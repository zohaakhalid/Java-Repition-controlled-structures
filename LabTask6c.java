import java.util.Scanner;
    public class LabTask6c {
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a sequence of integers(end with0): ");
      int count = 0;
      int prev = sc.nextInt();
      int num = sc.nextInt();
 
      while(num!=0) {
         if (num > prev) {
            count++;
         }
        prev = num;
        num = sc.nextInt();
      }
     System.out.println("Number of elements greater than the previous one: " + count);
      sc.close();
    }
   }