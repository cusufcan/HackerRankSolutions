fun reverse(llist: SinglyLinkedListNode?): SinglyLinkedListNode? {
    var tempLlist: SinglyLinkedListNode? = null
    var myLlist = llist
    while (myLlist != null) {
        val tempNode = SinglyLinkedListNode(myLlist.data)
        tempNode.next = tempLlist
        tempLlist = tempNode
        myLlist = myLlist.next
    }
    return tempLlist
}


data class SinglyLinkedListNode(
    var data: Int? = null,
    var next: SinglyLinkedListNode? = null,
)