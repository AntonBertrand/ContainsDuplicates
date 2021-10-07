package com.example.mypackage;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    //Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.


    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
	    System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate2(int[] nums) {

        ArrayList<Integer> newArray = new ArrayList();

        for (int i = 0; i < nums.length ; i++) {
            System.out.println(nums[i]);
            if (newArray.contains(nums[i])) {
                return true;
            } else {
                newArray.add(nums[i]);
            }
        }

        return false;
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet newSet = new HashSet();
        for(int num : nums){
            if(newSet.contains(num)){
                return true;
            }
            newSet.add(num);
        }
        return false;
    }

}
