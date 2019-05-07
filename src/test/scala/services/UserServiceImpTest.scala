package services

import model.{Database, FoodItem}
import org.scalatest.FunSuite

class UserServiceImpTest extends FunSuite {

  Database.ratecard+=(FoodItem("Chips", 10) -> 50)

  test("testViewItems") {
   println(new UserServiceImp viewItems())
  }

  test("testViewPrice") {
    println(new UserServiceImp viewPrice "Chips")
  }

}
