package services

import model.{FoodItem, Request}

import scala.collection.mutable

trait UserService {
  def viewItems():mutable.Map[FoodItem, Int]
  def viewPrice(item: String): Int
  def orderItems(request: Request):Int
}
