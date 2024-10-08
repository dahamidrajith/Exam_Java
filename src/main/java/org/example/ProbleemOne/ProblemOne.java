package org.example.ProbleemOne;

public class ProblemOne {

    public static void main(String[] args) {
        int[] array={2,5,1,6,7};
        ProblemOne problemOne=new ProblemOne();
        problemOne.SumUsingForLoop(array);
        problemOne.SumUsingWhileLoop(array);
        problemOne.SumUsingRecursion(array);
    }

    public void SumUsingForLoop(int[] array){
        int arrayLength=array.length;
        int total=0;
        for(int i=0;i<arrayLength;i++){
            total+=array[i];
        }
        System.out.println("SumUsingForLoop="+total);
    }

    public void SumUsingWhileLoop(int[] array){
        int j=0;
        int total=0;
        int arrayLength=array.length;
        while (arrayLength>0){
            total+=array[j];
            j++;
            if(j==arrayLength){
                break;
            }
        }
        System.out.println("SumUsingWhileLoop="+total);
    }

    public void SumUsingRecursion(int[] array){
        int total=0;
        for(int k:array){
            total+=k;
        }
        System.out.println("SumUsingWhileLoop="+total);
    }

}
