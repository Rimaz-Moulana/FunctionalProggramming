object test2{
    def main(args:Array[Sting]) = {
        var (a,b,c,d,k) = (2,3,4,5,4.3f);

        b = b - 1;
        println(b * a + c * d); //println( - -b * a + c *d - -);  //java exicute ++ expression but scala does not exist
        d = d - 1;

        println(a);//println(a++);
        a = a + 1;

        val g = 7.3f;               // java & scala does not exist undefined variables
        println (-2 * ( g - k ) + c);// println (-2 * ( g - k ) + c); 

        println(c);//println(c=c++)
        c = c + 1;

        c = c + 1;
        println(c*a);// println (c=++c*a++);
        a = a - 1;
    }
}