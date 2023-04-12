package com.wrq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.KeyStore;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

import java.util.*;

public class test {

    public static void main(String[] args) throws IOException {

        Map<Integer,Integer> map = new HashMap();
        map.put(2,6);
        map.put(3,4);
        map.put(7,4);
        Set<Integer> entries = map.keySet();

        for(Integer key : entries){
            System.out.println(key + " ," + map.get(key));
        }
    }


}