class Solution {
    public int maxEvents(int[][] events) {
   Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));



        PriorityQueue<Integer> ans=new PriorityQueue<>();
        int i=0, n=events.length;
        int day=0, attended=0;
        while(i<n||!ans.isEmpty()){
            if(ans.isEmpty()){
            day=events[i][0];
            }
            while(i<n&&events[i][0]<=day){
                ans.offer(events[i][1]);
                i++;


            }
            while(!ans.isEmpty()&&ans.peek()<day){
                ans.poll();
            }
            if(!ans.isEmpty()){
                ans.poll();
                attended++;
                day++;
            }
        }

        return attended;
    }
}