import org.junit.Assert.*
import org.junit.Test

class ReverseRomanNumeralTest {
    @Test
    fun `I should return the 1`() {
        var result = ReverseRomanNumeral().convertRomanToInteger("I")
        assertEquals(result, "1")
    }
}