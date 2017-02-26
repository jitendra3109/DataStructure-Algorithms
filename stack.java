/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.*;
import java.util.*;


class stack {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        Integer arr[]=new Integer[N];
        int top=-1;
        for (int i = 0; i<N; i++) {        	
            int j=in.nextInt();
            if(j==1){
                if(top==-1){
                    System.out.println("No Food");
                }
                else{
                    System.out.println(arr[top]);                    
                    top--;
                }
                
            }else{
                top++;
                arr[top]=in.nextInt();
            }
           
        }        
    }
}