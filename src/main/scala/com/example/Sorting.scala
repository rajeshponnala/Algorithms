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

}
