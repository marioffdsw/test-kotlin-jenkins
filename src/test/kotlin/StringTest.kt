import io.kotlintest.specs.StringSpec
import io.kotlintest.matchers.shouldBe

class MyTests : StringSpec() {
  init {

    "length should return size of string" {
      "hello".length shouldBe 5
    }
  }
}
