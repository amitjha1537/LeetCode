class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int ans=fruits.length;
        for(int fruit:fruits){
            for(int j=0;j<baskets.length;j++){
                if(fruit<=baskets[j]){
                    ans--;
                    baskets[j]=0;
                    break;
                }
            }
        }
        return ans;
        
    }
}