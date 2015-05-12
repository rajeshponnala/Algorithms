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

  "Selection Sort" should "return negative integer array in ascending order" in {
    selectionSort(Array(-5,-7,-8,-3,-9,-2),_<_) should equal(Array(-9,-8,-7,-5,-3,-2))
  }

  "Selection Sort" should "return negative integer array in descending order" in {
    selectionSort(Array(-9,-5,-8,-3,-7,-2,-1),_>_) should equal(Array(-1,-2,-3,-5,-7,-8,-9))
  }

  "Selection Sort" should "return sorted  array(ascending) in same order" in {
    selectionSort(Array(1,2,3,4,5,6,7,8,9,10),_<_) should equal(Array(1,2,3,4,5,6,7,8,9,10))
  }

  "Selection Sort" should "return sorted  array(descending) in same order" in {
    selectionSort(Array(1,2,3,4,5,6,7,8,9,10),_>_) should equal(Array(10,9,8,7,6,5,4,3,2,1))
  }

  "Selection Sort" should "return reverse sorted  array in correct order(descending)" in {
    selectionSort(Array(-10,-9,-8,-7,-6,-5,-4,-3,-2,-1),_>_) should equal(Array(-1,-2,-3,-4,-5,-6,-7,-8,-9,-10))
  }

  "Selection Sort" should  "return duplicates array in sorted order(descending)" in {
    selectionSort(Array(5,6,7,8,5,9,2,2),_>_) should equal(Array(9,8,7,6,5,5,2,2))
  }

  "Selection Sort" should  "return  array in sorted order(descending)" in {
    selectionSort((1 to 10000).toArray, _>_) should equal((1 to 10000).toArray.reverse)
  }
}
