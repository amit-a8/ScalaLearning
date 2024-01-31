import scala.collection.mutable._

class PriorityQueueTest(){
  def AllocateSpace(process: Array[Int], new_p:Int)= {
    var count = 0 
    var sum = 0 
    val res = new HashMap[Int, Int]{override def default(key: Int): Int = 0}
    res.put(0,1)
    for(i <- 0 until process.length){
      sum += process(i)
      if (res.contains(sum - new_p))
        count += 1 
      res.put(sum, res(sum) + 1)
      
    }
    count
  }
}