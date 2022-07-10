object test1{
    def main(args:Array[String]) = {
        val k,i,j=2;
        val m,n=5;
        var (f,g,c)=(12.0f,4.0f,'X');

        println(k + 12 * m);
        println(m / j);
        println(n % j); 
        println( m / j * j);
        println( f + 10*5 +g);
        // print(++i * n); //scala does not exist ++ To increment in Scala,
        // you need to say either i = i + 1 or i += 1
        i += 1;
        println(i*n);
    }
}