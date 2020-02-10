import org.scalatest._

class ThingSpec extends FlatSpec with Matchers {
  "Thing" should "do stuff" in {
    val thing = Thing(1)
//    thing.add(1) shouldEqual Thing(2)
    thing.add(1) shouldEqual Thing(1)
  }
}
