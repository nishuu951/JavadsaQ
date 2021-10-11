// Segregate odd and even numbers in a given array

import java.io.*;
import java.util.*;
public class MyClass {
    static void swap(int arr[],int left,int right){
        int temp;
        temp = arr[left];
        arr[left] =  arr[right];
        arr[right] =  temp;
    }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0;i<n;i++){
          arr[i] = sc.nextInt();
      }
      int left = 0;
      int right = n-1;
      while(left<right){
          if(arr[left]%2 == 0){
              left++;
          }
          else{
              while(arr[right]%2!=0){
                  right--;
              }
              if(left>=right){
                  break;
              }
              else{
                  swap(arr,left,right);
              }
              
          }
      }
      for(int i = 0;i<n;i++){
          System.out.print(arr[i] + " ");
      }
    }
}