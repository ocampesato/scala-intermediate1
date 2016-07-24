import scala.collection.immutable.Stream
 
object Stream2 {
  def main(args: Array[String]): Unit = {
    val stream = (1 to 10).toStream

    val take1 = stream.take(4)
    val filt1 = stream.filter(_ < 7)
    val filt2 = stream.map { _ * 2 }
    println("take1:  "+take1)
    println("filt1:  "+filt1)
    println("filt2:  "+filt2)
  }
}
