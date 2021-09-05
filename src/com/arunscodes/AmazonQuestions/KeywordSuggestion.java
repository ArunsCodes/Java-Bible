package com.arunscodes.AmazonQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class KeywordSuggestion {

    static List<List<String>> searchSuggestion(List<String> repo , String customerQuery){
        List<List<String>> result = new ArrayList<>();

        char[] singles = customerQuery.toCharArray();
        StringBuilder text = new StringBuilder(String.valueOf(singles[0]));

        for(int i = 1 ;i<singles.length; i++){

            text.append(singles[i]);

            List<String> suggestions = getRecommendations(repo,text.toString());

            result.add(suggestions);
        }

        return result;
    }

    static List<String> getRecommendations(List<String> repo, String text){
        repo.sort(Comparator.naturalOrder());

        Iterator it = repo.iterator();
        List<String> recommendations = new ArrayList<>();

        while (it.hasNext()) {
            String element = it.next().toString();
            if (element.compareToIgnoreCase(text) != 1 && recommendations.size()<3)
                recommendations.add(element);
        }
        return recommendations;
    }

    /*
    Test 1 : customerQuery = abcd
Abcd
abc
abccc
abccccdd
abcder
defr
ksnfls
oinadskal
rdfvlk
zxwd
Abcd
abc
abccc
abccccdd
abcder
defr
ksnfls
oinadskal
rdfvlk
zxwd
Abcd
abc
abccc
abccccdd
abcder
defr
ksnfls
oinadskal
rdfvlk


Test 2 :
customerQuery = AB
ABCDE
Abccd
NIUHNNN
YUGBJK
aBbxkj
abcd
hsfnKR
isandabWBB
njsafhsT

     */


    public static void main(String[] args) {
        List<String> repository = new ArrayList<>();

        repository.add("mobile");
        repository.add("mouse");
        repository.add("moneypot");
        repository.add("monitor");
        repository.add("mousepad");

        String customerQuery = "mouse";

        List<List<String>> result = KeywordSuggestion.searchSuggestion(repository,customerQuery);

        Iterator it = result.iterator();
        while (it.hasNext())
        System.out.println(it.next().toString());
    }
}
