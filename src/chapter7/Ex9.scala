package chapter7

/**
  * Created by Dmytro_Adonin on 6/2/16.
  */
object Ex9 extends App {

  import java.lang.System

  val login = System.getProperty("user.name")
  val pass = Console.readLine("pass: ")

  if (pass == "Go0denough") println("Hello, " + login) else println("Bad pass")

}
