package mjxn.study.lexi.factory;

/**
 * @author mjxn
 * @date 2021/10/13 19:42
 */
public abstract class GUIFactory {

    /**
     * 创建菜单
     */
    public abstract void createMenu();

    /**
     * 创建按钮
     */
    public abstract void createButton();

    /**
     * 创建滚动条
     */
    public abstract void createScrollBar();
}
