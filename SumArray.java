// Addition of two array
import java.io.*;
import java.util.*;
public class SumArray{
    public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int arr1[] = new int[n1];
     for(int i = 0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        
      int n2 = sc.nextInt();
    int arr2[] = new int[n2];
    
         for(int i = 0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }
    
    int sum[] = new int[n1>n2 ? n1:n2];
    
    int i = n1-1;
    int j = n2-1;
    int k = sum.length-1;
     
    int carry = 0;
    int currsum;
    while(i>=0||j >=0){
        currsum = carry;
        if(i>=0){
            currsum += arr1[i];
        }
        if(j>=0){
            currsum+= arr2[j];
        }
        
        carry = currsum/10;
        sum[k] = currsum%10;
        i--;
        j--;
        k--;
    }
    if(carry>0){
        System.out.print(carry + " ");
    }
    for(int l= 0;l<sum.length;l++){
        System.out.print(sum[l] + " ");
    }
    }
}