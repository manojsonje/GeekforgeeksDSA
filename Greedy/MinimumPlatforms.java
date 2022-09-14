package Greedy;
import java.util.*;
import java.io.*;
import java.lang.*;


//User function Template for Java

class MinimumPlatforms
{
    public static void main(String args[])throws IOException
    {
        int start[] = new int[] {900, 940, 950, 1100, 1500, 1800};
    	int end[] =  new int[] {910, 1200, 1120, 1130, 1900, 2000};
    	System.out.println("Number Of max meetings are:- " + findPlatform(start, end, start.length));
    }
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr); 
        Arrays.sort(dep); 
  
        int plat_needed = 1, result = 1; 
        int i = 1, j = 0; 
  
        while (i < n && j < n) { 
        
            if (arr[i] <= dep[j]) { 
                plat_needed++; 
                i++; 
            } 
  
            else if (arr[i] > dep[j]) { 
                plat_needed--; 
                j++; 
            } 
  
            if (plat_needed > result) 
                result = plat_needed; 
        } 
  
        return result;
    }
    
}

