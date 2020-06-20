class User(private val name: String, private val age: Int) {
  override def toString = s"User($name, $age)"
}

object  User {
  def apply(nameAge: String) = {
    val nameAgeList = nameAge.split(",")
    new User(nameAgeList(0),nameAgeList(1).toInt)
  }

  def printAge(user: User): Unit = {
    println(user.toString)
  }
}