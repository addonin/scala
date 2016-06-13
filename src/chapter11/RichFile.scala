package chapter11

/**
  * @author Dmytro_Adonin 
  * @since 6/10/16
  */
object RichFile {

  /*def unapply(pathname: String): Option[(String, String, String)] = {
    val pathDivider: Int = pathname.lastIndexOf("/")
    if (pathDivider == -1) None else {
      val path = pathname.substring(0, pathDivider)
      val file = pathname.substring(pathDivider + 1)
      val name = file.substring(0, file.lastIndexOf("."))
      val ext = file.substring(file.lastIndexOf(".") + 1)
      Some(path, name, ext)
    }
  }*/

  def unapplySeq(pathname: String): Option[Seq[String]] = {
    if (pathname.lastIndexOf("/") == -1) None else Some(pathname.trim.split("/"))
  }

}

object Ex9 extends App {
  //val RichFile(path, name, ext) = "/path/file.ext"
  //println(path + " : " + name + " : " + ext)
  val RichFile(longer, path2, file) = "longer/path/file.ext"
  println(longer + " : " + path2 + " : " + file)
}
