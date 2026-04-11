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
    public boolean canAttendMeetings(List<Interval> intervals) {

        //Sort the collection wrt start time

        Collections.sort(intervals,(a,b)->a.start-b.start);

        //Check overlap

        for(int i=1;i<intervals.size();i++){

            Interval prev=intervals.get(i-1);
            Interval current=intervals.get(i);

            if(current.start<prev.end){return false;}

        
        }
        return true;


    }
}
