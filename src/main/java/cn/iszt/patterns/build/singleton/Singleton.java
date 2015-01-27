package cn.iszt.patterns.build.singleton;

/**
 * @author nedee
 * @Project: design-patterns
 * @Package cn.iszt.patterns.build.singleton
 * @Description:
 * @email Nedee.huang@iszt.cn
 * @date 2015/1/27 18:36
 * @Copyright: 2015 Shenzhentong EC Inc. All rights reserved.
 */
public class Singleton {

    private static Singleton sing;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (sing == null) {
            sing = new Singleton();
        }
        return sing;
    }
}
