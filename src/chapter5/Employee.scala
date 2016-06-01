package chapter5

/**
  * @author dimon
  * @since 01/06/16.
  */
class Employee {
  // solution by the Horstmann
  private var _name = "John Q. Public"
  var salary = 0.0
  def this(n: String, s: Double) { this(); _name = n; salary = s; }
  def name = _name
}
