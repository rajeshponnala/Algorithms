import org.scalatest._
import org.scalatest.matchers.ShouldMatchers
import com.example.Searching._

class SearchingSpec extends FlatSpec with ShouldMatchers {

  "Binary Search " should "return index 2" in {
    binarySearch(Vector(1, 3, 4, 6, 8, 9, 11),4) should equal(2)
  }

  "Binary Search " should "return index 7" in {
    binarySearch(Vector(1, 3, 4, 6, 8, 9, 11,75),75) should equal(7)
  }

  "Binary Search " should "return -1" in {
    binarySearch(Vector(1, 3, 4, 6, 8, 9, 11),100) should equal(-1)
  }

   "Binary Search1 " should "return index 2" in {
    binarySearch1(Vector(1, 3, 4, 6, 8, 9, 11),4) should equal(2)
  }

  "Binary Search1 " should "return index 3" in {
    binarySearch1(Vector(1, 3, 4, 6, 8, 9, 11,75),6) should equal(3)
  }

  "Binary Search1 " should "return -1" in {
    binarySearch1(Vector(1, 3, 4, 6, 8, 9, 11),100) should equal(-1)
  }

}
