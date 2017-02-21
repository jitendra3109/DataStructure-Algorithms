package hackerearth;
import java.io.*;
import java.util.*;       

/**
 *
 * @author jsroyal
 */
public class HashMap{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);       
        int n =in.nextInt(); 
        HashMap<Integer, String>hashmap=new HashMap<>();
        for (int i=0;i<n;i++){
            int j=in.nextInt();
            String name=in.nextLine();
            hashmap.put(j,name);
        }
        int k=in.nextInt();
        for(int i=0;i<k;i++){
            int j=in.nextInt();
            System.out.println(hashmap.get(j));
        }
        
        
    }
    
}
