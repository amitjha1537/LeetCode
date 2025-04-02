class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
       Arrays.sort(boxTypes,(a,b) -> Integer.compare(b[1],a[1]));
       int max=0;
       for(int[] box:boxTypes){
        int count=Math.min(box[0],truckSize);
        max+=count * box[1];
        truckSize-=count;
        if(truckSize==0){
            break;
        }
       }
       return max;

        
    }
}