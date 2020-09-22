import com.sun.source.tree.Tree;

import java.security.KeyStore;
import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x) { val = x; }
    @Override
    public String toString() {
        LinkedList<TreeNode> queue = new LinkedList<>();
        String s =  "[ ";
        queue.add(this);
        while (!queue.isEmpty()){
            LinkedList<TreeNode> tempQueue = new LinkedList<>();
            String tempString = "";
            boolean flag = false;
            while (!queue.isEmpty()){
                TreeNode t = queue.pollFirst();
                if (t == null){
                    tempString += "null, ";
                }
                else{
                    tempString += t.val + ", ";
                    tempQueue.add(t.left);
                    tempQueue.add(t.right);
                    flag = true;
                }
            }
            if (flag){
                s += tempString;
            }
            queue = tempQueue;

        }
        s = s.substring(0,s.length()-2) + " ]";
        return s;
    }

//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        System.out.println(root);
//;
//    }


}

