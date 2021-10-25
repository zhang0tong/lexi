package mjxn.study.lexi.glyph.decorator;

import mjxn.study.lexi.glyph.Glyph;
import mjxn.study.lexi.strategy.Composition;
import mjxn.study.lexi.util.Rect;
import mjxn.study.lexi.util.Window;

/**
 * @author mjxn
 * @date 2021/10/13 16:31
 */
public class Scroller extends MonoGlyph {

    private Composition composition;

    public Scroller(Glyph glyph) {
        super(glyph);
    }

    @Override
    public void draw(Window window) {
        super.draw(window);
    }

    @Override
    public Rect bounds() {
        return null;
    }

    private void drawScroller(Window window) {
        //// TODO 增加滚动条
    }
}
