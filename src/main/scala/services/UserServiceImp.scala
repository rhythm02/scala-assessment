package services

import model.{Database, FoodItem}

class UserServiceImp extends UserService {
  override def viewItems() =
    Database.ratecard.filter(f => f._1.quantity != 0)

  override def viewPrice(item: String) = {
    Database.ratecard.filter(p => p._1.item == item).toList.head._2
  }
}
