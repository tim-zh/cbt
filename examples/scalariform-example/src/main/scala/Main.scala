//This source file will be reformated after `cbt compile`/`cbt run`
import scala.concurrent.{Future,Await}

object Main extends App{
println("fooo")
List(1, 2, 4, 5, 6) match {
case h :: _ => println("not empty list")
case Nil => println("empty list")
}
}
