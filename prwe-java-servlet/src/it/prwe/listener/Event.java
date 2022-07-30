package it.prwe.listener;

/**
 * @Author zhengxr
 * @Date 2021/12/13 14:26
 */

/**
 * 事件对象Event
 * 事件对象封装了事件源
 * 在监听器上能够通过事件对象获取得到事件源
 */
public class Event {

    private Person person;
    public Event(){

    }
    public Event(Person person){
        this.person = person;
    }
    public Person getSource(){
        return person;
    }

}
