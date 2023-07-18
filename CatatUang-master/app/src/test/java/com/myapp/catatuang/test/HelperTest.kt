import com.myapp.catatuang.test.Helper
import org.junit.Assert.*
import org.junit.Test

class HelperTest {

    private val helper = Helper()

    @Test
    fun testIsInputFieldEmpty_withNullInput_shouldReturnTrue() {
        val result = helper.isInputFieldEmpty(null)
        assertTrue(result)
    }

    @Test
    fun testIsInputFieldEmpty_withEmptyInput_shouldReturnTrue() {
        val result = helper.isInputFieldEmpty("")
        assertTrue(result)
    }

    @Test
    fun testIsInputFieldEmpty_withNonEmptyInput_shouldReturnFalse() {
        val result = helper.isInputFieldEmpty("Hello")
        assertFalse(result)
    }

    @Test
    fun testIsInputFieldValidLength_withNullInput_shouldReturnFalse() {
        val result = helper.isInputFieldValidLength(null, 3, 10)
        assertFalse(result)
    }

    @Test
    fun testIsInputFieldValidLength_withTooShortInput_shouldReturnFalse() {
        val result = helper.isInputFieldValidLength("Hi", 3, 10)
        assertFalse(result)
    }

    @Test
    fun testIsInputFieldValidLength_withValidInputLength_shouldReturnTrue() {
        val result = helper.isInputFieldValidLength("Hello", 3, 10)
        assertTrue(result)
    }

    @Test
    fun testIsInputFieldValidLength_withTooLongInput_shouldReturnFalse() {
        val result = helper.isInputFieldValidLength("This is a long text", 3, 10)
        assertFalse(result)
    }

    @Test
    fun testIsInputFieldNumeric_withNullInput_shouldReturnFalse() {
        val result = helper.isInputFieldNumeric(null)
        assertFalse(result)
    }

    @Test
    fun testIsInputFieldNumeric_withNonNumericInput_shouldReturnFalse() {
        val result = helper.isInputFieldNumeric("abc123")
        assertFalse(result)
    }

    @Test
    fun testIsInputFieldNumeric_withNumericInput_shouldReturnTrue() {
        val result = helper.isInputFieldNumeric("12345")
        assertTrue(result)
    }

    @Test
    fun testIsInputFieldEmail_withNullInput_shouldReturnFalse() {
        val result = helper.isInputFieldEmail(null)
        assertFalse(result)
    }

    @Test
    fun testIsInputFieldEmail_withInvalidEmailFormat_shouldReturnFalse() {
        val result = helper.isInputFieldEmail("example.com")
        assertFalse(result)
    }

    @Test
    fun testIsInputFieldEmail_withValidEmailFormat_shouldReturnTrue() {
        val result = helper.isInputFieldEmail("example@example.com")
        assertTrue(result)
    }
}
