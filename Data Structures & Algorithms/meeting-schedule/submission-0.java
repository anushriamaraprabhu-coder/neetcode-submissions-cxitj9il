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


// class Interval{

//     int start;
//     int end;

//     Interval (int s,int e){
//         start=s;
//         end=e;
//     }
// }
class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        Collections.sort(intervals,(a,b)->a.start-b.start);

        //Check overlapping

        for(int i=1;i<intervals.size();i++){
            Interval prev=intervals.get(i-1);
            Interval current=intervals.get(i);

            if(current.start<prev.end){return false;}

        }

        return true;
    }
}
