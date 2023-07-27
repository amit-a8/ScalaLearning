case class LinkedList[T](){
	var head:Node[T] = null ;
	def insert(data:T)= {
		head match {
			case null => head = new Node(data, null)

			case _ =>{
				var last:Node[T] = head 
				while(last.next != null){
					last = last.next
				}
				last.next = new Node[T](data, null )
			}
		}
	}
	def printList() = {
		var temp:Node[T] = head 
		while(temp!=null){
			println(temp.data)
			temp= temp.next
		}
	}

	def createLinkedList(arr:Array[T]):LinkedList[T] = {
		for (a<- arr){
			this.insert(a)
		}
		this
	}

}

sealed case class Node[T](var data:T, var next:Node[T]){
	def printNode():Unit={
		println(data)
	}
}