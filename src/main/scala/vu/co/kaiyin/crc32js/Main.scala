package vu.co.kaiyin.crc32js

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport

/**
  * Created by kaiyin on 05/11/2015.
  */
@JSExport
object Main {
  @JSExport
  def main(): Unit = {
    val p1 =  dom.document.createElement("p")
    p1.textContent = CRC32.buf(js.Array(32, 214, 288, 1822)).toString
    val p2 = dom.document.createElement("p")
    p2.textContent = CRC32.str("\u2603").toString + " " + CRC32.str("\u0003").toString
    val p3 = dom.document.createElement("p")
    p3.textContent = CRC32.bstr("\u2603").toString + " " + CRC32.bstr("\u0003").toString
    val p4 = dom.document.createElement("p")
    p4.textContent = CRC32.buf(js.Array(0x2603)).toString + " " + CRC32.buf(js.Array(0x0003)).toString
    dom.document.getElementById("text").appendChild(p1)
    dom.document.getElementById("text").appendChild(p2)
    dom.document.getElementById("text").appendChild(p3)
    dom.document.getElementById("text").appendChild(p4)
  }

}
