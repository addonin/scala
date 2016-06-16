package chapter15

import scala.beans.BeanProperty

/**
  * @author dimon
  * @since 16/06/16.
  */
@deprecated
class AnnotationsPlacement [@specialized T] @throws(classOf[RuntimeException]) (@BeanProperty val value: String /*@cps[Unit]*/) {

  @transient var counter: Int = 0

  @org.junit.Test
  def doSomething(/*@NotNull*/ v: Int = 0): String = {
    v.toString: @unchecked
  }

}
