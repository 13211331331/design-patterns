package cn.iszt.patterns.build.builder;

/**
 * @author nedee
 * @Project: design-patterns
 * @Package cn.iszt.patterns.build.builder
 * @Description:
 * @email Nedee.huang@iszt.cn
 * @date 2015/1/27 18:24
 * @Copyright: 2015 Shenzhentong EC Inc. All rights reserved.
 */
public class ManBuilder implements PersonBuilder {
    Person person;

    public ManBuilder() {
        person = new Person();
    }

    @Override
    public void buildHead() {
        person.setHead("建造男人的头");
    }

    @Override
    public void buildBody() {
        person.setBody("建造男人的身体");
    }

    @Override
    public void buildFoot() {
        person.setFoot("建造男人的脚");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
