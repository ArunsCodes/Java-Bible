package com.arunscodes.HackerrankCodes;

public class DeFangIp {

    public static String deFang(String address){
//        StringBuilder sb = new StringBuilder();
//
//        for(int i = 0; i<address.length(); i++){
//            if(address.charAt(i)=='.'){
//                sb.append("[.]");
//            } else
//                sb.append(address.charAt(i));
//        }
//
//        return sb.toString();

        String s = address.replace(".","[.]");
        return s;
    }


    public static void main(String[] args) {

        String str = "1.1.1.1";

        System.out.println(deFang(str));

    }

}
