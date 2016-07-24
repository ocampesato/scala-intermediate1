import rx.lang.scala.Observable
import scala.concurrent.duration._
import scala.language.postfixOps

object SubscribeObservable1 {
  def main(args: Array[String]): Unit = {
     val o2 = Observable
               .interval(200 millis)
               .take(10)

     o2.subscribe(s   => println("s = "+s),
                  err => println("err = "+err), 
                  ()  => println("done")
               )

     //prevent program from exiting before o2 fires:
     o2.toBlocking.last
  }
}

