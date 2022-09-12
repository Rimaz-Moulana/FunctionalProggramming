object MyApp extends App{
    var x = new Account("992512849V",86257510,2000.25)
    var y = new Account("982512849V",86257530,2000.25)
    println(x)

    // var y = x.withdraw(500.12)
    // var z = x.deposit(400.12)
    var z = x.transfer(y,100)
    println(y)
    println(z)
    println(x)

}
class Account(id:String,n:Int,b:Double){
    val nic:String=id
    val acnumber:Int=n
    var balance:Double=b

    override def toString="["+nic+":"+acnumber +":"+ balance+"]"
    def withdraw(a:Double) = this.balance = this.balance - a 
    def deposit(a:Double) = this.balance = this.balance + a
    def transfer(a:Account,b:Double) = 
        this.balance = this.balance - b 
        a.balance = a.balance + b
}