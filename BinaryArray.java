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
public class BinaryArray {
    public void findOne(){
        int arr[]={1,1,0,0,0,0,0};
        int count=1,element=1,flag=0;
        for(int i=1;i<arr.length;i++){
            if(element==arr[i]){
                count++;
                flag=1;
            }
            else if(element>arr[i]){
               break;
            }       
        }
        if(flag==0)
            count=0;
        System.out.println("count->"+count);
    }
}
