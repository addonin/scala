package chapter9

/**
  * Created by Dmytro_Adonin on 6/6/16.
  */
object Ex8 extends App {
  val source = scala.io.Source.fromURL("https://github.com")
  val pattern = """<img.*? src="(.+?)"""".r
  for (pattern(imgSrc) <- pattern.findAllIn(source.mkString)) println(imgSrc)
}
