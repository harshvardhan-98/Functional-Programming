package Liskov_Substitution

object LSPMain extends App {
  val rectangleArea = (length: Int, width: Int) => length * width
  println(rectangleArea(15, 20))

  val squareArea = (length: Int, width: Int) => length * width
  println(squareArea(10, 10))

  val rectangle = Rectangle(15, 20)
  println(rectangle.calculateArea(rectangle))
}
