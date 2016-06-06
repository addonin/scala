package chapter9

import java.io.{FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream}

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Dmytro_Adonin on 6/6/16.
  */
object Ex10 extends App {
  val ann = Person("Ann")
  val peter = Person("Peter")
  val john = Person("John")
  ann.addFriend(peter)
  ann.addFriend(john)
  john.addFriend(peter)
  val all = Array(ann, peter, john)
  println(all.mkString(", "))

  val out = new ObjectOutputStream(new FileOutputStream("person.out"))
  out.writeObject(all)
  out.close()

  val in = new ObjectInputStream(new FileInputStream("person.out"))
  val res = in.readObject().asInstanceOf[Array[Person]]
  in.close()
  println(res.mkString(", "))
}

class Person(val name: String) extends Serializable {
  private val friends = new ArrayBuffer[Person]
  def addFriend(f : Person) = friends += f
  override def toString = "%s {%s}".format(name, friends.map(_.name).mkString(", "))
}

object Person {
  def apply(name : String) = new Person(name)
}
