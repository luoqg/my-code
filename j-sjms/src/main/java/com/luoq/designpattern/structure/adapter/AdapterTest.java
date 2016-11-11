package com.luoq.designpattern.structure.adapter;

/**
 * @author luoqiang
 * @data 2016/08/22
 */
public class AdapterTest {
    public static void main(String[] args) {
        //类
        Targetable target = new Adapter();
        target.method1();
        target.method2();

        //对象
        Source source = new Source();
        target = new Wrapper(source);
        target.method1();
        target.method2();

        //接口
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }
}
