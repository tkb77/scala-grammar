trait Fillable {

  def fill(): Unit = println("Fill!")
}

trait Disposable {

  def dispose(): Unit =  println("Dispose!")

}

class Paper

class PaperCup extends Paper with Fillable with Disposable

trait TraitA {
  def greet(): Unit = println("Hello!")
}

trait TraitB extends TraitA {
  override def greet(): Unit = {
    super.greet()
    println("My name is Terebi-chan.")
  }
}

trait TraitC extends TraitA {
  override def greet(): Unit = {
    super.greet()
    println("I like niconico.")
  }
}

class Class1 extends TraitB with TraitC
class Class2 extends TraitC with TraitB
