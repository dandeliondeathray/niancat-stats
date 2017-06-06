package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class NiancatController @Inject() extends Controller {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def newPuzzle(puzzle: String) = Action { implicit request =>
    Ok("")
  }

  def solution(userId: String, puzzle: String, solutionIndex: Int) = Action { implicit request =>
    Ok("")
  }
}
