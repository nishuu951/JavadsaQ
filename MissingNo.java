// Find missing no in range from 1 to n in an unsorted array

import java.io.*;
import java.util.*;

 public class MissingNo{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sumarr = 0;
        for(int i = 0;i<n;i++){
            sumarr += arr[i];
        }
        n++;
        int nsum =( n*(n+1))/2;
        System.out.println(nsum-sumarr);
    }
}