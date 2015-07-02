package com.example


object Sorting {

  def swap2(array: Array[Int],x: Int,y: Int) = {
    val temp = array(x)
    array(x) = array(y)
    array(y) = temp
  }

  def getIndex(
    array: Array[Int],
    cpos: Int,
    sortBy: (Int,Int) => Boolean) = {
    var sIndex = cpos
    var startIndex = cpos+1
    while(startIndex<array.length) {
      if(sortBy(array(startIndex),array(sIndex)))
        sIndex = startIndex
      startIndex = startIndex+1
    }
    sIndex
  }


  def selectionSort(
    array: Array[Int],
    sortBy: (Int,Int) => Boolean) = {
    for(i <- array.indices)
     swap2(array,i,getIndex(array,i,sortBy))
    array
  }

  def mergeSort(data: Vector[Int],l: Int,h: Int): Unit = {
    if(h<=l) return
     val mid = (l+h)/2
       mergeSort(data,l,mid)
       mergeSort(data,mid+1,h)
      println(l,mid)
  }



  def merge(list1: List[Int],list2: List[Int]): scala.collection.mutable.MutableList[Int] = {
     val l1l = list1.length
     val l2l = list2.length
     val result = scala.collection.mutable.MutableList[Int]()
     var i = 0
     var j  =0
     while(i <= l1l-1 &&  j <= l2l-1) {
       if(list1(i) > list2(j)) {
         result += list2(j)
         j = j + 1
       }
       else {
         result += list1(i)
         i = i + 1
       }
     }
      while(j<l2l) {
      result += list2(j)
      j = j + 1
      }
      while(i<l1l) {
      result += list1(i)
      i = i + 1
      }
    result
  }
}
