package com.Testing;

public class Chintu {
    public static void main(String[] args) {
        int[] A = {4,5,4,2,5};

        int N = A.length;
        int K = N-1;
        int sum =0;
        //System.out.println(K);


        for(int j =1; j<N; j++){
            int abs = Math.abs(j -K) +1;
            sum = sum + (abs * A[j]);
        }

        //return sum;
        System.out.println(sum);
    }
}
