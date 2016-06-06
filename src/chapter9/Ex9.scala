package chapter9

import java.io.File

/**
  * Created by Dmytro_Adonin on 6/6/16.
  */
object Ex9 extends App {

  var counter = 0
  val root = new File("/Users/Dmytro_Adonin/LXM/lx-api")

  for (dir <- subdirs(root); filename <- dir.listFiles() if filename.getCanonicalFile.getName.endsWith(".scala")) {
    println(filename.getCanonicalFile.getName)
    counter += 1
  }

  println(counter)

  def subdirs(directory: File): Iterator[File] = {
    val children = directory.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subdirs _)
  }

}
