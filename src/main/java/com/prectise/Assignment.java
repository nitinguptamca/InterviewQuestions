package com.prectise;

import java.util.*;
import java.util.stream.*;

/**
 * - Return all subsets of a given set
 * e.g.
 * input:  {1, 2, 3}
 * output: {{}, {1}, {2}, {3}, {1, 2}, {2, 3}, {1,3}, {1, 2, 3}}
 */
public class Assignment {
    static int[] input = {1, 2, 3};

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }

    public static void main1(String[] args) {
        //Main List for storing all subsets
        List<List<Integer>> subset = new ArrayList<>();
        // Input ArrayList
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        findSubsets(subset, input, new ArrayList<>(), 0);
       subset.stream().flatMap(Stream::of).forEach(System.out::println);
    }

    public static void findSubsets(List<List<Integer>> subset,
                ArrayList<Integer> input,
                ArrayList<Integer> output,
                int index) {
        // Base Condition
        if (index == input.size()) {
            subset.add(output);
            return;
        }

        // Not Including Value which is at Index
        findSubsets(subset, input, new ArrayList<>(output), index + 1);

        // Including Value which is at Index
        output.add(input.get(index));
        findSubsets(subset, input, new ArrayList<>(output), index + 1);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList();
        output.add(new ArrayList<Integer>());

        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList();
            for (List<Integer> curr : output) {
                newSubsets.add(new ArrayList<Integer>(curr){{add(num);}});
            }
            for (List<Integer> curr : newSubsets) {
                output.add(curr);
            }
        }
        return output;
    }
}



