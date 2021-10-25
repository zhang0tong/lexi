package mjxn.study.lexi.strategy;

/**
 *
 * @author mjxn
 * @date 2021/10/13 15:18
 */
public abstract class Compositor {

    /**
     * 格式化的内容
     * @param composition /
     */
    public abstract void setComposition(Composition composition);

    /**
     * 何时格式化
     */
    public abstract void compose();
}
