object test5{
    def main(args:Array[String]) = {
        def easyPace(a:Int):Int=a*8;
        def tempo(b:Int):Int=b*7;
        def runningTime(a:Int,b:Int,c:Int)=easyPace(a)+tempo(b)+easyPace(c);
        //a indicate of beginning running distance
        //b indicate of tempo's running distance
        //c indicate of running distance of reach home
        print(runningTime(2,3,2));
        print("min");
    }
}