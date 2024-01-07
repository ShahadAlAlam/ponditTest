package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalSTriangle118 {
    public static void main(String[] args) {

        List<List <Integer>> ara = generate(5);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List <Integer>> ara = new ArrayList<>(numRows);
        for(int i = 0 ; i < numRows ; i++){
            int j = 0;
            List<Integer> inList = new ArrayList<Integer>();
            while(j<=i){
                if(j<=0 || i<=0){
                    inList.add(0,1);
                } else {
                    List<Integer> privList = ara.get(i-1);
                    int val = 0;
                    if(j>=i)
                     val = privList.get(j-1);
                    else
                     val = privList.get(j-1)+privList.get(j);
                    inList.add(val);
                }
                j++;
            }
            ara.add(inList);
        }
        System.out.println(ara.toArray().toString());
        return ara;
    }
}
