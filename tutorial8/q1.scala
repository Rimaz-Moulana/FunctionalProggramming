
object MyApp extends App{
    val p1 = Point(1,2)
    val p2 = Point(1,2)
    val p3 = p1.move(2,3)
    val p4 = p1 + p2
    val p5 = p1.distance(p1)
    val p6 = p1.invert();
    println(p1)
    println(p3)
    println(p5)
    println(p6)
}

case class Point(a:Int,b:Int){
    def x: Int = a
    def y: Int = b

    def +(that:Point)=Point(this.x+that.x,this.y+that.y)   
    def move(dx:Int,dy:Int)=Point(this.x+dx, this.y + dy)  
    def distance(that:Point):Double = {
        math.sqrt(math.pow(math.abs(this.x - that.x), 2) + math.pow(math.abs(this.y - that.y), 2))}  
    def invert() = Point(this.y, this.x) 
}