import scala.collection.mutable.Stack
import java.{util => ju}

object validateStack extends App {
  def validateStackSequences(pushed: Array[Int], popped: Array[Int]): Boolean = { 
    // write your code her
   val lenPushed = pushed.length
   val lenPopped = popped.length
   if (lenPushed != lenPopped)
            return false 
  var i :Int= 0 
   val stack:Stack[Int] = new Stack[Int]();
   for (elt <- pushed){
    stack.push(elt)
    while(!stack.isEmpty && stack.top == popped(i)){
      stack.pop()
      i = i+1
    }

   }
    if (stack.isEmpty)
      return true 
    false 
  }
   var pushOp:Array[Int] = Array(1,2,3,4,5);
      var popOp:Array[Int] = Array(5,4,3,2,1);

      if (validateStackSequences(pushOp, popOp) == true)
          println( "Session Successfull!" );
      else
          println( "Session Faulty!" )
}