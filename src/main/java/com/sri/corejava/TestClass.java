package com.sri.corejava;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class TestClass {

    //@Autowired

    @Autowired
    static HashMap<Character, Integer> hashMap =new HashMap<Character, Integer>();

//@PostConstruct
    public  HashMap<Character, Integer> HashMapoperation(String s ){


        char test[]=   s.toCharArray();


        int count=0;
        // HashMap<Character, Integer> hashMap=new HashMap<Character, Integer>();
        for(int i=0;i<test.length;i++){
            //System.out.println(test[i]);
            //System.out.println(s.charAt(i));

            //Map.Entry<Character, Integer> entrySet=hashMap.;

            if(hashMap.containsKey(test[i]))
                count = hashMap.get(test[i]);
            else
                count=0;

            count=count+1;


            hashMap.put(test[i],count);

        }

        return hashMap;
    }



    public static void main(String[] args) {
        System.out.println("Welcome");

        String s="TestapplicationABCaaaaa";

        hashMap=new TestClass().HashMapoperation(s);

        System.out.println(hashMap);

    }
}
