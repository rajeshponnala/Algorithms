package com.example

object Searching {

  def binarySearch(data: Vector[Int],key: Int): Int = {
    val length  = data.length
    val mp = length/2
    if(data(mp) == key)
       mp
    else if(key<data(mp))
      getIndex(data,key,0,mp-1)
    else
      getIndex(data,key,mp+1,length-1)
  }

  def getIndex(data: Vector[Int],value: Int,stInd: Int,ltIndex: Int): Int = {
    def index(ind: Int): Int =
      if(ind > ltIndex) -1 else if(data(ind) == value) ind else index(ind+1)
    index(stInd)
  }

  def binarySearch1(data: Vector[Int],key: Int): Int = {
     val length  = data.length
     val mp = length/2
     if(key<data(mp))
       getIndex(data,key,0,mp)
     else
       getIndex(data,key,mp,length-1)
   }

}
