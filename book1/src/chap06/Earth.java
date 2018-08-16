package chap06;
/*
static final(=constant)
객체마자 저장안되고 클래스에만 포함되며, (=static) 한번 저장되면 값 변경 안됨(=final).
 */
public class Earth {
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;

    static {
        EARTH_SURFACE_AREA = 4 * Math.PI + EARTH_RADIUS * EARTH_RADIUS;
    }
}
