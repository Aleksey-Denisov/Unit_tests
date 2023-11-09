import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import ru.gbhw.MyList;

public class TestMyList {
    int[] list1, list2;
    MyList myList;

    @BeforeEach
    public void setUp() {
        myList = new MyList();
    }

    @Test
    public void testGetList1() {
        myList.setList1(new int[]{1, 2, 3, 4, 5});
        list1 = myList.getList1();
        assertEquals(list1, myList.getList1());
    }
    @Test
    public void testGetList2() {
        myList.setList2(new int[]{2, 3, 4, 5, 6});
        list2 = myList.getList2();
        assertEquals(list2, myList.getList2());
    }

    @Test
    public void testAverage1() {
        assertEquals(myList.getAverage(new int[]{1, 2, 3, 4, 5}), 3);
    }
    @Test
    public void testAverage2() {
        assertEquals(myList.getAverage(new int[]{}), 0);
    }
    @Test
    public void testAverage3() {
        assertEquals(myList.getAverage(new int[]{-1, -2, -3, -4, 5}), -1);
    }

    @Test
    public void testCompare1() {
        myList.setList1(new int[]{2, 3, 4, 5, 6});
        myList.setList2(new int[]{1, 2, 3, 4, 5});
        assertEquals(myList.compareAverage(), "Первый список имеет большее среднее значение");
    }
    @Test
    public void testCompare2() {
        myList.setList2(new int[]{2, 3, 4, 5, 6});
        myList.setList1(new int[]{1, 2, 3, 4, 5});
        assertEquals(myList.compareAverage(), "Второй список имеет большее среднее значение");
    }
    @Test
    public void testCompare3() {
        myList.setList2(new int[]{1, 2, 3, 4, 5});
        myList.setList1(new int[]{1, 2, 3, 4, 5});
        assertEquals(myList.compareAverage(), "Средние значения равны");
    }
    @Test
    public void testCompare4() {
        myList.setList2(new int[]{});
        myList.setList1(new int[]{});
        assertEquals(myList.compareAverage(), "Средние значения равны");
    }
    @Test
    public void testCompare5() {
        myList.setList1(new int[]{2, 3, 4, 5, 6});
        myList.setList2(new int[]{});
        assertEquals(myList.compareAverage(), "Первый список имеет большее среднее значение");
    }
    @Test
    public void testCompare6() {
        myList.setList2(new int[]{2, 3, 4, 5, 6});
        myList.setList1(new int[]{});
        assertEquals(myList.compareAverage(), "Второй список имеет большее среднее значение");
    }

}
