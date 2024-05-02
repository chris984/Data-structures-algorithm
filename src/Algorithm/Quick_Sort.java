package Algorithm;

import java.util.Random;


public class Quick_Sort {
    
    static void QuickSort(int arr[], int left, int right){
    
        int l = left; // 0
        int r = right - 1; // length - 1 => 9
        int size = right - left; // => 9
        if(size > 1){
            Random rn = new Random();
            int pivot = arr[rn.nextInt(size) + l];
            while(l < r){
                    
                while(arr[r] > pivot && r > l){
                       r--;
                }
                while(arr[l] < pivot && l <= r){
                       l++;
                
                
                }
                if(l < r){
                    int temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                
                }
            
            
            } 
            
            QuickSort(arr, left, l);
            QuickSort(arr, r, right);
            
        }
    
    
    
    
    
    }
    
    public static void main(String[] args){
    
        int arr[] = {10, 54, 63, 6, 420, 11, 41, 32, 17, 22};
    
        QuickSort(arr, 0, arr.length);
        
        
        
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
        }
    
    
    
    
    }
    
}
