package model

import scala.collection.mutable.ListBuffer

object Database {
  val foodItems: ListBuffer[FoodItem] = ListBuffer.empty[FoodItem]
  val coins: ListBuffer[Coin] = ListBuffer.empty[Coin]
  val notes: ListBuffer[Note] = ListBuffer.empty[Note]
}
