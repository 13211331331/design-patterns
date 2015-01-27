package cn.iszt.patterns.build.builder;

/**
 * @author nedee
 * @Project: design-patterns
 * @Package cn.iszt.patterns.build.builder
 * @Description:
 * @email Nedee.huang@iszt.cn
 * @date 2015/1/27 18:30
 * @Copyright: 2015 Shenzhentong EC Inc. All rights reserved.
 */
public class Test {

    public static void main(String[] ars) {
        PersonDirector pd = new PersonDirector();
        Person person = pd.constructPerson(new ManBuilder());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
    }
}
