package cn.iszt.patterns.build.abstractFactory;

/**
 * @author nedee
 * @Project: design-patterns
 * @Package cn.iszt.patterns.build.abstractFactory
 * @Description:
 * @email Nedee.huang@iszt.cn
 * @date 2015/1/27 17:13
 * @Copyright: 2015 Shenzhentong EC Inc. All rights reserved.
 */
public class BlackCat implements ICat{
    @Override
    public void eat() {
        System.out.println("The black cat is eating!");
    }
}
