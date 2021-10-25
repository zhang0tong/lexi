package mjxn.study.lexi.glyph;

import mjxn.study.lexi.util.Point;
import mjxn.study.lexi.util.Rect;
import mjxn.study.lexi.util.Window;

import java.util.ArrayList;
import java.util.List;

/**
 * 图元
 * 子类可以定义
 * 基本的图像元素（字符和图像）
 * 结构元素（行和列）
 *
 * 有三个基本责任：
 *  行为（Appearance）：怎样画出自己
 *  大小（Hit detection）：占用多大空间
 *  结构（Structure）：父图元和子图元是什么
 *
 * @author mjxn
 * @date 2021/10/13 14:17
 */
public abstract class Glyph {

    private Glyph parent;
    private List<Glyph> children;

    /* Appearance */

    /**
     * 绘制图元
     * @param window 绘制工具
     */
    public abstract void draw(Window window);

    /**
     * 当前图元占用的矩形区域
     * @return 包含该图元的最小矩形
     */
    public abstract Rect bounds();

    /* Hit detection */

    /**
     * 点击时确定该位置的图元或图元结构
     * @param point 点击的位置
     * @return 是否与图元相交
     */
    public boolean intersects(final Point point) {
        Rect bounds = this.bounds();
        return point.getX() >= bounds.getX0() && point.getX() <= bounds.getX1() &&
                point.getY() >= bounds.getY0() && point.getY() <= bounds.getY1();
    }

    /* Structure */

    /**
     * 在index指定的位置插入一个图元
     * @param g 要插入的图元
     * @param index /
     */
    public void insert(Glyph g, int index) {
        if (children == null) {
            children = new ArrayList<>();
        }
        g.setParent(this);
        children.add(index, g);
    }

    /**
     * 移除指定的子图元
     * @param g 要移除的图元
     */
    public void remove(Glyph g) {
        children.remove(g);
    }

    /**
     * 获取指定index的子图元
     * @param index /
     * @return 被移除的图元
     */
    public Glyph child(int index) {
        return children.get(index);
    }

    /**
     * 获取父图元
     * @return /
     */
    public Glyph parent() {
        return parent;
    }

    public void setParent(Glyph parent) {
        this.parent = parent;
    }
}
