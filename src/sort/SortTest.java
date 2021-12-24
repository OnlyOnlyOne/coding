package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    private static Sort sort=new Sort();

    @Test
    void bubbleSort() {
        sort.bubbleSort();
    }

    @Test
    void selectSort() {
        sort.selectSort();
    }
}