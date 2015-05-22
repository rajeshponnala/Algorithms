package com.example

object UnionFunction {

  def quickFind(
    data: Map[Int,Set[Int]],
    p: Int,
    q: Int): Boolean = (data.get(p),data.get(q)) match {
    case (Some(x),Some(y)) => x == y
    case _ => false
  }

  def quickUnion(
    data: Map[Int,Set[Int]],
    p: Int,
    q: Int): Map[Int,Set[Int]] = {
    val set= (data.get(p),data.get(q)) match {
        case (None,None) =>Set(p,q)
        case (Some(x),None) => x + q
        case (None,Some(x)) => x + p
        case (Some(x),Some(y)) => if(x == y) x else  x ++ y
     }
     set.foldLeft(data)((acc,s) => acc + (s -> set))
   }
 }
