package ahlers.zio.exercises

import java.io.IOException
import zio._
import zio.console._

/**
 * @since May 12, 2021
 * @author <a href="mailto:michael@ahlers.consulting">Michael Ahlers</a>
 */
object HelloWorldApp extends App:

  override def run(arguments: List[String]) =
    helloWorldLogic.exitCode

  val helloWorldLogic: ZIO[Console, IOException, Unit] =
    for {
      _ <- putStrLn("Hello! What is your name?")
      name <- getStrLn
      _ <- putStrLn(s"Hello, ${name}, welcome to ZIO!")
    } yield ()
