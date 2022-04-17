package com.company;

public class Lab2 {
    public static void main (String[] args) {
        int C5 = 1504 % 5;
        int C7 = 1504 % 7;
        int C11 = 1504 % 11;
        //C=A*B
        //float
        /*Обчислити суму найбільших елементів в стовпцях
        матриці з непарними номерами та найменших елементів
        в стовпцях матриці з парними номерами*/
        float[][] A = new float[][]{{0.5F, 1.8F, 2F}, {3.2F, 4.4F, 5.1F}};
        float[][] B = new float[][]{{6F, 7.9F}, {8.1F, 9F}, {2.1F, 4.6F}};
        sizeofMatrix(A);
        sizeofMatrix(B);
        possibilityofMulti(A, B);
        possibilityofMulti(B, A);
    }
    static void sizeofMatrix(float[][] A){
        for(int i=0;i<A.length;i++){
            for(int j=1;j<A.length;j++){
                if(A[i].length!=A[j].length){
                    System.out.println("Error. The matrix should not be stepped");
                }
            }
        }
    }
    static void possibilityofMulti(float[][] A, float[][] B){
        if(A[0].length==B.length) {
            float[][] C = new float[A.length][B[0].length];
            for (int i = 0; i < A.length; i++){
                for (int k = 0; k < B[0].length; k++){
                    for(int j = 0; j<B.length;j++){
                        C[i][k]+=A[i][j]*B[j][k];
                    }
                }
            }
            for(int i=0;i<C.length;i++){
                for(int j=0;j<C[i].length;j++){
                    System.out.printf("%.2f ",C[i][j]);
                }
                System.out.println();
            }
            sumofMax(C);
            sumofMin(C);
            System.out.println();
        }else{
            System.out.println("Error. The rules of matrix multiplication are violated.");
        }
    }
    static void sumofMax(float[][] C){
        float sum = 0;
        for(int j=1;j<C[0].length;j+=2){
            float maxEl = 0;
            for(int i=0;i<C.length;i++){
                if(C[i][j]>=maxEl){
                    maxEl=C[i][j];
                }
            }
            sum+=maxEl;
        }
        System.out.printf("Sum of Max = %.2f\n", sum);
    }
    static void sumofMin(float[][] C){
        float sum = 0;
        for(int j=0;j<C[0].length;j+=2){
            float minEl = C[0][0];
            for(int i=0;i<C.length;i++){
                if(C[i][j]<=minEl){
                    minEl=C[i][j];
                }
            }
            sum+=minEl;
        }
        System.out.printf("Sum of Min = %.2f\n", sum);
    }
}
