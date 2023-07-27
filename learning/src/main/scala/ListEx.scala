
case class ListEx(){
	def getCount(inputList:List[Int]):Int = {
		//inputList.foreach(println)
		val aa:Int = 10
		val inputListUpdated:List[Int] = 20::inputList
		val listUpdated:List[Int] = 30::inputListUpdated
		val appendedList:List[Int] = listUpdated :+ 40
		inputListUpdated.length
		appendedList.foreach(println)
		val tailList:List[Int] = appendedList.tail
		tailList.foreach(println)
		appendedList.length

	}
	def getSecElement(inputList:List[Int]): Int = {
		val count = inputList.length
		val index = count - 2
		inputList.apply(index)
	}

	def listLength(inputList:List[Int]): Int = inputList match {
		case Nil => 0
		case _ :: tail =>  1 + listLength(tail)
	}

}