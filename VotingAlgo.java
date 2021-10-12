// Moore's voting algorithm  
// Find the majority element in an array

import java.io.*;
import java.util.*;


public class MyClass {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[]= new int[n];
    for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int count = 1;
    int me = 0;
    for(int i = 1;i<n;i++){
       if(arr[me] == arr[i]){
           count++;
       } 
       else{
           count--;
       }
       
       if(count ==0 ){
           count =1;
           me = i;
       }
    }
    count = 0;
    for(int i = 0;i<n;i++){
        if(arr[me] == arr[i]){
            count++;
        }
    }
    if(count<=(n/2)){
        System.out.println(-1);
    }
    else{
        System.out.println(arr[me]);
    }
    
    }
}