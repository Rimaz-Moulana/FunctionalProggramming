object test6 extends App
{
  def fib(n:Int):Int= n match
  {
    case 0 => 0
    case 1 => 1
    case _ => fib(n-1)+fib(n-2)
  }

  def fibSeq(n:Int): Unit = 
  {
      if(n > 0) fibSeq(n-1)
      println(fib(n))
  }
  fibSeq(15)
}