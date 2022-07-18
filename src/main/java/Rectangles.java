import java.util.Objects;

public class Rectangles {

    public boolean isContainment(Point l1, Point r1 , Point l2, Point r2 ) {

        if((l1.x < l2.x && l1.y > l2.y ) && (r1.x > r2.x && r1.y < r2.y)) {
            return true;
        }

        if((l1.x > l2.x && l1.y < l2.y ) && (r1.x < r2.x && r1.y > r2.y)) {
            return true;
        }

        return false;
    }

    public boolean isIntersection(Point l1, Point r1 , Point l2, Point r2 ) {

        if(isNotContAdjInter(l1, r1, l2, r2)){
            return false;
        }

        // If one rectangle is containment other
        if(isContainment(l1, r1, l2, r2)) {
            return false;
        }

        if(isAdjacentSubLine(l1, r1, l2, r2)) {
            return false;
        }
        if(isAdjacentPartial(l1, r1, l2, r2)) {
            return false;
        }
        if(isAdjacentProper(l1, r1, l2, r2)) {
            return false;
        }
        return true;
    }

    public boolean isAdjacentSubLine(Point l1, Point r1 , Point l2, Point r2 ) {

        if ((l1.x < r2.x && r2.x > r1.x) && Objects.equals(l2.x, r1.x) &&  (l2.y < l1.y && l2.y > r2.y )) {
            return true;
        }

        if ((l2.x < r1.x && r1.y > r2.y) && Objects.equals(l1.x, r2.x) &&  (l1.y < l2.y && l1.y > r1.y)) {
            return true;
        }
        return false;
    }

    public boolean isAdjacentPartial(Point l1, Point r1 , Point l2, Point r2 ) {

        if ((l1.x < r2.x && l1.x < r1.x) && Objects.equals(l2.x, r1.x)  && (l2.y > l1.y || l2.y < r2.y)) {
            return true;
        }

        if ((l2.x < r1.x && l2.x < r2.x) && Objects.equals(l1.x ,r2.x)  && (l1.y > l2.y || l1.y < r1.y)) {
            return true;
        }
        return false;
    }

    public boolean isAdjacentProper(Point l1, Point r1 , Point l2, Point r2 ) {

        if ((l1.x < r2.x && l2.y > r2.y)  && Objects.equals(l2.x, r1.x) && Objects.equals(l2.y, l1.y) && Objects.equals(r2.y, r1.y)) {
            return true;
        }

        if ((l2.x < r1.x && l1.y > r1.y)  && Objects.equals(l1.x, r2.x) && Objects.equals(l1.y, l2.y) && Objects.equals(r2.y, r1.y)) {
            return true;
        }
        return false;
    }


    public boolean isNotContAdjInter(Point l1, Point r1 , Point l2, Point r2){

        // if rectangle has area 0, no overlap
        if (Objects.equals(l1.x, r1.x) || Objects.equals(l1.y, r1.y) || Objects.equals(r2.x, l2.x) || Objects.equals(l2.y, r2.y))
            return true;

        // If one rectangle is on left side of other
        if (l1.x > r2.x || l2.x > r1.x ) {
            return true;
        }

        // If one rectangle is above other
        if (r1.y > l2.y || r2.y > l1.y) {
            return true;
        }

        return false;
    }

}
