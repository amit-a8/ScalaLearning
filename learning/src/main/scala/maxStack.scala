import scala.collection.mutable.Stack
import java.{util => ju}
object maxStack extends App{
	class getMaxStack(){
		val mainStack = new Stack[Int]();
		val maxS = new Stack[Int]();
		def pushElt(num:Int):Unit = {
			mainStack.push(num)
			if (maxS.isEmpty){
				maxS.push(num)
			}else{
				maxS.push(math.max(num, maxS.top))
			}
		}
		def popElt():Int = {
			maxS.pop
			
		}
		def findMax():Int = {
			maxS.top
		}
	}
	var maxStack:getMaxStack = new getMaxStack();
	  maxStack.pushElt(5);
	  maxStack.pushElt(0);
	  maxStack.pushElt(2);
	  maxStack.pushElt(4);
	  maxStack.pushElt(6);
	  maxStack.pushElt(3);
	  maxStack.pushElt(10);

	  println("Maximum Rating: " + maxStack.findMax());

	  maxStack.popElt();
	  println("\nAfter clicking back button\n");

	  println("Maximum Rating: " + maxStack.findMax());

}