package com.arunscodes.HackerrankCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ConnectedSum {

    static int sum;

    public static int connectedSum(int nodeNumber,List<Integer> graph_from, List<Integer> graph_to){

        Integer[] gf = (Integer[]) graph_from.toArray();

        int[] visited = new int[graph_from.size()];

        int edge = findEdges(graph_from, graph_to);


        int maxValueSum = Integer.MIN_VALUE;


        for(int i = 0; i< graph_from.length; i++){
            if(visited[i] == false){
                sum= 0;

                dfs(i, graph_from,visited, graph_to);

                if(sum> maxValueSum){
                    maxValueSum = sum;
                }
            }
        }


        return 0;
    }

    static int findEdges(int n , int[] arr, int[] arr2){

        int sum1=0, sum2=0, sum3=0;
        List<Integer> isolated = new ArrayList<>();
        for (int i = 0 ; i<n;i++){
            for(int j = 0 ; j<arr.length; j++){
                if(i == arr[i] || i == arr2[i]){
                    continue;
                } else {
                    isolated.add(i);
                }
            }
        }
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i]==arr2[i]){
                sum3+=1;
            } if(arr[i] != arr2[i]){
                sum2+=1;
            }
            sum1 = isolated.size();
        }

        return (int) (Math.ceil(Math.sqrt(sum1))+Math.ceil(Math.sqrt(sum2))+Math.ceil(Math.sqrt(sum3)));
    }

    static void dfs(int v, Vector<Integer> graph, boolean []visited, Vector<Integer> values){
        visited[v] = true;

        sum+=values.get(v -1 );

        for(int i : graph.get(v)){
            if(visited[i] == false){
                dfs(i, graph, visited, values);
            }
        }
    }

    public static void main(String[] args) {
        int nodenumber = 8;
        int edges = 4;
        Vector<Integer> graph_from = {8,5,7,8};
        Vector<Integer> graph_to = {1, 8, 3, 6};

        int sum = connectedSum(nodenumber, graph_from, graph_to);

    }
}
