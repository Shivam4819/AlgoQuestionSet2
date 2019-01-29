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
public class SumIsClosest {
    public void findPair(){
        int arr[]={10, 22, 28, 29, 30, 40};
        int x=54,diff=0,var1,var2;
        
        for(int i=0;i<arr.length;i++){
            var1=arr[i];
            for(int j=0;j<arr.length;j++){
                var2=arr[j];
                diff=var1+var2-x;
                
            }
        }
    }
}
