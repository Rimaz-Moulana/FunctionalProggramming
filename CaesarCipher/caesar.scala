object caesar extends App{

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    //encryption function
    val encrypt = (c:Char,key:Int,text:String) => text((text.indexOf(c.toUpper)+key) % text.size)

    //Decrypt function
    val decrypt = (c:Char,key:Int,text:String) => if ((text.indexOf(c.toUpper)-key) < 0) text((text.indexOf(c.toUpper)-key+text.size) % text.size)
            else text((text.indexOf(c.toUpper)-key) % text.size)

    //Cipher function
    val Cipher = (algo:(Char,Int,String) => Char,s:String,key:Int,text:String) => s.map(algo(_,key,text))

    val inputText = "Scala"
    val outputText = inputText.replace(" ","")


    val cipherText = Cipher(encrypt,outputText,2,alphabet)
    val cipherPattern = Cipher(decrypt,cipherText,2,alphabet)

    println(cipherText)
    println(cipherPattern)
}
