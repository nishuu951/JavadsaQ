// Unordered Linear Search 

import java.io.*;
import java.util.*;
public class UoLinearSearch {
    public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int arr[] =  new int[n];
   for(int i = 0;i<n;i++){
       arr[i] = sc.nextInt();
   }
   int d = sc.nextInt();
   int count = 0;
   for(int i = 0;i<n;i++){
       if(arr[i] == d){
           System.out.println(i);
           count++;
           break;
       }
   }
   if(count == 0){
       System.out.println(-1);
   }
    }
}