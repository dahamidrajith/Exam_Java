package org.example.ProblemFive;

import java.util.ArrayList;
import java.util.List;

public class ProblemFive {
    static List<String> results = new ArrayList<>();

    public static void main(String[] args) {
        findCombinations(1, "", 0, 0);
        System.out.println("Combinations resulting in 100:");
        for (String result : results) {
            System.out.println(result + " = 100");
        }
    }

    public static void findCombinations(int num, String expr, int sum, int prev) {
        if (num == 10) {
            if (sum == 100) {
                results.add(expr); // Add the result if it equals 100
            }
            return;
        }

        findCombinations(num + 1, expr + "+" + num, sum + num, num);

        findCombinations(num + 1, expr + "-" + num, sum - num, -num);

        int concatNumber = prev >= 0 ? prev * 10 + num : prev * 10 - num;
        findCombinations(num + 1, expr + num, sum - prev + concatNumber, concatNumber);
    }
}
