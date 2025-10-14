package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class arrayPractise {
    int[] arr1 = {1,2,3};
    int[] arr2 = {5,2,1,4};

    public void diffArr(){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;

        HashSet<Integer> hs = new HashSet<Integer>();
        while (i<arr1.length && j<arr2.length){
            if (arr1[i]==arr2[j]){
                hs.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i]>arr2[j]) {
                j++;
            }else {
                i++;
            }
        }
        System.out.println("Intersection of arrays are = "+hs);
    }

    public void intersection(){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i =0;i<arr1.length;i++){
            for (int j =0; j<arr2.length;j++){
                if (arr1[i]==arr2[j]){
//                    System.out.println("intersection "+arr1[i]);
                    hs.add(arr1[i]);
                }
            }
        }
        System.out.println("Intersection of arrays are = "+hs);
    }

    public void union(){
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i< arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int j =0; j<arr2.length;j++){
            hs.add(arr2[j]);
        }
        System.out.println("Union of two array: "+hs);
    }
}
