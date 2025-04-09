/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        Map<Node,Node> ans=new HashMap<>();
        return dfs(node,ans);
        
    }
    private Node dfs(Node node, Map<Node,Node> ans){
        if(ans.containsKey(node)){
            return ans.get(node);
        }
        Node clone =new Node(node.val);
        ans.put(node,clone);
        for(int i=0;i<node.neighbors.size();i++){
            Node neighbour=node.neighbors.get(i);
            clone.neighbors.add(dfs(neighbour,ans));
        }
        return clone;

    }
}