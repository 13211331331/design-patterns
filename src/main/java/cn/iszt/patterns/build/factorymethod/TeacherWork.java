package cn.iszt.patterns.build.factorymethod;

/**
 * @author nedee
 * @Project: design-patterns
 * @Package cn.iszt.patterns.build.factorymethod
 * @Description:
 * @email Nedee.huang@iszt.cn
 * @date 2015/1/27 16:40
 * @Copyright: 2015 Shenzhentong EC Inc. All rights reserved.
 */
public class TeacherWork implements Work {
    @Override
    public void doWork() {
        System.out.println("老师批改作业");
    }
}
