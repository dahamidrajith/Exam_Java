package org.example.ProblemThree;

import java.util.ArrayList;
import java.util.List;

public class ProblemThree {

    public static void main(String[] args) {

        int first=0;
        int second=1;
        int length=100;
        int intFab=1;
        List<Integer> outPut= new ArrayList<>();

        if(length<1){
            System.out.println(length);
            outPut.add(length);
        }

        for(int i=1;i<=length;i++){
            intFab=first+second;
            first=second;
            second=intFab;
            outPut.add(intFab);
        }
        System.out.println(outPut);
    }

}
