
class Solution {
        public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int cnt =0;
            ListNode ret = new ListNode(0);
            ListNode trav =ret;
            while(l1!=null||l2!=null)
            {
                //System.out.println(l1.val);
                //System.out.println(l2.val);
                trav.val += (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
                //System.out.println(trav.val+"\n++++++++++++++++++++++");

                l1 = l1 == null ?null:l1.next;
                l2 = l2 == null ?null:l2.next;
                if(trav.val>=10)
                {
                    trav.val-=10;
                    trav.next = new ListNode(1);
                }
                else if(l1==null&&l2==null)
                {
                    break;
                }
                else
                {
                    trav.next = new ListNode();
                }
                trav = trav.next;

            }
            return ret;

        }

    public static void main(String[] args)
    {
        System.out.println (addTwoNumbers());
    }

}