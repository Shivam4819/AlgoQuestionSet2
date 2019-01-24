/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;
import java.util.Hashtable;
/**
 *
 * @author shivam
 */
public class FindAPair {
    public void findAPair(){
        int arr[]={5,20,3,2,50,80};
        int arr2[]={2,3,5,20,50,80};
        int n=78,sum,flag=0;
        for(int i=0;i<arr.length;i++){
            sum=arr[i]+n;
            for(int j=1;j<arr.length;j++){
                if(sum==arr[j]){
                    System.out.println("Pair found:("+arr[i]+","+arr[j]+")");
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("No such pair is found");
        }
    }
    
}
