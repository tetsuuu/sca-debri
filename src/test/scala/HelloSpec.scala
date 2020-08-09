import org.scalatest._

class HelloSpec extends FunSuite with DiagrammedAssertions {
  test("Hello should start with H") {
    // Hello, as opposed to
    assert("Hello".startsWith("H"))
  }
}
