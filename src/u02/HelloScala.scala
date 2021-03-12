package u02

object HelloScala extends App{
  //2.
  println("Hello, Scala")

  //2a (ii)
  def isEven(number: Int) = number % 2 == 0
  def isOdd(number: Int) = !isEven(number)

  val parity: Int => String = {
    case n if isEven(n) => "even"
    case n if isOdd(n) => "odd"
  }

  //2a (i)
  def isEven2(number: Int) : String = number match {
    case number if (number % 2 == 0) => "even"
    case _ => "odd"
  }

  println("isEven 3? " + isEven2(3))
  println("isEven 4? " + isEven2(4))
  println("isEven 3? " + parity(3))
  println("isEven 4? " + parity(4))

  //Correction
  val profParity: Int => String = {
    case n if (n%2 == 0) => "even"
    case _ => "odd"
  }

  println(profParity(2))
  println(profParity(5))


  //2b
  val empty = (s:String) => (s=="")

  //Gets val empty as input and returns the opposite
  val nonEmpty = (s:String) => !empty(s)

  println(empty("a"))
  println(nonEmpty("a"))
  println(empty(" "))
  println(nonEmpty(" "))


  //2b 4 non-curried def
  def isInFormXLEYLEZ(x: Int, y: Int, z: Int) : Boolean = x match {
    case x if (x<=y && y<=z) => true
    case _ => false
  }
  println("Non-curried def")
  println("IS in form x<y<z? " + isInFormXLEYLEZ(1,2,3))
  println("IS in form x<y<z? " + isInFormXLEYLEZ(1,2,1))

  //2b 4 curried def
  def curriedIsInFormXLEYLEZ(x: Int)(y: Int)(z: Int) : Boolean = x match {
    case x if (x<=y && y<=z) => true
    case _ => false
  }

  val curriedArgs = curriedIsInFormXLEYLEZ(1) _
  println("Curried def")
  println("IS in form x<y<z? " + curriedArgs(2)(3))
  println("IS in form x<y<z? " + curriedArgs(2)(1))



}
