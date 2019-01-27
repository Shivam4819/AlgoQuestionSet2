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
public class KClosestElements {
    public void kClosest(){
        int arr[]={12, 16, 22, 30, 35, 39, 42,45, 48, 50, 53, 55, 56};
        int k=4,x=35,flag=0,j=0;
        int output[]=new int[k];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                output[0]=arr[i-1];
                flag=1;
                j=i+1;
                break;
            }
        }
        System.out.println("j="+j);
        int count=1;
        if(flag==1){
            while(count<k){
                output[count]=arr[j];
                j++;
                count++;
            }
        }
        for(int c=0;c<output.length;c++){
            System.out.println(output[c]);
        }
        
        int n=arr.length;
        method2(arr, 0, n-1, 4, 35);
    }
    
    public void method2(int arr[],int low,int high,int k,int x){
        
    }
}
