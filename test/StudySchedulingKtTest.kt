import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class StudySchedulingKtTest {

    @Test
    fun 入力例_1() {
        val input =
            "10 0 15 0 30";
        val output =
            "270";

        assertIO(input, output);
    }

    @Test
    fun 入力例_2() {
        val input =
            "10 0 12 0 120";
        val output =
            "0";

        assertIO(input, output);
    }

    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        studyscheduling()

        assertEquals(sysOut.toString(), output + System.lineSeparator())
    }
}
