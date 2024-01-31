object GroupAna extends App{
	def testWorking():Unit = {
		println("hello world")
	}
	def getAlphaMetrics(strs: List[String]): Iterable[List[String]]={
		val aStr = "a"
		val res = scala.collection.mutable.Map[List[Int], List[String]]()
		for (inputWord <- strs){


			var alphaInt:List[Int] = List.fill(26){0}
			for (i <- 0 to inputWord.length -1){
				var index:Int = inputWord.codePointAt(i) - aStr.codePointAt(0)
				//update list here

				alphaInt = alphaInt.updated(index, alphaInt.apply(index)+1)

			}
			if (res.contains(alphaInt))
				res(alphaInt) = res(alphaInt) :+ inputWord
			else
				res(alphaInt) = List(inputWord)
			
			
		}
		res.values
	}

	val anagram: Iterable[List[String]] =  getAlphaMetrics(List("duel","dule","speed","spede","deul","cars"))
	val query = "spede"
	for (i <- anagram){
		if (i.contains(query))
			println(i)
		
	}
}
