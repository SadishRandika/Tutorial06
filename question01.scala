object question01 extends App{

    val alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//Encrypt function
  val E=(c:Char,key:Int,a:String)=>
      a((a.indexOf(c.toUpper)+key)%a.size)

  // Decrypt function

  val D = (c:Char,key:Int,a:String)=>
    a((a.indexOf(c.toUpper)-key)%a.size)


  val cipher = (algo:(Char,Int,String)=>
    Char,s:String,key:Int,a:String)=>
      s.map(algo(_,key,a))

  println("Enter text")
  val s= scala.io.StdIn.readLine()
  val ct = cipher(E,s,1,alp)
  val pt = cipher(D,ct,1,alp)

  printf("Encryption value : %s",ct);
  println();
  printf("Decryption value : %s",pt);






}
