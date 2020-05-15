import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoSrearchTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Khong tim thay")
    void whenBinarySearch_thenNotFound() {
        // chuan bi du lieu
        int list[] = {1, 2, 3, 6};
        int key = -3;
        int excepted = -1;
                // thuc thi
        DemoSrearch demoSrearch = new DemoSrearch();
        int result = demoSrearch.binarySearch(list, key);
        // so sanh
        assertEquals(excepted, result);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Tim thay ")
    void whenBinarySearch_thenReturnIndex() {
        // chuan bi du lieu
        int list[] = {1, 2, 3, 6};
        int key = 3;
        int excepted = 2;
        // thuc thi
        DemoSrearch demoSrearch = new DemoSrearch();
        int result = demoSrearch.binarySearch(list, key);
        // so sanh
        assertEquals(excepted, result);
    }

    @DisplayName("De qui khong tim thay")
    @Test
    void whenBinarySearchRec_thenNotFound(){
        // chuan bi du lieu
        int list[] = {1, 2, 3, 6};
        int key = -3;
        int excepted = -1;
        // thuc thi
        DemoSrearch demoSrearch = new DemoSrearch();
        int result = demoSrearch.binarySearchRec(list, key, list.length -1, 0);
        // so sanh
        assertEquals(excepted, result);
    }

    @DisplayName("De qui tim thay ")
    @Test
    void whenBinarySearchRec_thenReturnIndex(){
        // chuan bi du lieu
        int list[] = {1, 2, 3, 6};
        int key = 3;
        int excepted = 2;
        // thuc thi
        DemoSrearch demoSrearch = new DemoSrearch();
        int result = demoSrearch.binarySearchRec(list, key, list.length -1, 0);
        // so sanh
        assertEquals(excepted, result);
    }
}