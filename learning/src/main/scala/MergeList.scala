	import scala.collection.mutable.ArrayBuffer
	object MergeList{
	def test():Unit={
		println("hello world")
	}
	 def merge2Country(l1: LinkedList[Int], l2: LinkedList[Int]): LinkedList[Int] = {

	//auxilary node for make a virtual list
	var auxHead: Node[Int] = new Node[Int](-1, null)

	var dummy: Node[Int] = auxHead
	//heads of both lists
	var l1Head = l1.head
	var l2Head = l2.head

	while (l1Head != null && l2Head != null) {
	  if (l1Head.data <= l2Head.data) {
	    auxHead.next = l1Head
	    l1Head = l1Head.next
	  }
	  else {
	    auxHead.next = l2Head
	    l2Head = l2Head.next
	  }
	  auxHead = auxHead.next
	}
	//if any of the list has still content
	if (l1Head != null)
	  auxHead.next = l1Head
	else
	  auxHead.next = l2Head

	//create a dummy linked-list which will hold the head of merged nodes
	var auxList: LinkedList[Int] = new LinkedList[Int]()
	auxList.head = dummy.next

	return auxList

	}

	def mergeKCounty(lists: ArrayBuffer[LinkedList[Int]]): LinkedList[Int] = {

	var mergedList = lists(0)
	var i = 1
	if (mergedList != null) {
	  while (i < lists.size) {
	    mergedList = merge2Country(mergedList, lists(i))
	    i += 1
	  }
	  //concatenated list
	  return mergedList
	}
	//empty list
	LinkedList[Int]()
	}

	}