/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.*;
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int M= in.nextInt();
        int arr[][]= new int[N][M];

        for (int i = 0; i<N; i++) {
        	for (int J = 0;J<M; J++) {
            arr[i][j]=in.nextInt();
           }
        }
        for (int i = 0; i<M; i++) {
        	for (int J = 0;J<N; J++) {
            System.out.println(arr[j][i]);
           }
        }
    }
}