package mjxn.study.lexi.util;

/**
 * 通过二维坐标定义一个点
 * @author mjxn
 * @date 2021/10/13 15:01
 */
public class Point {
    Integer x;
    Integer y;

    public Point() {
    }

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Point setX(Integer x) {
        this.x = x;
        return this;
    }

    public Integer getY() {
        return y;
    }

    public Point setY(Integer y) {
        this.y = y;
        return this;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}
