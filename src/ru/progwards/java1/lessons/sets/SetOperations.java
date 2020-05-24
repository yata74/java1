package ru.progwards.java1.lessons.sets;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
        HashSet<Integer> res = new HashSet<>(set1);
        res.addAll(set2);
        return res;
    }
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
        HashSet<Integer> res = new HashSet<>(set1);
        res.retainAll(set2);
        return res;
    }
    public static Set<Integer> difference(Set<Integer> set1, Set<Integer> set2){
        HashSet<Integer> res = new HashSet<>(set1);
        res.removeAll(set2);
        return res;
    }
    public static Set<Integer> symDifference(Set<Integer> set1, Set<Integer> set2){
        HashSet<Integer> res = new HashSet<>(set1);
        for(Integer num:set2){
           if (res.contains(num)){
               res.remove(num);
            }else res.add(num);
        }
        return res;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1,2,3,4,5,6);
        Set<Integer> set2 = Set.of(4,5,6,7,8,9);
        System.out.println(union(set1,set2));
        System.out.println(intersection(set1,set2));
        System.out.println(difference(set1,set2));
        System.out.println(symDifference(set1,set2));
        }
    }

