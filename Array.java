/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        int arr[]= new int[N];

        for (int i = 0; i<N; i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }
        for (int i = N-1; i>=0; i--) {
            System.out.println(arr[i]);
        }    


    }
}