// Print Elements which are greater than or equal to all it's right elements
import java.util.*;
  import java.io.*;
  
  public class MyClass {
    public static void main(String args[]) throws IOException {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
          arr[i] = sc.nextInt();
        }
       int max = arr[n-1];
       for(int i = n-1;i>=0;i--){
         if(arr[i]>=max){
           max = arr[i];
           System.out.print(arr[i] + " ");
         }
       }
         System.out.println();
      }
     
    }
  }