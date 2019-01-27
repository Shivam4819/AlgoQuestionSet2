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
public class Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FindAPair find=new FindAPair();
        //find.findAPair();
        
        System.out.println("ques2->");
        NbyKElements n=new NbyKElements();
       // n.findElements();
        
        System.out.println("ques3->");
        FirstRepeatingElement first=new FirstRepeatingElement();
       // first.findElement();
        
        System.out.println("ques4->");
        AlmostSorted sorted=new AlmostSorted();
       // sorted.findElement();
       
       KClosestElements k=new KClosestElements();
       //k.kClosest();
       
       BinaryArray binary=new BinaryArray();
       binary.findOne();
    }
    
}
