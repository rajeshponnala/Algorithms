package com.example

object Hello {
  def main(args: Array[String]): Unit = {

    val x = new Union(10)
    println(x.data)
    x.quickUnion(4,3)
    println(x.data)
    x.quickUnion(3,8)
    println(x.data)
    x.quickUnion(6,5)
    println(x.data)
    x.quickUnion(9,4)
    println(x.data)
    x.quickUnion(2,1)
    println(x.data)
    x.quickUnion(5,0)
    println(x.data)
    x.quickUnion(7,2)
    println(x.data)
    x.quickUnion(6,1)
    println(x.data)
  }
}
