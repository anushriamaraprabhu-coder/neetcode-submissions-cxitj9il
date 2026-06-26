class MedianFinder {

    private PriorityQueue<Integer>small;
    private PriorityQueue<Integer>large;

    public MedianFinder() {

        small=new PriorityQueue<Integer>(Collections.reverseOrder());
        large=new PriorityQueue<Integer>();
        
    }
    
    public void addNum(int num) {

        if(small.isEmpty() || num<=small.peek()){
            small.add(num);
        }
        else{
            large.add(num);
        }

        if(small.size()>large.size()+1){
            large.add(small.poll());
        }

        else if(large.size()>small.size()){
            small.add(large.poll());
        }
        
    }
    
    public double findMedian() {

        if(small.size()==large.size()){
            return (small.peek()+large.peek())/2.0;
        }

        return small.peek();
        
    }
}
