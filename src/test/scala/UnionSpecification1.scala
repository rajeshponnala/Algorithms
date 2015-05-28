import com.example.UnionFunction._
import org.scalacheck._

object UnionSpecification1 extends Properties("Union") {

  import Prop.forAll
  var quf = Map.empty[Int,Set[Int]]

  val genOfTuples = for {
    x <- Gen.choose(0,50)
    y <- Gen.choose(0,50)
  } yield (x,y)

  val genOfTuples1 = for {
    x <- Gen.choose(51,100)
    y <- Gen.choose(51,100)
  } yield (x,y)

  property("connected") = forAll(Gen.listOf(genOfTuples)) { l =>
   l.foreach( t => quf = quickUnion(quf,t._1,t._2))
   l.forall( x => quickFind(quf,x._1,x._2)) == true
  }

  property("not connected") = forAll(Gen.listOf(genOfTuples1)) { l =>
    l.forall( x => !quickFind(quf,x._1,x._2)) == true
  }
}
