package nqueen

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class NqueenTest extends FunSuite with ShouldMatchers {
  
  test("Simple test") {
    Nqueen.message should startWith("Hello")
    info("Test done")
  }
  
  test("Nqueen trick") {
    Nqueen.Ntrick(4) should be (Set())
    info("List")
  }
}
