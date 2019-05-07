package services

import model._

import scala.collection.mutable.ListBuffer

class ManageMachineImp extends ManageMachine {
  override def addNewItem(manager: Manager, item: String, quantity: Int): Unit = {
    if(Database.foodItems.exists(p => p.item == item)){
      val temp = Database.foodItems.filter(p => p.item == item).map(p => p.quantity+quantity).head
      Database.foodItems.filter(p => p.item == item).remove(0)
       Database.foodItems+= FoodItem(item, temp)
    }
    else
      Database.foodItems += FoodItem(item, quantity)

    //Database.foodItems.filter(p => p.item == item).map(p => p.quantity.+(quantity))
    Database.foodItems += FoodItem(item, quantity)
  }

  override def addMoney(manager: Manager,moneyType: String, moneyValue: Int, quantity: Int): Unit = {
    moneyType match {
      case "Note" => Database.notes += new Note(moneyValue, quantity)
      case "Coin" => Database.coins += new Coin (moneyValue, quantity)
    }
  }
}

