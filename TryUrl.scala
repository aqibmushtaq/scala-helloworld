import scala.util.Try
import scala.util.Success
import scala.util.Failure
import scala.io.Source
import java.net.URL

object TryUrl {
  def main(args: Array[String]) {
    getURLContent("http://www.google.com") match {
      case Success(lines) => lines.foreach(println)
      case Failure(error) => println(error.getMessage)
    }
  }

  def getURLContent(url: String): Try[Iterator[String]] =
    for {
      url <- parseURL(url)
      connection <- Try(url.openConnection())
      is <- Try(connection.getInputStream)
      source = Source.fromInputStream(is)
    } yield source.getLines()

  def parseURL(url: String): Try[URL] = Try(new URL(url))
}
