import scala.collection.immutable.Stream
 
object Stream3 {
  def main(args: Array[String]): Unit = {
    val stream = (1 to 10).toStream

    val take1  = stream.take(4)
    val filt1  = stream.filter(_ < 7)
    val filt2  = stream.map { _ * 2 }

    val take11 = take1.toList;
    val filt11 = filt1.toList;
    val filt22 = filt2.toList;

    println("take11:  "+take11)
    println("filt11:  "+filt11)
    println("filt22:  "+filt22)
  }
}
