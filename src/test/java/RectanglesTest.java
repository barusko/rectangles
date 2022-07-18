import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RectanglesTest {


    @BeforeAll
    public static void init(){
        System.out.println("Running test -> ");

    }

    @Test
    public void isContainmentTest(){
        Point l1 = new Point(28.0,12.0);
        Point r1 = new Point(34.0,10.0);
        Point l2 = new Point(26.0,14.0);
        Point r2 = new Point(36.0,6.0);
        Rectangles rectangles = new Rectangles();
        Assertions.assertTrue(rectangles.isContainment(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isAdjacentProper(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isAdjacentPartial(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isAdjacentSubLine(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isIntersection(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isNotContAdjInter(l1, r1, l2, r2));

    }

    @Test
    public void isIntersectionTest(){
        Point l1 = new Point(28.0,12.0);
        Point r1 = new Point(40.0,8.0);
        Point l2 = new Point(26.0,14.0);
        Point r2 = new Point(36.0,6.0);
        Rectangles rectangles = new Rectangles();
        Assertions.assertTrue(rectangles.isIntersection(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isContainment(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isAdjacentProper(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isAdjacentPartial(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isAdjacentSubLine(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isNotContAdjInter(l1, r1, l2, r2));


    }

    @Test
    public void isAdjacentSubLineTest(){
        Point l1 = new Point(8.0,14.0);
        Point r1 = new Point(22.0,6.0);
        Point l2 = new Point(22.0,12.0);
        Point r2 = new Point(38.0,10.0);
        Rectangles rectangles = new Rectangles();
        Assertions.assertTrue(rectangles.isAdjacentSubLine(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isContainment(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isIntersection(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isAdjacentProper(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isAdjacentPartial(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isNotContAdjInter(l1, r1, l2, r2));

    }

    @Test
    public void isAdjacentPartialTest(){
        Point l1 = new Point(8.0,14.0);
        Point r1 = new Point(22.0,6.0);
        Point l2 = new Point(22.0,18.0);
        Point r2 = new Point(38.0,10.0);
        Rectangles rectangles = new Rectangles();
        Assertions.assertTrue(rectangles.isAdjacentPartial(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isContainment(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isIntersection(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isAdjacentProper(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isAdjacentSubLine(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isNotContAdjInter(l1, r1, l2, r2));

    }
    @Test
    public void isAdjacentProperTest(){
        Point l1 = new Point(5.0,15.0);
        Point r1 = new Point(20.0,5.0);
        Point l2 = new Point(20.0,15.0);
        Point r2 = new Point(40.0,5.0);
        Rectangles rectangles = new Rectangles();
        Assertions.assertTrue(rectangles.isAdjacentProper(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isContainment(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isIntersection(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isAdjacentPartial(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isAdjacentSubLine(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isNotContAdjInter(l1, r1, l2, r2));
    }
    @Test
    public void isNotContAdjInterTest(){
        Point l1 = new Point(5.0,15.0);
        Point r1 = new Point(20.0,5.0);
        Point l2 = new Point(25.0,15.0);
        Point r2 = new Point(40.0,5.0);
        Rectangles rectangles = new Rectangles();
        Assertions.assertTrue(rectangles.isNotContAdjInter(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isAdjacentProper(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isContainment(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isIntersection(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isAdjacentPartial(l1, r1, l2, r2));
        Assertions.assertFalse(rectangles.isAdjacentSubLine(l1, r1, l2, r2));

    }
}
