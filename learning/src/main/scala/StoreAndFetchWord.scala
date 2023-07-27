import scala.collection.mutable.HashMap

class NodeX(){
  var children:HashMap[Character, NodeX] = new HashMap[Character, NodeX]()
  var isWord = false 
}

class StoreAndFetchWord(){
  var root = new NodeX

  def insertWord(word:String):Unit = {
    var node = this.root 
    for (c <- word.toCharArray){
      if (!node.children.contains(c))
        node.children(c) = new NodeX
      node = node.children(c)
    }
    node.isWord = true
  }

  def searchWord(word:String): Boolean = {
    var node = this.root
    for (c <- word.toCharArray ){
      if (!node.children.contains(c)) return false 
      node = node.children(c)
    }
    node.isWord
  }

  def startsWith(word:String):Boolean = {
    var node = this.root 
    for (c <- word.toCharArray){
      if (!node.children.contains(c)) return false 
      node = node.children(c)
    }
    true 
  }

}