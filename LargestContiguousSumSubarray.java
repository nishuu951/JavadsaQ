// Largest contiguous sum subarray
import java.io.*;
import java.util.*;


public class MyClass {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i<n;i++){
        arr[i] =  sc.nextInt();
    }
    
    int currmax = arr[0];
    int max = arr[0];
    for(int i = 1;i<n;i++){
      currmax += arr[i];
      if(currmax<0){
          currmax = 0;
      }
        if(currmax>max){
            max = currmax;
        }
    }
    
    System.out.println(max);
    }
}