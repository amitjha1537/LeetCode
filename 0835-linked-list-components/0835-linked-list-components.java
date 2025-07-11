/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        ListNode temp=head;
        Set<Integer> ans=new HashSet<>();
        int n=nums.length;
        int count=0;
        for(int num:nums){
            ans.add(num);
        }
       
        while(temp!=null){
            if(ans.contains(temp.val)&&(temp.next==null|| (!ans.contains(temp.next.val)))){
                count++;
            }
               temp=temp.next;
        }
     
return count;
        
    }
}