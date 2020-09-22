
import java.util.LinkedList;

public class TreeBuilder {

    public static TreeNode buildTree(String s){
        String[] words = s.substring(1, s.length() - 1).split(",");
        TreeNode head = new TreeNode(Integer.parseInt(words[0].strip()));
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        int i = 1;
        while (i<words.length){
            TreeNode temp = queue.pollFirst();
            String word = words[i].strip();
            if (!"null".equals(word)){
                temp.left = new TreeNode(Integer.parseInt(word));
                queue.add(temp.left);
            }
            i += 1;
            word = words[i].strip();
            if (!"null".equals(word)){
                temp.right = new TreeNode(Integer.parseInt(word));
                queue.add(temp.right);
            }
            i += 1;
        }


        return head;
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeBuilder.buildTree("[ 1]");
        System.out.println(treeNode);
    }
}
