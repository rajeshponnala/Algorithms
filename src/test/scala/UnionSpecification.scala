import org.scalatest._
import org.scalatest.matchers.ShouldMatchers
import com.example._

class UnionSpecification extends FlatSpec with ShouldMatchers {
    val qu =  new Union
    qu.quickUnion(1,2)
    qu.quickUnion(2,3)
    qu.quickUnion(3,4)
    qu.quickUnion(4,5)
    qu.quickUnion(7,10)
    qu.quickUnion1(1,2)
    qu.quickUnion1(2,3)
    qu.quickUnion1(3,4)
    qu.quickUnion1(4,5)
    qu.quickUnion1(7,10)
    qu.quickUnion2(1,2)
    qu.quickUnion2(2,3)
    qu.quickUnion2(3,4)
    qu.quickUnion2(4,5)
    qu.quickUnion2(7,10)

   "quick Union" should "return connected" in {
    qu.quickFind(3,4) should equal(true)
   }

  "point (3,4) and (4,3)" should "be equal" in {
    qu.quickFind(3,4) should equal(qu.quickFind(4,3))
  }

  "point 3 and 5" should "return connected" in {
     qu.quickFind(3,5) should equal(true)
  }

  "point 1 and 3" should "return  connected" in {
    qu.quickFind(1,3) should equal(true)
  }

  "point 1 and 5" should "return  connected" in {
    qu.quickFind(1,3) should equal(true)
  }

  "point 1 and 7" should "not connected" in {
   qu.quickFind(1,7) should equal(false)
  }

  "quick Union of union 1" should "return connected" in {
    qu.quickFind1(3,4) should equal(true)
   }

  "point (3,4) and (4,3) of union 1" should "be equal" in {
    qu.quickFind1(3,4) should equal(qu.quickFind(4,3))
  }

  "point 3 and 5 of union 1" should "return connected" in {
     qu.quickFind1(3,5) should equal(true)
  }

  "point 1 and 3 of union 1" should "return  connected" in {
    qu.quickFind1(1,3) should equal(true)
  }

  "point 1 and 5 of union 1" should "return  connected" in {
    qu.quickFind1(1,3) should equal(true)
  }

  "point 1 and 7 of union 1" should "not connected" in {
   qu.quickFind1(1,7) should equal(false)
  }
  "quick Union of union 2" should "return connected" in {
    qu.quickFind2(3,4) should equal(true)
   }

  "point (3,4) and (4,3) of union 2" should "be equal" in {
    qu.quickFind2(3,4) should equal(qu.quickFind2(4,3))
  }

  "point 3 and 5 of union 2" should "return connected" in {
     qu.quickFind2(3,5) should equal(true)
  }

  "point 1 and 3 of union 2" should "return  connected" in {
    qu.quickFind2(1,3) should equal(true)
  }

  "point 1 and 5 of union 2" should "return  connected" in {
    qu.quickFind2(1,3) should equal(true)
  }

  "point 1 and 7 of union 2" should "not connected" in {
   qu.quickFind2(1,7) should equal(false)
  }
}
