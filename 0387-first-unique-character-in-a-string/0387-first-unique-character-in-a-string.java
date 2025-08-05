class Solution {
    public int firstUniqChar(String s) {
        int[] arr=new int[26];
        Arrays.fill(arr,0);
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
    //     HashMap<Character,Integer> map=new HashMap<>();
    //     for(int i=0;i<s.length();i++){
    //         char ch=s.charAt(i);
    //         map.put(ch,map.getOrDefault(ch,0)+1);
    //     }
    //     int ans=0;
    //   for(int i=0;i<s.length();i++){
    //     if(map.get(s.charAt(i))==1){
    //        return i;
    //     }
       
    //   }
    //     return -1;
  
