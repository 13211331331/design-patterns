package cn.iszt.patterns.build.prototype;

/**
 * @author nedee
 * @Project: design-patterns
 * @Package cn.iszt.patterns.build.prototype
 * @Description:
 * @email Nedee.huang@iszt.cn
 * @date 2015/1/27 18:42
 * @Copyright: 2015 Shenzhentong EC Inc. All rights reserved.
 */
public class Prototype implements Cloneable {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Object clone(){
        try {
            return super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
