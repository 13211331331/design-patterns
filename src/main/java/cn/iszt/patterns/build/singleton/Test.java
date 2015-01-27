package cn.iszt.patterns.build.singleton;

/**
 * @author nedee
 * @Project: design-patterns
 * @Package cn.iszt.patterns.build.singleton
 * @Description:
 * @email Nedee.huang@iszt.cn
 * @date 2015/1/27 18:37
 * @Copyright: 2015 Shenzhentong EC Inc. All rights reserved.
 */
public class Test {
    public static void main(String[] args) {
        Singleton sing = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();

        System.out.println(sing);
        System.out.println(sing2);
    }
}
