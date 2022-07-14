import org.junit.Assert.*
import org.junit.Test

class BowlingScorerTest {
    @Test
    fun `All gutters should return a score of 0`() {
        var result = BowlingScorer().scoreFromRolls("-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-")
        assertEquals(result, "0")
    }
}