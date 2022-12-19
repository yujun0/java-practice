package com.sample;

public class MainClass {

    public static void main(String[] args) {
        SubClass sub1 = new SubClass("Java");
        sub1.display();
        System.out.println("-----------");
        SubClass sub2 = new SubClass("python", 1);//41
        sub2.display(); //48

    }
}

//--------------------------------------------------
class SuperClass {
    private String item;

    public SuperClass(String item) {    //20
        this.item = item;   //34
    }

    public void display() {  //24
        System.out.println("SuperClass display() item：" + item);    //49
    }

}

class SubClass extends SuperClass {
    private int temp;

    public SubClass(String item) {//46
        super(item);    //19
        System.out.println("連線資料庫..."); //35
        System.out.println("驗證帳號...");   //36
        System.out.println("程式1...");      //37
        System.out.println("程式2...");      //38
        System.out.println("程式3...");      //43
    }

    public SubClass(String item, int temp) {    //42
        this(item);         //33
        this.temp = temp;   //9
    }

    @Override
    public void display() {  //48
        super.display();    //24
        System.out.println("SubClass display() temp：" + temp);//10
    }
}
