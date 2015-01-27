package cn.iszt.patterns.build.builder;

/**
 * @author nedee
 * @Project: design-patterns
 * @Package cn.iszt.patterns.build.builder
 * @Description:
 * @email Nedee.huang@iszt.cn
 * @date 2015/1/27 18:23
 * @Copyright: 2015 Shenzhentong EC Inc. All rights reserved.
 */
public interface PersonBuilder {
    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();
}
