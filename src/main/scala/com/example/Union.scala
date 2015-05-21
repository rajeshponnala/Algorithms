package com.example

case class Union() {

   val data = scala.collection.mutable.Map.empty[Int,scala.collection.mutable.Set[Int]]
   var data1 = Map.empty[Int,scala.collection.mutable.Set[Int]]
   var data2 = Map.empty[Int,scala.collection.immutable.Set[Int]]

  def quickFind(p: Int,q: Int) = (data.get(p),data.get(q)) match {
     case (Some(x),Some(y)) =>  x == y
     case _ => false
  }

  def quickFind1(p: Int,q: Int) = (data1.get(p),data1.get(q)) match {
     case (Some(x),Some(y)) =>  x == y
     case _ => false
  }

  def quickFind2(p: Int,q: Int) = (data2.get(p),data2.get(q)) match {
     case (Some(x),Some(y)) =>  x == y
     case _ => false
   }

   def quickUnion(p: Int,q: Int): Unit = {
     val set = (data.get(p),data.get(q)) match {
        case (None,None) => scala.collection.mutable.Set(p,q)
        case (Some(x),None) => x+=q
        case (None,Some(x)) => x+=p
        case (Some(x),Some(y)) => x ++ y
     }
     set.foreach(s => data+=(s -> set))
   }

  def quickUnion1(p: Int,q: Int): Unit = {
     val set = (data1.get(p),data1.get(q)) match {
        case (None,None) => scala.collection.mutable.Set(p,q)
        case (Some(x),None) => x+=q
        case (None,Some(x)) => x+=p
        case (Some(x),Some(y)) => x ++ y
     }
     data1 = set.foldLeft(data1)((acc,s) => acc + (s -> set))
  }

  def quickUnion2(p: Int,q: Int): Unit = {
     val set = (data2.get(p),data2.get(q)) match {
        case (None,None) =>Set(p,q)
        case (Some(x),None) => x + q
        case (None,Some(x)) => x + p
        case (Some(x),Some(y)) => x ++ y
     }
     data2 = set.foldLeft(data2)((acc,s) => acc + (s -> set))
   }
}
