package Greedy;
import java.util.*;
import java.io.*;
import java.lang.*;

    class Item {
        int value, weight;
        Item(int x, int y){
            this.value = x;
            this.weight = y;
        }
    }
    
    
    class fractionalKnapsack
    {
        //Function to get the maximum total value in the knapsack.
        double fractionalKnapsackMethod(int W, Item[] arr, int n) 
        {
            //sort Item array based on fractional value
            Arrays.sort(arr, new knapsackComparator());
            int currentWeight = 0;
            double finalValue = 0.0;
            
            for(int i=0; i<n; i++){
                if(W >= currentWeight + arr[i].weight){
                    currentWeight += arr[i].weight;
                    finalValue += arr[i].value;
                }else{
                    finalValue += (((double)arr[i].value / (double)arr[i].weight) * ((double) W - currentWeight ));
                    break;
                }
            }
            
            return finalValue;
        }
    }
    
    class knapsackComparator implements Comparator<Item>{
        public int compare(Item i1, Item i2){
            if(((double)i1.value)/((double)i1.weight) > ((double)i2.value)/((double)i2.weight)){
                return -1;
            }else if(((double)i1.value)/((double)i1.weight) < ((double)i2.value)/((double)i2.weight)){
                return 1;
            }else{
                return 0;
            }
        }
    }