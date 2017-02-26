/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.*;
import java.util.*;


class queue {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        Integer arr[]=new Integer[N];
        int front=-1;
        int rear=-1;
        for (int i = 0; i<N; i++) {        	
            char c = in.next().charAt(0);
            if(c=='D'){
                if(front==rear){
                    System.out.println("-1 0");
                }
                else{
                    front++;
                    System.out.print(arr[front]+" ");
                    System.out.println(rear-front);                    
                }
                
            }else{
                rear++;
                arr[rear]=in.nextInt();
                System.out.println(rear-front);
            }
           
        }        
    }
}