import java.math.*;
import java.util.regex.*;

public class Practice1 {
    public static class LinkedListNode {
        String val;
        LinkedListNode next;

        LinkedListNode(String node_value){
            val = node_value;
            next=null;
        }
    };

    public static LinkedListNode _insert2_list(LinkedListNode head, String val){
        if(head == null) {
            head = new LinkedListNode(val);
        }
        else {
            LinkedListNode end = head;
            while (end.next != null) {
                end = end.next;
            }
            LinkedListNode node = new LinkedListNode(val);
            end.next = node;
        }
        return head;
    }
    /// to find the sub in target list
    public static int search(LinkedListNode list, LinkedListNode sublist) {
        int found =-1,index=0;
        LinkedListNode i,j;
        for (i=list; i.next!=null; index++,i=i.next){
            LinkedListNode c_list=i;
            for (j=sublist; j.next!=null; j=j.next){
                System.out.println("Comparing c_list.val-" +c_list.val+" j.val-"+j.val);

                if (c_list.val != j.val) break;
                c_list=c_list.next;

            }
            System.out.println("j.next-" +j.next+" found-"+found);
            if(j.next==null && found ==-1 &&(c_list.val == j.val)) {
                found=index;
                System.out.println("Found" +found);
                break;
            }
            System.out.println("index" +index);
        }

        return found;
    }

    public static void main (String[] args) throws Exception {
        LinkedListNode _list = null;
        _list = _insert2_list(_list,"1");
        _list = _insert2_list(_list,"2");
        _list = _insert2_list(_list,"3");
        LinkedListNode _sublist = _insert2_list(null,"2");
        _sublist = _insert2_list(_sublist,"3");
        System.out.println(search(_list,_sublist));
    }
}