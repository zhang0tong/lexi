package mjxn.study.lexi.glyph.decorator;

import mjxn.study.lexi.glyph.Glyph;
import mjxn.study.lexi.util.Window;

/**
 * 起修饰作用的图元
 *
 * 装饰器模式（Decorator Pattern）
 *
 * 透明围栏（Transparent Enclosure）：
 *  1、单子女（单组件）组合
 *  2、兼容的接口
 *  客户通常分辨出来是在处理组件还是组件的围栏（这个组件的父组件），特别是当围栏只是代理组件的所有操作时
 *  围栏也能在代理操作之前或之后添加一些自己的操作来修改组件的行为
 *  围栏也能有效地为组件添加状态
 *
 * @author mjxn
 * @date 2021/10/13 15:44
 */
public abstract class MonoGlyph extends Glyph {

    private final Glyph glyph;

    public MonoGlyph(Glyph glyph) {
        this.glyph = glyph;
    }

    @Override
    public void draw(Window window) {
        glyph.draw(window);
    }
}
