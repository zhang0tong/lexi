package mjxn.study.lexi.util;

/**
 * 通过对定点定义一个矩形
 * @author mjxn
 * @date 2021/10/13 14:53
 */
public class Rect {
    private Integer x0;
    private Integer y0;
    private Integer x1;
    private Integer y1;

    public Rect() {
    }

    public Rect(Integer x0, Integer y0, Integer x1, Integer y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }

    public Integer getX0() {
        return x0;
    }

    public Rect setX0(Integer x0) {
        this.x0 = x0;
        return this;
    }

    public Integer getY0() {
        return y0;
    }

    public Rect setY0(Integer y0) {
        this.y0 = y0;
        return this;
    }

    public Integer getX1() {
        return x1;
    }

    public Rect setX1(Integer x1) {
        this.x1 = x1;
        return this;
    }

    public Integer getY1() {
        return y1;
    }

    public Rect setY1(Integer y1) {
        this.y1 = y1;
        return this;
    }

    @Override
    public String toString() {
        return "Rect{" + "x0=" + x0 + ", y0=" + y0 + ", x1=" + x1 + ", y1=" + y1 + '}';
    }
}
