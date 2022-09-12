object MyApp extends App{
    var x = new Rational(3,4)
    var y = new Rational(5,8)
    var z = new Rational(2,7)
    val sub = x - y - z
    println(x)
    println(y)
    println(z)
    println(sub)
    
}
class Rational(x:Int, y:Int){
        def numer = x/gcd(x,y)
        def denom = y/gcd(x,y)
        def this(n:Int)=this(n,1)//Auxiliary Constructors

        private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b)
        def +(r:Rational)=new Rational(this.numer*r.denom+this.denom*r.numer,
                                        this.denom*r.denom)
        override def toString = numer+"/"+denom
        def neg = new Rational(-this.numer,this.denom)
        def -(r:Rational)=this+r.neg
    }