object MyApp extends App{
    var r1 = new Rational(2,3)
    val negative = r1.neg
    println(negative)
    println(r1)
}
class Rational(x:Int, y:Int){
        def number = x
        def denom = y

        def neg = new Rational(-this.number,this.denom)
        override def toString = number+"/"+denom
        // def add(r: Rational) = 
        //     new Rational(number*r.denom + r.number*denom,denom*r.denom)
        
        // def sub(r: Rational) = 
        //     new Rational(number*r.denom + r.number*denom,denom*r.denom)
    }