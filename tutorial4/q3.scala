object test5 extends App{
    def toUpper(upper:String):String = upper.toUpperCase();
    def toLower(lower:String):String = lower.toLowerCase();
    
    def formatNames(name:String)(indexString: Int*)(add: String => String):String = 
    {
    if(indexString.isEmpty) add(name);   

    var tString = "";
    var i = 0;

    for( i <- 0 to name.length(); if i < name.length()){
        if(indexString.contains(i)) tString = tString + add(name.charAt(i).toString)
        else tString = tString + name.charAt(i).toString
    }
    tString
    }
    println(formatNames("Benny")()(toUpper(_)));
    println(formatNames("Niroshan")(0,1)(toUpper(_)));
    println(formatNames("Saman")()(toLower(_)));
    println(formatNames("Kumara")(0,5)(toUpper(_)));
}
