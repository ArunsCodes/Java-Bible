package com.arunscodes.AmazonQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AmazonFreshPromo {

    //Promo where customer receives prizes

    static int foo(List<String> codeList, List<String> cart){
        Iterator i = codeList.iterator();
        while (i.hasNext()){
            String list = i.next().toString();
            List<String> individuals = getIndividualItems(list);
        }



        return 0;
    }

    static List<String> getIndividualItems(String list){

        List<String> elements = new ArrayList<>();
        char[] indi = list.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<list.length(); i++){
            if(indi[i] == '[')
                continue;
            else if(indi[i] == ',' || indi[i] == ']' || indi[i] == ' '){
                elements.add(sb.toString());
                sb.delete(0,i);
                continue;
            }else {
                sb.append(indi[i]);
            }
        }
        return elements;
    }

    public static void main(String[] args) {
        List<String> codeList = new ArrayList<>();

        codeList.add("[apple,apple]");
        codeList.add("[banana anything apple]");

        List<String> shoppingCart = new ArrayList<>();
        shoppingCart.add("[orange,apple,apple,banana,orange,banana]");

        System.out.println(foo(codeList,shoppingCart));
    }

    /*
    Test 1:
    code: [apple apricot, banana anything guava, papaya anything]
    items: [banana, orange, guava, apple, apricot, papaya, kiwi]

    Test 2:
    [apple, mango, banana]
[kiwi, apricot]

Test 3:
[kiwi pear, jackfruit, orange, apple apple, banana orange apple, banana]
[kiwi, orange, apple, banana, orange, apple, banana, pear, jackfruit, apple]


For true:

Test 1:
[apple, mango, banana]
[apple, mango, banana]

Test 2:
[]
[kiwi, apricot]

Test 3:
[apple apple, apple anything apple, apple apple]
[kiwi, apple, apple, apple, apple, orange, apple, orange, apple, orange, apple, apple]


     */
}
