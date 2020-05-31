import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class FoliaKtTest{
    @Test
    fun 入力例_1() {
        val input =
            "3" + System.lineSeparator() +
                    "0 1 1 2";
        val output =
            "7";

        assertIO(input, output);
    }

    @Test
    fun 入力例_2() {
        val input =
            "4" + System.lineSeparator() +
                    "0 0 1 0 2";
        val output =
            "10";

        assertIO(input, output);
    }

    @Test
    fun 入力例_3() {
        val input =
            "2" + System.lineSeparator() +
                    "0 3 1";
        val output =
            "-1";

        assertIO(input, output);
    }

    @Test
    fun 入力例_4() {
        val input =
            "1" + System.lineSeparator() +
                    "1 1";
        val output =
            "-1";

        assertIO(input, output);
    }

    @Test
    fun 入力例_5() {
        val input =
            "10" + System.lineSeparator() +
                    "0 0 1 1 2 3 5 8 13 21 34";
        val output =
            "264";

        assertIO(input, output);
    }

    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        folia()

        assertEquals(sysOut.toString(), output + System.lineSeparator())
    }
}
