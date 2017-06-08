import com.pk.ch01.sum
import org.junit.Test
import org.junit.Assert.*

class ProgramTest {

  @Test
  fun sumTest(){
    val x = 5
    val y = 4

    val result = sum(x,y)

    assertEquals( 8, result )
  }
}
