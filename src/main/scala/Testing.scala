object Testing extends App {
    val n = readLine().toInt
    val input = for(i <- 0 to n) yield readLine.split(" ")

    val z = for(i <- 0 until n) yield { for(j <- 0 until n) yield { input(j)(i) } }
    z.foreach(i => println(i.mkString(" ")))
}
