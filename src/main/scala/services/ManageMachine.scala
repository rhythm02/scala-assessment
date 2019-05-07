package services

import model.{Manager, Money}

trait ManageMachine {
  def addNewItem(manager: Manager, item: String, quantity: Int)

  def addMoney(manager: Manager, moneyType: String, moneyValue: Int, quantity: Int)
}
