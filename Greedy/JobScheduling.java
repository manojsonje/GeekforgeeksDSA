package Greedy;
import java.util.*;
import java.io.*;
import java.lang.*;

public class JobScheduling {

    //Function to find the maximum profit and the number of jobs done.
   static int[] jobScheduling(Job arr[], int n)
    {
       //sort Job array based on profit
        Arrays.sort(arr, (Job j1, Job j2)-> j2.profit - j1.profit);
        int jobsDoneCount = 0, maxProfit = 0;
        int maxDeadline = 0;
        for(Job j : arr){
            maxDeadline = Math.max(maxDeadline, j.deadline);
        }
       
        int[] scheduledArr = new int[maxDeadline+1];
        for(int scheduleNum = 1; scheduleNum <=maxDeadline; scheduleNum++){
            scheduledArr[scheduleNum] = -1;
        }
             
        for(int jobNum = 0; jobNum < n; jobNum++){
            for(int scheduleNum = arr[jobNum].deadline; scheduleNum >0; scheduleNum-- ){
                if(scheduledArr[scheduleNum] == -1){
                    scheduledArr[scheduleNum] = arr[jobNum].id;
                    jobsDoneCount++;
                    maxProfit += arr[jobNum].profit;
                    break;
                }
            }
        }
        
        int[] result = new int[2];
        result[0] = jobsDoneCount;
        result[1] = maxProfit;
        
        return result;
    }
    
}
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

