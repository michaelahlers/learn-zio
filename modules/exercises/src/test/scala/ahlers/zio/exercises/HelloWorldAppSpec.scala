package ahlers.zio.exercises

import zio._
import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

/**
 * @since May 12, 2021
 * @author <a href="mailto:michael@ahlers.consulting">Michael Ahlers</a>
 */
object HelloWorldAppSpec extends DefaultRunnableSpec:

  def spec = suite("HelloWorldAppSpec")(
    testM("helloWorldLogic correctly displays output, prompts input") {
      for {
        _ <- TestConsole.feedLines("Michael")
        _ <- HelloWorldApp.helloWorldLogic
        output <- TestConsole.output
      } yield assert(output)(equalTo(Vector(
        "Hello! What is your name?\n",
        "Hello, Michael, welcome to ZIO!\n")))
    })
