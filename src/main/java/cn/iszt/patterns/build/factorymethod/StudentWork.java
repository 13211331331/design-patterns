package cn.iszt.patterns.build.factorymethod;

/**
 * @author nedee
 * @Project: design-patterns
 * @Package cn.iszt.patterns.build.factorymethod
 * @Description:
 * @email Nedee.huang@iszt.cn
 * @date 2015/1/27 16:38
 * @Copyright: 2015 Shenzhentong EC Inc. All rights reserved.
 */
public class StudentWork implements Work {
    @Override
    public void doWork() {
        System.out.println("学生做作业");
    }
}
