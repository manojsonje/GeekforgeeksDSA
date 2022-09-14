# Minimum Platforms
MediumAccuracy: 46.78% 
Submissions: 100k+Points: 4

-----------------------------------------------------------

Given arrival and departure times of all trains that reach a railway station. Find the minimum number of platforms required for the railway station so that no train is kept waiting.
Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure time can never be the same for a train but we can have arrival time of one train equal to departure time of the other. At any given instance of time, same platform can not be used for both departure of a train and arrival of another train. In such cases, we need different platforms.
<br>

Example 1:
Input: n = 6 
arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
dep[] = {0910, 1200, 1120, 1130, 1900, 2000}<br>
Output: 3<br>
Explanation: 
Minimum 3 platforms are required to 
safely arrive and depart all trains.<br><br>

Example 2:
Input: n = 3<br>
arr[] = {0900, 1100, 1235}
dep[] = {1000, 1200, 1240}<br>
Output: 1<br>
Explanation: Only 1 platform is required to 
safely manage the arrival and departure 
of all trains. 
<br><br>

Your Task:
You don't need to read input or print anything. Your task is to complete the function findPlatform() which takes the array arr[] (denoting the arrival times), array dep[] (denoting the departure times) and the size of the array as inputs and returns the minimum number of platforms required at the railway station such that no train waits.

Note: Time intervals are in the 24-hour format(HHMM) , where the first two characters represent hour (between 00 to 23 ) and the last two characters represent minutes (this may be > 59).

<br>
Expected Time Complexity: O(nLogn)
Expected Auxiliary Space: O(n)
<br>

Constraints:
1 ≤ n ≤ 50000
0000 ≤ A[i] ≤ D[i] ≤ 2359
<br>


Company Tags
Amazon Boomerang Commerce D-E-Shaw Hike Paytm Walmart Zillious Microsoft Google Adobe Atlassian <br>

Topic Tags
Arrays Greedy Sorting Binary Search

Related Interview Experiences
Walmart Labs Interview Experience Set 2 On CampusWalmart Labs Interview Experience Set 3 On CampusAdobe Interview Experience For Member Of Technical Staff 2Adobe Interview Experience On Campus For InternshipAdobe Interview Questions Computer ScientistAtlassian Interview Experience For Full Time Software Engineer Bangalore On Campus
