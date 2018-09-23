package introduction.java_to_kotlin_conversion

import koans.util.toMessageInEquals
import org.junit.Assert
import org.junit.Test

class TestFunctions() {
    @Test fun collection() {
        Assert.assertEquals("toJSON".toMessageInEquals(), "[1, 2, 3, 42, 555]", JavaCode().toJSON(listOf(1, 2, 3, 42, 555)))
    }
}