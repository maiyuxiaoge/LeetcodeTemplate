import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        String s = "[ ";
        ListNode head = this;
        while (head != null){
            s += head.val + ", ";
            head = head.next;
        }

        s = s.substring(0,s.length()-2) + " ]";
        return s;
    }
    public static void main(String[] args) {
        System.out.println(new ListNode(0));
    }
}
