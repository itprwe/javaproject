package it.prwe.models.model03SimpleFactory;

/**
 * @Author zhengxr
 * @Date 2021/12/22 14:43
 */

/**
 * 简单工厂模式/静态工厂模式
 * <p>
 * 在日常开发中，凡是需要生成复杂对象的地方，都可以尝试考虑使用工厂模式来代替。
 * 注意：上述复杂对象指的是类的构造函数参数过多等对类的构造有影响的情况，因为类的构造过于复杂，如果直接在其他业务类内使用，
 * 则两者的耦合过重，后续业务更改，就需要在任何引用该类的源代码内进行更改，光是查找所有依赖就很消耗时间了，更别说要一个一个修改了
 * <p>
 * 工厂模式的定义：定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂类当中。这满足创建型模式中所要求的“创建与使用相分离”的特点。
 * <p>
 * 我们把被创建的对象称为“产品”，把创建产品的对象称为“工厂”。如果要创建的产品不多，只要一个工厂类就可以完成，这种模式叫“简单工厂模式”。
 * <p>
 * 优点：
 * 工厂类包含必要的逻辑判断，可以决定在什么时候创建哪一个产品的实例。客户端可以免除直接创建产品对象的职责，很方便的创建出相应的产品。工厂和产品的职责区分明确。
 * 客户端无需知道所创建具体产品的类名，只需知道参数即可。
 * 也可以引入配置文件，在不修改客户端代码的情况下更换和添加新的具体产品类。
 * 缺点：
 * 简单工厂模式的工厂类单一，负责所有产品的创建，职责过重，一旦异常，整个系统将受影响。且工厂类代码会非常臃肿，违背高聚合原则。
 * 使用简单工厂模式会增加系统中类的个数（引入新的工厂类），增加系统的复杂度和理解难度
 * 系统扩展困难，一旦增加新产品不得不修改工厂逻辑，在产品类型较多时，可能造成逻辑过于复杂
 * 简单工厂模式使用了 static 工厂方法，造成工厂角色无法形成基于继承的等级结构。
 * 应用场景
 * 对于产品种类相对较少的情况，考虑使用简单工厂模式。使用简单工厂模式的客户端只需要传入工厂类的参数，不需要关心如何创建对象的逻辑，可以很方便地创建所需产品。
 * <p>
 * 简单工厂模式的主要角色如下：
 * 简单工厂（SimpleFactory）：是简单工厂模式的核心，负责实现创建所有实例的内部逻辑。工厂类的创建产品类的方法可以被外界直接调用，创建所需的产品对象。
 * 抽象产品（Product）：是简单工厂创建的所有对象的父类，负责描述所有实例共有的公共接口。
 * 具体产品（ConcreteProduct）：是简单工厂模式的创建目标。
 */
public class TestSimpleFactory {

    public static void main(String[] args) {
        Product product = SimpleFactory.makeProduct(0);
        product.show();

    }


    public interface Product {
        void show();
    }

    static class ConcreteProduct1 implements Product {
        @Override
        public void show() {
            System.out.println("产品1的具体展示...");
        }
    }

    static class ConcreteProduct2 implements Product {
        @Override
        public void show() {
            System.out.println("产品2的具体展示...");
        }
    }

    final class Const {
        static final int PRODUCT_A = 0;
        static final int PRODUCT_B = 1;
        static final int PRODUCT_C = 2;
    }

    static class SimpleFactory {
        public static Product makeProduct(int kind) {
            switch (kind) {
                case Const.PRODUCT_A:
                    return new ConcreteProduct1();
                case Const.PRODUCT_B:
                    return new ConcreteProduct2();
            }
            return null;
        }

    }

}
