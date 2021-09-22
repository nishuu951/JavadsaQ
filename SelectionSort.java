// Selection Sort
import java.io.*;
import java.util.*;

public class SelectionSort {
    static void selection(int arr[],int n){
     
      for(int i = 0;i<n-1;i++){
          int mi = i;
          for(int j = i+1;j<n;j++){
              if(arr[j]<arr[mi]){
                  mi = j;
              }
          }
          swap(arr,mi,i);
      }
        
    }
    static void swap(int arr[],int i,int j){
        int temp;
        temp = arr[i];
        arr[i] =  arr[j];
        arr[j] = temp;
    }
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[]  = new int[n];
    for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    selection(arr,n);
    for(int l = 0;l<n;l++){
        System.out.println(arr[l]);
    }
    }
}