package org.example.ProblemTwo;

import java.util.ArrayList;
import java.util.List;

public class ProblemTwo {

    public static void main(String[] args) {
        int[] intArray={1,2,3};
        String[] stringArray={"a","b","c"};
        ProblemTwo problemTwo=new ProblemTwo();
        problemTwo.combineTwoList(intArray,stringArray);
    }

    public static void combineTwoList(int[] givenIntArray,String[] givenStringArray){
        int givenIntArrayLength=givenIntArray.length;
        List<String> output = new ArrayList<>();
        for(int i=0;i<givenIntArrayLength;i++){
            output.add(givenStringArray[i]);
            output.add(String.valueOf(givenIntArray[i]));
        }
        System.out.println(output);
    }

}
