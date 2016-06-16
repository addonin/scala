package chapter15

import org.junit.runner.RunWith
import org.junit.runners.Suite

/**
  * @author dimon
  * @since 16/06/16.
  */
@RunWith(classOf[Suite])
@Suite.SuiteClasses(classOf[Test])
class TestRunner

class Test {

  @Test
  def dummyTest(): Unit = {
    org.junit.Assert.assertEquals("Hmm...", 2, 1)
  }

}

