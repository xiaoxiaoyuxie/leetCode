

class ListNode {
	int val;
    ListNode next;
    public ListNode(int x){
        val = x;
    }
}

public class Lianbiao {
    public ListNode hahList(ListNode listNode) {
        return null;
    }
    //找到倒数第n个节点
    public ListNode findLastOne(ListNode node, int x){
        ListNode now = node;
        ListNode curr = node;
        for (int i = 0; i < x; i++) {
            if (curr != null) {
                curr = curr.next;
            }else
            {
                return null;
            }
        }
        while (curr != null){
            now = now.next;
            curr = curr.next;
        }
        return now;
    }

    // 翻转打印链表
    public void printRevese(ListNode node)
    {
        if(node==null){
            return;
        }
        if (node.next == null) {
            System.out.println(node.val);
            return;
        } else {
            printRevese(node.next);
        }
        System.out.println(node.val);
    }

    // 判断一个链表是否有环
    public boolean hasCycle (ListNode node){
        return true;
    }

    //两数相加 
    // 3->2->3 + 
    // 6->9->1 = 
    // 9->1->5
    // 因为 323+196 = 519；
    /* 
    原理为：
    1：同时遍历两个链表
    2：将结果相加
    3：将相加结果储存至新节点
    4：遇到进位时储存
    5：再次遍历时将进位和结果再相加
    6：将当前节点指向新节点

     特殊注意点：两个链表长度可能不一样，所以遍历条件应该为：两个链表的尾结点都指向空才对,其中短的链表结尾都用0 补齐；
    */

    public ListNode addTwoNumber(ListNode node1, ListNode node2)
    {
        ListNode newNode1 = node1; //储存参数，不更改外部变量
        ListNode newNode2 = node2; //储存参数，不更改外部变量
        ListNode sumNode = new ListNode(0); //新建链表用于存放结果
        ListNode curr = sumNode;
        int carry = 0; //储存十进制进位
        while (newNode1 !=null || newNode2 != null)
        {
            int x = newNode1.val;
            if (newNode1 == null) {
                x = 0;
            } //取出链表1 的值
            int y = newNode2.val;
            if (newNode2 == null) {
                y = 0;
            } //取出链表2 的值

            int sum = x+y + carry; //将结果和上一次的进位相加
            carry = sum/10;         //得出下一次的进位
            int value = sum%10;     //得出该往新节点储存的值
            curr.next = new ListNode(value); //赋值该节点

            curr = curr.next;
            if (newNode1 != null) newNode1 = newNode1.next;
            if (newNode2 != null) newNode2 = newNode2.next;   //将节点指向下一节点，准备下次循环
        }
        if (carry > 0) {
            curr.next = new ListNode(carry); 
        }
        return sumNode.next;
    }
    
    public static void main(String[] args) {
        Lianbiao lianbiao = new Lianbiao();

        ListNode node1 = new ListNode(3);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);

        ListNode node2 = new ListNode(6);
        node2.next = new ListNode(9);
        node2.next.next = new ListNode(1);

        lianbiao.printRevese(node2);

        // ListNode node3 = lianbiao.addTwoNumber(node1, node2);
        // while (node3!=null) {
        //     System.out.println(node3.val);
        //     node3 = node3.next;
        // }
        
        // lianbiao.hahList(new ListNode(0));
    }
}

