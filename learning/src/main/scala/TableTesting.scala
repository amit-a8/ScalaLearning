object TableTesting extends  App {
	while(true){
		val a = scala.io.StdIn.readInt()
		println("*************")
		println(s"Table for ${a}")
		for(i <- 1 to 10){
			println(s" ${a} * ${i} = ${a*i}")
		}
		println("Done")
		println("*************")
	}
}