package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static algorithms.leetcode.AddTwoNumbers.ListNode;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers;

    @BeforeEach
    void init() {
        this.addTwoNumbers = new AddTwoNumbers();
    }

    @Test
    void listNode_teste() {
        ListNode ln3 = new ListNode(9);
        ListNode ln2 = new ListNode(0, ln3);
        ListNode lnFirst = new ListNode(1, ln2);

        ListNode ln6 = new ListNode(8);
        ListNode ln5 = new ListNode(7, ln6);
        ListNode lnSeconde = new ListNode(5, ln5);

        assertEquals(
                "ListNode{val=6, next=ListNode{val=7, next=ListNode{val=7, next=ListNode{val=1, next=null}}}}",
                addTwoNumbers.solution(lnFirst, lnSeconde).toString()
        );
    }

    @Test
    void listNode_teste2() {
        ListNode ln3 = new ListNode(3);
        ListNode ln2 = new ListNode(4, ln3);
        ListNode lnFirst = new ListNode(2, ln2);

        ListNode ln6 = new ListNode(4);
        ListNode ln5 = new ListNode(6, ln6);
        ListNode lnSeconde = new ListNode(5, ln5);

        assertEquals(
                "ListNode{val=7, next=ListNode{val=0, next=ListNode{val=8, next=null}}}",
                addTwoNumbers.solution(lnFirst, lnSeconde).toString()
        );
    }

    @Test
    void listNode_teste3() {
        ListNode ln3 = new ListNode(3);
        ListNode ln2 = new ListNode(4, ln3);
        ListNode lnFirst = new ListNode(2, ln2);

        ListNode ln13 = new ListNode(9);
        ListNode ln12 = new ListNode(9, ln13);
        ListNode ln11 = new ListNode(9, ln12);
        ListNode ln10 = new ListNode(9, ln11);
        ListNode ln9 = new ListNode(9, ln10);
        ListNode ln8 = new ListNode(9, ln9);
        ListNode ln7 = new ListNode(9, ln8);
        ListNode ln6 = new ListNode(9, ln7);
        ListNode ln5 = new ListNode(9, ln6);
        ListNode lnSeconde = new ListNode(1, ln5);

        assertEquals(
                "ListNode{val=3, next=ListNode{val=3, next=ListNode{val=3, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=1, next=null}}}}}}}}}}}",
                addTwoNumbers.solution(lnFirst, lnSeconde).toString()
        );
    }

    @Test
    void listNode_teste4() {
        ListNode ln3 = new ListNode(4);
        ListNode ln2 = new ListNode(6, ln3);
        ListNode lnFirst = new ListNode(5, ln2);

        ListNode ln34 = new ListNode(1);
        ListNode ln33 = new ListNode(0, ln34);
        ListNode ln32 = new ListNode(0, ln33);
        ListNode ln31 = new ListNode(0, ln32);
        ListNode ln30 = new ListNode(0, ln31);
        ListNode ln29 = new ListNode(0, ln30);
        ListNode ln28 = new ListNode(0, ln29);
        ListNode ln27 = new ListNode(0, ln28);
        ListNode ln26 = new ListNode(0, ln27);
        ListNode ln25 = new ListNode(0, ln26);
        ListNode ln24 = new ListNode(0, ln25);
        ListNode ln23 = new ListNode(0, ln24);
        ListNode ln22 = new ListNode(0, ln23);
        ListNode ln21 = new ListNode(0, ln22);
        ListNode ln20 = new ListNode(0, ln21);
        ListNode ln19 = new ListNode(0, ln20);
        ListNode ln18 = new ListNode(0, ln19);
        ListNode ln17 = new ListNode(0, ln18);
        ListNode ln16 = new ListNode(0, ln17);
        ListNode ln15 = new ListNode(0, ln16);
        ListNode ln14 = new ListNode(0, ln15);
        ListNode ln13 = new ListNode(0, ln14);
        ListNode ln12 = new ListNode(0, ln13);
        ListNode ln11 = new ListNode(0, ln12);
        ListNode ln10 = new ListNode(0, ln11);
        ListNode ln9 = new ListNode(0, ln10);
        ListNode ln8 = new ListNode(0, ln9);
        ListNode ln7 = new ListNode(0, ln8);
        ListNode ln6 = new ListNode(0, ln7);
        ListNode ln5 = new ListNode(0, ln6);
        ListNode lnSeconde = new ListNode(1, ln5);

        assertEquals(
                "ListNode{val=6, next=ListNode{val=6, next=ListNode{val=4, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=0, next=ListNode{val=1, next=null}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}",
                addTwoNumbers.solution(lnFirst, lnSeconde).toString()
        );
    }

}
