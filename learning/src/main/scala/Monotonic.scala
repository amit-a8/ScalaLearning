object Monotonic extends App {
	def isMonotonic(scores : Array[Int]) : Boolean= {
		var increasing:Boolean = true 
		var desc: Boolean = true 
		for (i <- 0 to scores.size -2 ){
			if(scores(i) < scores(i+1))
				 increasing = false
		}
		for (i <- 0 to scores.size -2 ){
			if(scores(i) > scores(i+1))
				 desc = false
		}
		increasing || desc 
	}
	val arr:Array[Int] = Array(1,2,2,3,4,5)
	println(isMonotonic(arr))
}