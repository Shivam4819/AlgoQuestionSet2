/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author shivam
 */
public class AlmostSorted {
    public void findElement(){
        int arr[]={3, 2, 10, 4, 40};
        int element=4;
        
        for(int i=0;i<arr.length;i++){
            if(element==arr[i]){
                System.out.println("element found at index->"+i);
                break;
            }
        }
        System.out.println("method 2->");
        int n=arr.length;
        System.out.println(method2(arr, 0, n-1, element));
    }
    
    public int method2(int arr[],int low,int high,int x){
        
        if(high>=low){
            int mid=(low+high)/2;

            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid+1]==x){
                return mid+1;
            }
            else if(arr[mid-1]==x)
                return mid-1;

            if(arr[mid]>x){
                return method2(arr, low, mid-2, x);
            }
            else
                return method2(arr, mid+2, high, x);
        }
        return -1;
    }
}
