case class VectorEx(){
	def testVector():Unit = {
		val numVec = Vector(1,2,3,4)
		numVec.foreach(println)
		val patternVec = Vector.empty
		val pat2 = patternVec :+ "d~d"
		println(pat2)

	}
}