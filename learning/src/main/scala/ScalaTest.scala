class ScalaTest(){
	def hello():Unit = {
		println("hello world")
	}

	def getLenthOfList(inputList:List[Int]):Int = inputList match {
		case Nil => 0
		case _ :: tail => 1 + getLenthOfList(tail )
	}
	def printWord(word:String):Unit = {
		for (c <- word){
			println(c)
		}
	}
	def getProductExceptItself(score:Array[Int]): Array[Int] = {
		val length = score.length
		println(length)
		val ranking = new Array[Int](length)
		ranking(0) = 1
		for (i <- 1 until length){
			ranking(i) = ranking(i-1) * score(i-1)
		}
		
		var right = 1
		for (i <- length -1 to 0 by -1){
			ranking(i) = ranking(i) * right
			right *= score(i)
		}
		ranking.foreach(el => print(el + "  "))
		ranking
	}

}