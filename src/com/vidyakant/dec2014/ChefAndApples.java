package com.vidyakant.dec2014;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChefAndApples {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Integer> treeSet;
        int t,n,x;
        t=sc.nextInt();
        while(t>0){
            n = sc.nextInt();
            treeSet = new HashSet<Integer>();
            while(n>0){
                x=sc.nextInt();
                treeSet.add(x);
                n--;
            }
            System.out.println(treeSet.size());
            t--;
        }
        sc.close();





    }
}
