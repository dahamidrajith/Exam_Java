package org.example.ProblemFour;

public class ProblemFour {

    public static void main(String[] args) {
        int[] array={50,2,1,9};
        ProblemFour problemFour = new ProblemFour();
        problemFour.lagestNumber(array);
    }

    public void lagestNumber(int[] arrayDetails){

        int length=arrayDetails.length;
        boolean swaped;
        String finalOutput="";

        for(int i=0;i<length-1;i++){
            swaped=false;
            int tempValue=0;
            String comparisonVlaueOne;
            String comparisonValueTwo;

            for(int j=0;j<length-1-i;j++){
                comparisonVlaueOne=(arrayDetails[j]+"").substring(0,1);
                comparisonValueTwo=(arrayDetails[j+1]+"").substring(0,1);
                int comparisonVlaueOneInt=Integer.parseInt(comparisonVlaueOne);
                int comparisonVlaueTwoInt=Integer.parseInt(comparisonValueTwo);
                if(comparisonVlaueOneInt>comparisonVlaueTwoInt){
                    tempValue=arrayDetails[j+1];
                    arrayDetails[j+1]=arrayDetails[j];
                    arrayDetails[j]=tempValue;
                    swaped=true;
                }
                if(!swaped){
                    break;
                }
            }
        }
        for(int k=length-1;k>=0;k--){
            finalOutput+=arrayDetails[k]+"";
            System.out.println(finalOutput);
        }
    }

}
