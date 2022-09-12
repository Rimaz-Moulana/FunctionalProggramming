object MyApp extends App{

    var bank:List[Account]= List(new Account("992512849V",86257510,2000.25),new Account("982512849V",86257520,-2000.25),new Account("972512849V",86257530,1000.25))

    val find = ( n : Int , b : List[Account]) => b.filter( x => x.acnumber.equals( n ))

    val overdraft = ( b : List[Account] ) => b.filter( x => x.balance < 0)

    val balance = ( b: List[Account] ) => b.map( x => (x,x.balance) ).reduce( (a , c) => ( c._1 , a._2 + c._2) )

    val interest = ( b : List[Account] ) => b.map( x => {
        x.balance match {
            case a if a >= 0 => x deposit x.balance * 0.05
            case _ => x withdraw Math.abs(x.balance) * 0.01
        }
        x
    })

    println("bank " + bank )
    println("find " + find( 2 , bank) )
    println("overdraft " + overdraft( bank ) )
    println("balance " + balance( bank )._2 )
    bank = interest( bank )
    println("bank " + bank )
    println("balance " + balance( bank )._2 )

}
class Account(id:String,n:Int,b:Double){
    val nic:String=id
    val acnumber:Int=n
    var balance:Double=b

    override def toString="["+nic+":"+acnumber +":"+ balance+"]"
    def withdraw(a:Double) = this.balance = this.balance - a 
    def deposit(a:Double) = this.balance = this.balance + a

}