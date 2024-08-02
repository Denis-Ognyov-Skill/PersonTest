import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    public static boolean isTeenager(int age)
    {
        boolean result;
        if (age >= 13 && age <= 19) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }


    @Test
    public void testPersonisTeenagerInvalidAge() {

        boolean result = PersonTest.isTeenager(0);
        assertFalse(result);

        result = PersonTest.isTeenager(9);
        assertFalse(result);

        result = PersonTest.isTeenager(12);
        assertFalse(result);

        result = PersonTest.isTeenager(20);
        assertFalse(result);

        result = PersonTest.isTeenager(22);
        assertFalse(result);

    }

    @Test
    public void testPersonisTeenagerValidAge() {

        boolean result = PersonTest.isTeenager(13);
        assertTrue(result);

        result = PersonTest.isTeenager(15);
        assertTrue(result);

        result = PersonTest.isTeenager(17);
        assertTrue(result);

        result = PersonTest.isTeenager(19);
        assertTrue(result);
    }

}
