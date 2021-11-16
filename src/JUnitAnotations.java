import org.junit.*;

public class JUnitAnotations {

    @BeforeClass
    public static void beforeClasses() {
        System.out.println("This is BeforeClass");
    }

    @Before
    public void beforeMethods() {
        System.out.println("This is Before");
    }

    @Test
    public void myTest1() {
        System.out.println("This is MyTest1");
    }

    @Test
    public void myTest2() {
        System.out.println("This is MyTest2");
    }

    @After
    public void afterMethods() {
        System.out.println("This is After");
    }

    @AfterClass
    public static void afterClasses() {
        System.out.println("This is AfterClass");
    }
}