package controllers

import org.scalatestplus.play._
import play.api.test._
import play.api.test.Helpers._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 *
 * For more information, see https://www.playframework.com/documentation/latest/ScalaTestingWithScalaTest
 */
class NiancatControllerSpec extends PlaySpec with OneAppPerTest {

  "NiancatController POST" should {

    "handle a new puzzle event via the router" in {
      // Need to specify Host header to get through AllowedHostsFilter
      val request = FakeRequest(POST, "/niancat/newpuzzle/ABCDEFGHI").withHeaders("Host" -> "localhost")
      val response = route(app, request).get

      status(response) mustBe OK
    }

    "handle a solution event via the router" in {
      // Need to specify Host header to get through AllowedHostsFilter
      val request = FakeRequest(POST, "/niancat/solution/U012345/ABCDEFGHI/1").withHeaders("Host" -> "localhost")
      val response = route(app, request).get

      status(response) mustBe OK
    }
  }
}
