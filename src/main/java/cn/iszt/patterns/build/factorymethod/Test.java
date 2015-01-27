package cn.iszt.patterns.build.factorymethod;

/**
 * @author nedee
 * @Project: design-patterns
 * @Package cn.iszt.patterns.build.factorymethod
 * @Description:
 * @email Nedee.huang@iszt.cn
 * @date 2015/1/27 16:44
 * @Copyright: 2015 Shenzhentong EC Inc. All rights reserved.
 */
public class Test {

    public static void main(String[] args){

        IWorkFactory studentWorkFactory = new StudentWorkFactory();
        studentWorkFactory.getWork().doWork();

        IWorkFactory teacherWorkFactory = new TeacherWorkFactory();
        teacherWorkFactory.getWork().doWork();
    }

}
