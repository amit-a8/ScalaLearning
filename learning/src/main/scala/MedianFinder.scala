import scala.collection.mutable 
import math.Fractional.Implicits.infixFractionalOps


case class MedianFinder(){
	val maxHeap = new mutable.PriorityQueue[Int]()
	val minHeap = new mutable.PriorityQueue[Int]()(Ordering.Int.reverse)

	def insertAge(num:Int):Unit = {
		val smallPeek = maxHeap.headOption
		val largePeek = minHeap.headOption
		println(smallPeek)
		println(largePeek)
		(smallPeek, largePeek) match {
			case (None, _) => maxHeap += num
			case (_, None) => maxHeap += num
				minHeap += maxHeap.dequeue
			case(Some(sm), Some(la)) if num < sm =>
				maxHeap += num
				if(maxHeap.size > minHeap.size + 1){
					minHeap += maxHeap.dequeue()
				}
			case _ =>
				minHeap += num
				if (minHeap.size > minHeap.size){
					maxHeap += minHeap.dequeue()
				}
		}
	}
	def findMedian():Double = {
		if (minHeap.size != maxHeap.size){
			maxHeap.head
		}else{
			(maxHeap.head.toDouble + minHeap.head.toDouble) / 2.0f
		}
	}

}
