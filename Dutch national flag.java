// Sort 0,1&2(Dutch national flag algo)

import java.io.*;
import java.util.*;

public class MyClass{
    static void swap(int arr[],int l,int h){
        int temp;
        temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int low,mid,high;
        low = mid = 0;
        high = n-1;
        while(mid<=high){
            switch(arr[mid]){
                case 0:
                    if(arr[low]!=arr[mid]){
                        swap(arr,low,mid);
                    }
                    low++;
                    mid++;
                    break;
                    
                case 1:
                    mid++;
                    break;
                case 2:
                    if(arr[mid]!=arr[high]){
                        swap(arr,mid,high);
                    }
                    high--;
            }
            
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}