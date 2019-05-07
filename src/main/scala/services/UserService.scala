package services

import model.FoodItem

import scala.collection.mutable

trait UserService {
  def viewItems():mutable.Map[FoodItem, Int]
  def viewPrice(item: String): Int
}
