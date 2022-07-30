package it.prwe.listener;

/**
 * @Author zhengxr
 * @Date 2021/12/13 14:00
 */

/**
 * 监听器就是一个实现特定接口的普通java程序，这个程序专门用于监听另一个java对象的方法调用或属性改变，当被监听对象发生上述事件后，监听器某个方法将立即被执行
 * 监听器可以用来检测网站的在线人数，统计网站的访问量等等
 *
 * 监听器涉及三个组件：事件源，事件对象，事件监听器
 * 当事件源发生某个动作的时候，它会调用事件监听器的方法，并在调用事件监听器方法的时候把事件对象传递进去。
 * 我们在监听器中就可以通过事件对象获取得到事件源，从而对事件源进行操作！
 *
 *
 *
 * 事件源：拥有事件
 * 监听器：监听事件源所拥有的事件（带事件对象参数的）
 * 事件对象：事件对象封装了事件源对象
 * 事件源要与监听器有关系，就得注册监听器【提供方法得到监听器对象】
 * 触发事件源的事件，实际会提交给监听器对象处理，并且把事件对象传递过去给监听器。
 */
public class TestListener {
    public static void main(String[] args) {
        Person person = new Person();
        //注册监听器()
        person.registerListener(new PersonListener() {
            @Override
            public void doEat(Event event) {
                Person person1 = event.getSource();
                System.out.println(person1+" eating");
            }

            @Override
            public void doSleep(Event event) {

                Person person1 = event.getSource();
                System.out.println(person1+" sleeping");
            }
        });
        //当调用eat方法时，触发事件，将事件对象传递给监听器，最后监听器获得事件源，对事件源进行操作
        person.eat();
    }
}
