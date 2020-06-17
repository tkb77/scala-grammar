class Cat(name: String) {

  private def greet(): String = return s"I am ${name}"
  def get(): Unit = println(greet())
}
