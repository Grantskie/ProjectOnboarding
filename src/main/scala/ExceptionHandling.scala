object ExceptionHandling extends App {
  /**
   *  You handle exceptions in scala with try-catch-finally blocks
   *
   *  The try block is where you place the code that you think will throw and exception
   *  The catch block is where you place the code that reacts to specific exceptions thrown
   *    -the catch block is a case match that matches thrown exceptions
   *  The finally block will always be run even if an exception does not occur
   */

  try{
    val arr = Array(0,1,2,3)
    print(arr(10))                  //Throws IndexOutOfBoundsException
    print(1 / 0)                    //Throws ArithmeticException
    throw new NullPointerException  //Throws NullPointerException
  }
  catch{
      case x: ArithmeticException => {
        println("You cannot divide by zero")
      }
      case y: IndexOutOfBoundsException => {
        println("Array index doesn not exist")
      }
      case z: Throwable => {
        println("Unidentified exception or error")
      }
  }
  finally{
    println("I will always print")
  }
}
