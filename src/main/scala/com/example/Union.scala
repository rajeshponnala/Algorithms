package com.example

case class Union() {

   val data = scala.collection.mutable.Map.empty[Int,scala.collection.mutable.Set[Int]]
   def quickFind(p: Int,q: Int) = (data.get(p),data.get(q)) match {
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
}
