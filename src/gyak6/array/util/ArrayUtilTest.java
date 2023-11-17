package array.util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

import array.util.ArrayUtil;

public class ArrayUtilTest {

    @Test
    public void maxLength0() {
        int[] arr = {};
        assertEquals(0, ArrayUtil.max(arr));
        assertEquals(0, ArrayUtil.max2(arr));
        assertEquals(0, ArrayUtil.max3(arr));
        assertEquals(0, ArrayUtil.max4(arr));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 1147205168, -1, -1147100200})
    public void maxLength1(int num) {
        int arr[] = { num };
        assertEquals(num, ArrayUtil.max(arr));
        assertEquals(num, ArrayUtil.max2(arr));
        assertEquals(num, ArrayUtil.max3(arr));
        assertEquals(num, ArrayUtil.max4(arr));
    }
}