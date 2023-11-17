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

    @ParameterizedTest
    @CsvSource("10,20")
    public void maxLength1(int min, int max) {
        int arr1[] = { min, max };
        assertEquals(max, ArrayUtil.max(arr1));
        assertEquals(max, ArrayUtil.max2(arr1));
        assertEquals(max, ArrayUtil.max3(arr1));
        assertEquals(max, ArrayUtil.max4(arr1));

        int arr2[] = { max, min };
        assertEquals(max, ArrayUtil.max(arr2));
        assertEquals(max, ArrayUtil.max2(arr2));
        assertEquals(max, ArrayUtil.max3(arr2));
        assertEquals(max, ArrayUtil.max4(arr2));
    }

    @Test
    public void minMaxLength0() {
        int[] arr = {};
        int[] expected = {0, 0};
        assertArrayEquals(expected, ArrayUtil.minMax(arr));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 1147205168, -1, -1147100200})
    public void minMaxLength1(int num) {
        int arr[] = { num };
        int expected[] = { num, num};
        assertArrayEquals(expected, ArrayUtil.minMax(arr));
    }

    @ParameterizedTest
    @CsvSource("10,20")
    public void minMaxLength2(int min, int max) {
        int arr1[] = { min, max };
        int expected[] = { min, max };
        assertArrayEquals(expected, ArrayUtil.minMax(arr1));

        int arr2[] = { max, min };
        assertArrayEquals(expected, ArrayUtil.minMax(arr2));
    }
}