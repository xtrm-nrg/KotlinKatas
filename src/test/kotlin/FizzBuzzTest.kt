import org.junit.Assert.*
import org.junit.Test

class FizzBuzzTest {
    @Test
    fun `1 should return the 1`() {
        var result = FizzBuzz().getAnswerFor(1)
        assertEquals(result, "1")
    }
}