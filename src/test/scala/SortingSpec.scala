import org.scalatest._
import org.scalatest.matchers.ShouldMatchers
import com.example.Sorting._

class SortingSpec extends FlatSpec with ShouldMatchers {
  "Selection Sort " should "return empty Array" in {
     selectionSort(Array(),_< _) should equal (Array())
  }

  "Selection Sort" should "return array in ascending order" in {
    selectionSort(Array(6,5,3,1,8,7,2,4),_<_) should equal(Array(1,2,3,4,5,6,7,8))
  }

  "Selection Sort" should "return array in descending order" in {
    selectionSort(Array(-9,6,4,5,8,7,10),_>_) should equal(Array(10,8,7,6,5,4,-9))
  }
}
