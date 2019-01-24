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
public class FirstRepeatingElement {
    
    public void findElement(){
        int arr[]={6, 10, 5, 4, 9, 120, 4, 6, 10};
       // int arr2[]={3,3,4,5,5,6,10};
       int element,flag=0;
       for(int i=0;i<arr.length;i++){
           element=arr[i];
           for(int j=1;j<arr.length;j++){
                if(element==arr[j]){
                    System.out.println("first element->"+element);
                    flag=1;
                    break;
                }
           }
           if(flag==1)
               break;
       }
    }
}
