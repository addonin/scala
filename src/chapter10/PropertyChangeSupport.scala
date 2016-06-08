package chapter10

import java.beans.{PropertyChangeEvent, PropertyChangeListener}

/**
  * Created by Dmytro_Adonin on 6/8/16.
  */
trait PropertyChangeSupport {

  private val support = new java.beans.PropertyChangeSupport(this)

  def addPropertyChangeListener(listener:PropertyChangeListener) {
    support.addPropertyChangeListener(listener)
  }

  def addPropertyChangeListener(propertyName: String, listener:PropertyChangeListener) {
    support.addPropertyChangeListener(propertyName, listener)
  }

  def fireIndexedPropertyChange(propertyName: String, index:Int, oldValue:Any, newValue:Any) {
    support.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)
  }

  def firePropertyChange(propertyName: String, oldValue:Any, newValue:Any) {
    support.firePropertyChange(propertyName, oldValue, newValue)
  }

  def getPropertyChangeListeners =
    support.getPropertyChangeListeners()

  def getPropertyChangeListeners(propertyName: String) =
    support.getPropertyChangeListeners(propertyName)

  def hasListeners(propertyName: String) =
    support.hasListeners(propertyName)

  def removePropertyChangeListener(listener:PropertyChangeListener) {
    support.removePropertyChangeListener(listener)
  }

  def removePropertyChangeListener(propertyName: String, listener:PropertyChangeListener) {
    support.removePropertyChangeListener(propertyName, listener)
  }

}

class ObservablePoint(sx:Int, sy:Int) extends java.awt.Point(sx, sy) with PropertyChangeSupport {

  override def move(x:Int, y:Int) {
    val oldX = this.x
    val oldY = this.y
    super.move(x, y)
    if (oldX != this.x)
      firePropertyChange("x", oldX, this.x)
    if (oldY != this.y)
      firePropertyChange("y", oldY, this.y)
  }

  override def setLocation(x:Double, y:Double) {
    val oldX = this.x
    val oldY = this.y
    super.setLocation(x, y)
    if (oldX != this.x)
      firePropertyChange("x", oldX, this.x)
    if (oldY != this.y)
      firePropertyChange("y", oldY, this.y)
  }

  override def setLocation(x:Int, y:Int) {
    super.setLocation(x, y)
  }

  override def translate(dx:Int, dy:Int) {
    val oldX = this.x
    val oldY = this.y
    super.translate(dx, dy)
    if (oldX != this.x)
      firePropertyChange("x", oldX, this.x)
    if (oldY != this.y)
      firePropertyChange("y", oldY, this.y)
  }

}

object Ex5 extends App {
  val p = new ObservablePoint(1, 2)
  p.addPropertyChangeListener(new PropertyChangeListener {
    def propertyChange(evt:PropertyChangeEvent) {
      printf("%s: %s => %s\n",
        evt.getPropertyName,
        evt.getOldValue.toString,
        evt.getNewValue.toString)
    }
  })
  p.move(3, 3)
}


