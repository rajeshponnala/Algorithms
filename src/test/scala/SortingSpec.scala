import org.scalatest._
import org.scalatest.matchers.ShouldMatchers
import com.example.Sorting._
import scala.collection.mutable._

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

  "merge of two sorted lists of positive numbers" should  "return  merged list in sorted order(ascending)" in {
    merge(List(8,13,15,22),List(7,11,14,17,21)) should equal(MutableList(7,8,11,13,14,15,17,21,22))
  }

  "merge of two sorted lists of positive and negative numbers" should  "return  merged list in sorted order(ascending)" in {
    merge(List(8,13,15,22),List(-14,-11,7,17,21)) should equal(MutableList(-14,-11,7,8,13,15,17,21,22))
  }

  "merge of two empty lists " should  "return  empty list" in {
    merge(List(),List()) should equal(MutableList())
  }

  "merge of one  empty lists " should  "return another list" in {
    merge(List(),List(8,13,15,21)) should equal(MutableList(8,13,15,21))
  }

  "merge of two different length lists" should "return sorted list with all elements from both lists" in {
    merge(List(7,11,14),List(8,9,10,12,16,16,21)) should equal(MutableList(7,8,9,10,11,12,14,16,16,21))
  }


 }
