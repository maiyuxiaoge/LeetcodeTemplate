import java.util.List;

public class ListNodeBuilder {
    public static ListNode buildListNode(String s){
        ListNode head = new ListNode(0);
        ListNode start = head;
        String[] words = s.substring(1, s.length() - 1).split(",");
        for (String w : words){
            int num = Integer.parseInt(w.strip());
            head.next = new ListNode(num);
            head = head.next;
        }
        return start.next;
    }

//    public static void main(String[] args) {
//        System.out.println(ListNodeBuilder.buildListNode("[1, 3, 4, 5]"));
//
//    }
}
