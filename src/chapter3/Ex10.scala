package chapter3

import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}

/**
  * Created by Dmytro_Adonin on 5/30/16.
  */
object Ex10 extends App {
  def test(): Unit = {
    val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
    println(flavors.getNativesForFlavor(DataFlavor.imageFlavor))
  }
  test()
}
