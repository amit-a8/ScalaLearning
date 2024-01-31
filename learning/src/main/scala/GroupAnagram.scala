object GroupAnagram extends App {
    def groupTitles(strs:List[String]):Iterable[List[String]] = {
      val res = scala.collection.mutable.Map[List[Int], List[String]]()
      println(res)
      var aStr = "a"
      for( s <- strs){
          
          var count = List.fill(26){0}

          for( i <- 0 to s.length-1){
              println(s.codePointAt(i))
              println(aStr.codePointAt(0))
              var index:Int = s.codePointAt(i) - aStr.codePointAt(0)
              println(index)
              var value  = count(index) + 1
              println(value)
              count = count.updated(index, value)
          }
        //println(count) 
          if(res.contains(count))
              res(count) = res(count) :+ s
          else
              res(count) = List(s)
      }
        res.values
    }

  //Driver code

  val titles = List("duel","dule","speed","spede","deul","cars")
  val gt = groupTitles(titles)
  println(gt)
  // val query = "spede" 
  
  // println("Searching for all titles")
  // for (g <- gt)
  //     if (g.contains(query))
  //         print(g)
  
}