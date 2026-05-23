/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {

        int n=intervals.size();

        //sanity check
        if(n==0){return 0;}

        int[]start= new int[n];
        int[]end=new int[n];

        for(int i=0;i<n;i++){

            start[i]=intervals.get(i).start;
            end[i]=intervals.get(i).end;

        }

        Arrays.sort(start);
        Arrays.sort(end);

        int maxroomsreq=0;
        int earliestEnding=0;

        for(int i=0;i<n;i++){

            if(start[i]<end[earliestEnding]){
                maxroomsreq++;
            }

            else{
                earliestEnding++;
            }
        }

        return maxroomsreq;

    }
}
