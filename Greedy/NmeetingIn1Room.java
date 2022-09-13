package Greedy;
import java.io.*;
import java.util.*;
import java.lang.*;

class NMeetings {
	//Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        Meeting[] meetArray = new Meeting[n];
        
        for(int meetNum = 0; meetNum < n; meetNum++ ){
            meetArray[meetNum] = new Meeting( start[meetNum], end[meetNum] );
        }
        
        Arrays.sort(meetArray,(Meeting m1, Meeting m2)->(m1.end) - (m2.end));
        int maxMeets = 1, endTime = meetArray[0].end;
        for(int meetNum = 1; meetNum < n; meetNum++){
            if(endTime < meetArray[meetNum].start){
                maxMeets++;
                endTime = meetArray[meetNum].end;
            }
        }
       return maxMeets; 
    }
    public static void main(String args[]) throws IOException {
    	int start[] = new int[] {1,3,0,5,8,5};
    	int end[] =  new int[] {2,4,6,7,9,9};
    	System.out.println("Number Of max meetings are:- " + maxMeetings(start, end, start.length));
    }
}


class Meeting{
    int start;
    int end;
    
    Meeting(int start,int end){
        this.start = start;
        this.end = end;
    }
}