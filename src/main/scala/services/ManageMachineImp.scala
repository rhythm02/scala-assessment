package services

import model._

class ManageMachineImp extends ManageMachine {
  override def addNewItem(manager: Manager, item: String, quantity: Int): Unit = {
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

