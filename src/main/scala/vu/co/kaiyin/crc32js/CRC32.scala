package vu.co.kaiyin.crc32js

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Created by kaiyin on 05/11/2015.
  */
@JSName("CRC32")
@js.native
object CRC32 extends js.Object {
  def str(s: String): Int = js.native
  def bstr(s: String): Int = js.native
  def buf(a: js.Array[Int]): Int = js.native
}
