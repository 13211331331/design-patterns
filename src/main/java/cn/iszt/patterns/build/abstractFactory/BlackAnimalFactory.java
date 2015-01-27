package cn.iszt.patterns.build.abstractFactory;

/**
 * @author nedee
 * @Project: design-patterns
 * @Package cn.iszt.patterns.build.abstractFactory
 * @Description:
 * @email Nedee.huang@iszt.cn
 * @date 2015/1/27 17:11
 * @Copyright: 2015 Shenzhentong EC Inc. All rights reserved.
 */
public class BlackAnimalFactory implements IAnimalFactory {
    @Override
    public ICat createCat() {
        return new BlackCat();
    }

    @Override
    public IDog createDog() {
        return new BlackDog();
    }
}
