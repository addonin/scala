def sum(s: Int*) = {
  var result = 0
  for (i <- s) result += i
  result
}
sum(1 to 3: _*)
//lazy val words = scala.io.Source.fromFile("/blabla").mkString
def countdown() {
  for (i <- 10 to 0) println(i)
}
countdown()