import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(SlowTests.class)
public class TestA {

    @Test
    public void a() {
        System.out.println("SlowTests A");
    }

    @Test
    public void a2() {
        System.out.println("SlowTests A2");
    }
}
