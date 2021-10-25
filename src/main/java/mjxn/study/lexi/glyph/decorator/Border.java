package mjxn.study.lexi.glyph.decorator;

import mjxn.study.lexi.glyph.Glyph;
import mjxn.study.lexi.util.Rect;
import mjxn.study.lexi.util.Window;

/**
 * @author mjxn
 * @date 2021/10/13 16:17
 */
public class Border extends MonoGlyph {

    private Scroller scroller;

    public Border(Glyph glyph) {
        super(glyph);
    }

    @Override
    public void draw(Window window) {
        super.draw(window);
        drawBorder(window);
    }

    @Override
    public Rect bounds() {
        return null;
    }

    private void drawBorder(Window window) {
        //// TODO 为图形绘制边框
    }
}
