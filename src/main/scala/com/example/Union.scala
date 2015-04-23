package com.example

case class Union(n: Int) {

  require(n > 0,"value should be greater than 0")

   var  data = (for(x <- 0 to n-1) yield x).toVector

  private def  quickFind(p : Int) = data(p)

  def isConnected(p: Int,q: Int) = quickFind(p) == quickFind(q)

  def quickUnion(p: Int,q: Int): Unit = {
    val qv = quickFind(q)
    val pv = quickFind(p)
    data = if(pv == qv) data else data.map { e => if(e==pv) qv else e}
  }
}
