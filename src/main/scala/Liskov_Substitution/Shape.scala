package Liskov_Substitution

trait Shape {
  def calculateArea(shape: Shape): Int
}
