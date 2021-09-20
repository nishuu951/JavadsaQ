// Rotate an array to Left by k no's
import java.io.*;
import java.util.*;
public class RotateLeftArray {
    public static int[] rev(int arr[],int i,int j){
        int temp =  0;
        while(i<=j){
            temp = arr[i];
            arr[i] =  arr[j];
            arr[j] =  temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] =  sc.nextInt();
        }
      int k = sc.nextInt();
      rev(arr,0,k-1);
      rev(arr,k,n-1);
      rev(arr,0,n-1);
      for(int i = 0;i<n;i++){
          System.out.print(arr[i] + " ");
      }
    }
}