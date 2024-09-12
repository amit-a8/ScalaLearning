import scala.collection.mutable 

object PQTest extends App{

	def matchTest(x: Int): String = x match{
  		case 1 => "one"
  		case 2 => "two"
  		case _ => "other"
}
	println(matchTest(3) )
	println(matchTest(1)) 
	  
	case class MedianFinder() {
		val maxHeap = collection.mutable.PriorityQueue[Int]()
		val minHeap = collection.mutable.PriorityQueue[Int]()(Ordering.Int.reverse)

		def insertAge(num:Int):Unit = {
			val smallPeak = maxHeap.headOption
			val largePeak = minHeap.headOption
			
		
		}
	}
	var medianAge = MedianFinder()
 	//medianAge.insertAge(20)

	val pq = collection.mutable.PriorityQueue(1, 2, 5, 3, 7)(Ordering.Int.reverse)
	pq.addOne(10)
	pq.addOne(8)
	println(pq.toList)
	println(pq.headOption)

}