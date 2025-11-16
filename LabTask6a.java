import java.util.Scanner;
    public class LabTask6a { 
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    
      System.out.print("Enter some integers : ");
      int num = sc.nextInt();
      int max = num;
      int index = 1;
      int count =1;
      for(; num!= 0;) {
         num = sc.nextInt();
         count++;
      if (num != 0 && num>max) {
         max = num;
         index = count;
        }
       }
       System.out.println("Maximum number is: " + index);
       sc.close();
    }
  }
        
      