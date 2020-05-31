import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class PostdocsKtTest{
    @Test
    fun 入力例_1() {
        val input =
            "PD?D??P";
        val output =
            "PDPDPDP";

        assertIO(input, output);
    }

    @Test
    fun 入力例_2() {
        val input =
            "P?P?";
        val output =
            "PDPD";

        assertIO(input, output);
    }

    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        postdocs()

        assertEquals(sysOut.toString(), output + System.lineSeparator())
    }
}
