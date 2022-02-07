package challengemarch

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution2 {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        var p1 = headA
        var p2 = headB
        while (p1 != p2) {
            p1 = if (p1 == null) headB else p1.next
            p2 = if (p2 == null) headA else p2.next
        }
        return p2
    }
}