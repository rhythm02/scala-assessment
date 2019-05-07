package services

import model.{Database, FoodItem, Manager}
import org.scalatest.{BeforeAndAfter, FunSuite}

class ManageMachineImpTest extends FunSuite with BeforeAndAfter {

    val mgr = new Manager("mgr")

  test("testAddNewItem") {
    new ManageMachineImp addNewItem(mgr,"Chips", 10 )
   assert(Database.foodItems.contains(FoodItem("Chips", 10)))
  }

  test("testAddMoney") {

  }

}
