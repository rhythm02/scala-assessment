package services

import model._

import scala.collection.mutable

class UserServiceImp extends UserService {
  override def viewItems(): mutable.Map[FoodItem, Int] =
    Database.ratecard.filter(f => f._1.quantity != 0)

  override def viewPrice(item: String): Int = {
    Database.ratecard.filter(p => p._1.item == item).toList.head._2
  }

  override def orderItems(request: Request) = {
    val total: Int = Database.notes.map(p => p.moneyValue*p.quantity).head +
                      Database.coins.map(p => p.moneyValue*p.quantity).head

    var t =0
    for(el <- request.itemList){
      t += Database.ratecard.filter(p => p._1.item == el).values.toList.head
    }
    1
  }
}
