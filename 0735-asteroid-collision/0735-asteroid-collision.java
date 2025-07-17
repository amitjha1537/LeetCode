class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];

            while (!stack.isEmpty() && curr < 0 && stack.peek() > 0) {
                int top = stack.peek();

                if (top < -curr) {
                    stack.pop();
                } else if (top == -curr) {
                    stack.pop(); 
                    curr = 0;
                    break;
                } else {
                   
                    curr = 0;
                    break;
                }
            }

            if (curr != 0) {
                stack.push(curr);
            }
        }

        // Copy stack to array in correct order
        int[] ans = new int[stack.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}
