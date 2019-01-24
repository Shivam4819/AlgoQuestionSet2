/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;
import java.util.Arrays;
/**
 *
 * @author shivam
 */
public class NbyKElements {
    public void findElements(){
        int arr[]={3,1,2,2,1,2,3,3};
        int k=4,n=arr.length;
        int res=n/k,var,count=0;
        Arrays.sort(arr);
        var=arr[0];
        for(int i=0;i<arr.length;i++){
            
            if(var==arr[i]){
                count++;
                if(count>res){
                    System.out.print(arr[i]+",");
                    count=0;
                }
            }
            else if(var<arr[i]){
                var=arr[i];
                count++;
            }
        }
        System.out.println("");
    }
    
}
