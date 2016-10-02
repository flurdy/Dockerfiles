package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class HealthController extends Controller {

   def ping = Action {
      NoContent
   }
}
