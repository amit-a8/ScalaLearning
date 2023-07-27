import scala.collection.mutable.ArrayBuffer


object NewtonMethod extends App{
  def abs(x:Double): Double = {
    if (x < 0) -1 *x else x 
  }
  def isGoodEnough(guess: Double, x:Double):Boolean={
    abs(guess * guess -x ) / x < 0.000001
  }
  def improve(guess: Double, x: Double)={
    (guess + x/guess)/2
  }
  def sqrtIter(guess: Double, x : Double): Double={
    if(isGoodEnough(guess, x)) guess 
    else sqrtIter(improve(guess, x),x) 
  }
  def sum(f:Int=>Int, a:Int, b:Int):Int = {
    if(a>b) 0
    else f(a) + sum(f,a+1,b) 
  }
  def id(x:Int):Int = x

  println(sum(x=>x,5,8))


  def cube(x:Int)= x*x*x
  def sumC(f:Int => Int)(a:Int, b:Int):Int = {
    if (a>b) 0
    else f(a) + sumC(f)(a+1,b)
  }

    println("Hello World!")
    val keys = Array("the", "a", "there", "answer", "any", "by", "bye", "their", "abc")
    println("Keys to insert: ")
    for(k <- keys)
      print(k + ", ")
    println()
    val d = new StoreAndFetchWord
    for (i <- 0 until keys.length) {
      d.insertWord(keys(i))
    }
    println("Searching 'there' in the dictionary results: " + d.searchWord("there"))

    // val inputList = List(1,2,3,4,5,6,7,8)
    // val listExObj = ListEx()
    // val count = listExObj.getCount(inputList)
    // println(count)
    // println(listExObj.getSecElement(inputList))
    // println("aaa")
    // println(listExObj.listLength(inputList))

    val vecObj = VectorEx()
    vecObj.testVector()
    val testObj = ScalaTest()
    testObj.hello()
    val inputList: List[Int] = List(1,2,3,4,5,6)
    println(testObj.getLenthOfList(inputList))
    println(testObj.printWord("there"))
    val inputArray : Array[Int] = Array(1,4,6,9)
    testObj.getProductExceptItself(inputArray)

  // var medianAge = MedianFinder()
  // medianAge.insertAge(22)
  // medianAge.insertAge(35)
  // print("The recommended content will be for ages under: ")
  // println(medianAge.findMedian())
  // medianAge.insertAge(30)
  // print("The recommended content will be for ages under: ")
  // println(medianAge.findMedian())
  // medianAge.insertAge(25)
  // print("The recommended content will be for ages under: ")
  // println(medianAge.findMedian())

  // val res = sumC(cube)(1,5)
  // println(res)
  // MergeList.test()
  // var a: LinkedList[Int] = new LinkedList();
  // a.createLinkedList(Array(11, 41, 51))


  // var b: LinkedList[Int] = new LinkedList();
  // b.createLinkedList(Array(21, 23, 42))

  // var c: LinkedList[Int] = new LinkedList();
  // c.createLinkedList(Array(25, 56, 66, 76))

  // //print("All movie ID's from best to worse are:")

  // var listOfLists: ArrayBuffer[LinkedList[Int]] = new ArrayBuffer[LinkedList[Int]]();
  // listOfLists.addOne(a);
  // listOfLists.addOne(b);
  // listOfLists.addOne(c);
  // print("All movie ID's from best to worse are:")
  // var x = MergeList.mergeKCounty(listOfLists)

  //x.printList()


}


