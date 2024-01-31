import scala.collection.mutable._

class kSubArray(){
	def bruteForce(sum:Int,array:Array[Int]): Int = {
		val lengthArr = array.length
		println(lengthArr)
		var count = 0
		for (i <- 0 until lengthArr-1){
			var thisSum = array(i) 
			for (j <- i until lengthArr-1){
				thisSum += array(j)
				if (thisSum == sum){
					count = count + 1
				}
			}
		}
		println(count)
		count 
	}
	def usingHashMap(sum:Int, array:Array[Int]): Int = {
		val lengthArrArr = array.length
		val carSum : HashMap[Int,Int] = new HashMap[Int, Int](){override def default(key:Int)=0}
		carSum.put(0,1)
		var thissum = 0 
		var count = 0 
		for (i <- 0 until lengthArrArr){
			thissum += array(i)
			println(array(i))
			//println(carSum)
			if (carSum.contains(thissum- sum)){
				println("in loop")

				count += carSum(thissum- sum)
			}
			carSum.put(thissum,carSum(thissum)+1)
		}
		
		count
	}
	def missingElement(arr: Array[Int], k: Int): Int = {
	  5
	}

}

//HashMap(0 -> 1, 16 -> 1, 3 -> 1, 19 -> 1, 20 -> 1, 7 -> 1, 24 -> 1, 26 -> 1, 14 -> 1)
//HashMap(0 -> 1, 16 -> 1, 3 -> 1, 19 -> 1, 20 -> 1, 7 -> 1, 24 -> 1, 14 -> 1)


