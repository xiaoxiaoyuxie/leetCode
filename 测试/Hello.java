

/**
 * Hello
 */
public class Hello {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head; //处理最小输入的情况，即空链表和单节点链表
        ListNode second = head.next; //将即将被调用的下一个节点分离，即将下一个调用的输入存在second里
        ListNode reverseHead = reverseList(second); //将调用后的结果存储，这个结果就是最终结果。之后利用递归，调用刚才存好的输入
        second.next = head; //上面一步的调用已经完成以second为首的链表的反转，所以现在second变成了反转完成后的尾节点
                             //把这个尾节点的next指向一开始输入的前驱，即head，完成整个链表反转
        head.next = null; //最开始的头节点要变成尾节点，即在后面补null使链表终结
        System.out.println("hahahahhahah");   
        return reverseHead; 
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        
        Hello hello = new Hello();
        
        hello.reverseList(null);
    }
}