package it.prwe.models.model02prototype;

/**
 * @Author zhengxr
 * @Date 2021/12/22 14:24
 */
public class TestPrototypeStudent {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation("张三", "同学：在第一学年表现优秀，被评为三好学生", "清华清华");
        citation.display();

        Citation clone = (Citation) citation.clone();
        clone.setName("李四");
        clone.display();
    }

}

//奖状类原型
class Citation implements Cloneable {
    protected String name;
    protected String info;
    protected String collage;

    public Citation(String name, String info, String collage) {
        this.name = name;
        this.info = info;
        this.collage = collage;
        System.out.println("创建奖状类原型成功...");

    }

    //直接根据奖状类实例再复制出一个新的奖状类实例
    public Object clone() throws CloneNotSupportedException {
        System.out.println("复制出了三好学生奖状...");
        return (Citation) super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {

        System.out.println(name + info + collage);
    }
}
