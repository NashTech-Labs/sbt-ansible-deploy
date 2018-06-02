import com.typesafe.config.ConfigFactory
import scala.App

object Hello extends App {
  override def main(args: Array[String]) = {
    val config = ConfigFactory.load()
    println(config.getString("msg"))
  }
}