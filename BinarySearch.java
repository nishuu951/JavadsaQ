// Binary Search 

import java.io.*;
import java.util.*;
public class BinarySearch {
    public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int arr[] =  new int[n];
   for(int i = 0;i<n;i++){
       arr[i] = sc.nextInt();
   }
   int d = sc.nextInt();
   int l = 0;
   int h = arr.length-1;
   int mid;
   while(l<=h){
      mid = (l + h)/2;
      
      if(arr[mid] == d){
          System.out.println(mid);
          return ;
      }
      else if(arr[mid] >d){
         h = mid-1;
      }
      else{
          l = mid +1;
      }
   }
   System.out.println(-1);
    }
}