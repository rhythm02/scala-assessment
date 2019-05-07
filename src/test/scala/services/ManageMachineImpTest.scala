package services

import model.{Database, FoodItem, Manager, Note}
import org.scalatest.{BeforeAndAfter, FunSuite}

class ManageMachineImpTest extends FunSuite with BeforeAndAfter {

  val mgr = new Manager("mgr")
  val manageMachineImp = new ManageMachineImp

  test("testAddNewItem") {
    manageMachineImp addNewItem(mgr, "Chips", 10)
    manageMachineImp addNewItem(mgr, "Chips", 10)
    println(Database.foodItems)
    assert(Database.foodItems.contains(FoodItem("Chips", 10)))
  }

  test("testAddMoney") {
    manageMachineImp addMoney(mgr, "Note", 10, 2)
    manageMachineImp addMoney(mgr, "Note", 100, 35)
    manageMachineImp addMoney(mgr, "Note", 50, 23)

    assert(Database.notes.contains(new Note(10,2)))
  }

}
