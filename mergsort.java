// Merge Sort
//Using concept of divide- O(logn) and conquerO(n) Time comp = O(nlongn)
 
import java.util.Scanner;

public class mergsort{

    public static void conquer(int[] arr, int si, int mid, int ei){
        int merged[] = new int[ ei-si +1];
        int idx1 =si;       //Tracks first array
        int idx2 = mid+1;   // Tracks 2nd arraay
        int x = 0;          // To track merged array

        while(idx1 <= mid && idx2 <= ei){   //Compare 1st and 2nd array elements
            if(arr[idx1]<= arr[idx2]){
                merged[x++] = arr[ idx1++]; //If true, copy the element in new array-> merged array
            }
            else{
                merged[x++] = arr[ idx2++];
            }
        }
        while(idx1 <= mid){
            merged[ x++] = arr[idx1++];
        }
        while(idx2 <= ei){
            merged[ x++] = arr[idx2++];
        }

        for(int i=0, j= si; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei){
        if(si>= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        divide(arr, si ,mid);
        divide(arr, mid+1, ei);
        conquer(arr, si ,mid, ei);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int x = sc.nextInt();
        int[] a = new int[x];
        for(int i=0; i<x;i++){
            a[i] = sc.nextInt();
        }

        divide(a, 0, x-1);
        for(int i=0; i<x;i++){
            System.out.print(a[i] + " ");
        }

    }   
}