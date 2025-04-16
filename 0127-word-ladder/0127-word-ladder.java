class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> search=new HashSet<>(wordList);
        if(!search.contains(endWord)) return 0;
        Queue<String> depth=new LinkedList<>();
        depth.offer(beginWord);
        int level=1;
      
     while(!depth.isEmpty()){
          int roll=depth.size();
         for(int i=0;i<roll;i++){
            String curr=depth.poll();

            for(int j=0;j<curr.length();j++){
                char[] charr=curr.toCharArray();
                for(char c='a';c<='z';c++){
                    charr[j]=c;
                    String newWord=new String(charr);
                    if(newWord.equals(endWord)){
                       return level+1;
                    }
                    if(search.contains(newWord)){
                        depth.offer(newWord);
                       search.remove(newWord);
                    }
                }
              
            }
            
        }
        level++;

     }
       return 0;


        

        
    }
}