class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
    boolean[] check = new boolean[nums.length]; // \U0001f504 Track used elements
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums); // \U0001f4cc Sorting to detect duplicates
    find(nums, check, new ArrayList<>(), ans);
    return ans;
}

private void find(int[] nums, boolean[] check, List<Integer> current, List<List<Integer>> ans) {
    if (current.size() == nums.length) {
        ans.add(new ArrayList<>(current)); // \U0001f3af Valid permutation found
        return;
    }
    for (int i = 0; i < nums.length; i++) {
        if (check[i]) continue; // ⏩ Already used in this permutation
        
        // \U0001f6d1 Skip duplicate elements to prevent redundant work
        if (i > 0 && nums[i] == nums[i - 1] && !check[i - 1]) continue;

        current.add(nums[i]); // \U0001f539 Include element
        check[i] = true;
        find(nums, check, current, ans);
        current.remove(current.size() - 1); // \U0001f519 Backtrack
        check[i] = false;
    }
}
        
    }
