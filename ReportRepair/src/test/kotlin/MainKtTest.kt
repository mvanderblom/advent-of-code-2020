import org.junit.Test
import java.io.File
import kotlin.test.assertEquals

internal class MainKtTest {

    @Test
    fun fixReport() {
        val outcome = fixReport(File("src/main/resources/sample-input.txt"))
        assertEquals(514579, outcome)
    }
}