package com.mfc.design.模板方法模式;

/**
 * @author MouFangCai
 * @date 2019/10/14 10:42
 */
public class UpdateLog extends LogTemplate {
    @Override
    public void operation() {
        System.out.println("修改日志");
    }
}
