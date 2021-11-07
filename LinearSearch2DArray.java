import java.io.*;
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
  int arr[][] = {
      {14,16,17,18},
      {21,23,29,27},
      {30,35,38,37},
      {41,49,43,42}
  };
  int target = 37;
    
     int ans[] = LinearSearch2DArray(arr,target);
      System.out.println(Arrays.toString(ans));
    }
    static int[] LinearSearch2DArray (int arr[][],int target){
        for(int i = 0;i<arr.length;i++){
         for(int j = 0;j<arr[i].length;j++){
             if(arr[i][j] ==  target){
                 return new int []{i,j};
             }
         }
        }
        return new int[]{-1,-1};
    }
}