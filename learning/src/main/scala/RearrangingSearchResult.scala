import scala.collection.mutable.{HashMap, PriorityQueue}

class RearrangingSearchResult(){
	def testMethod():Unit = {
		println("hello world aa")
	}
	def reorganizeResults(initialOrder: String): String = {
	    val map = new HashMap[Character, Int](){override def default(key:Character) = 0  }
	    for (c <- initialOrder.toCharArray) {
	      val freq = map(c) + 1
	      if (freq > (initialOrder.length + 1) / 2)
	        return initialOrder
	      if(map.contains(c)){
	        map(c) = freq
	      }
	      else{
	        map(c) += 1
	      }
	     }
	    val pq = new PriorityQueue[Array[Int]]()((a, b) => a(1) - b(1))
	    for (c <- map.keySet) {
	      pq += Array[Int](c.toInt, map(c))
	    }
	    var result = new StringBuilder
	    while (!pq.isEmpty) {
      	var first = pq.dequeue()
      	if (result.length == 0 || first(0) != result.charAt(result.length - 1)) {
        	result.append(first(0).toChar)
        	first(1) -= 1;
        	if (first(1) > 0) {
          	pq += first
          }
        }
      else if(!pq.isEmpty) {
        var second = pq.dequeue()
        result.append(second(0).toChar)
        second(1) -= 1;
        if (second(1) > 0) {
          pq += second
        }
        pq += first
      }
    }
	result.toString()
}
}