package cn.iszt.patterns.build.prototype;

/**
 * @author nedee
 * @Project: design-patterns
 * @Package cn.iszt.patterns.build.prototype
 * @Description:
 * @email Nedee.huang@iszt.cn
 * @date 2015/1/27 18:43
 * @Copyright: 2015 Shenzhentong EC Inc. All rights reserved.
 */
public class Test {

    public static void main(String[] args) {
        Prototype pro = new ConcretePrototype("prototype");
        Prototype pro2 = (Prototype)pro.clone();
        System.out.println(pro.getName());
        System.out.println(pro2.getName());
    }

}
