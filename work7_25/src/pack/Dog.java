package pack;
public class Dog {//当为default时为包内可见包外不可见；protected为继承访问权限，只有该类的派生类才可以访问；private表示只能在类内访问
    public static String strtype="DOG";
    char size;
    String breed;
    String colour;
    public int age;
    String name;
    public Dog(String breed,char size,String colour,int age){
        this.breed=breed;
        this.size=size;
        this.colour=colour;
        this.age=age;
        // System.out.println(breed);
        // System.out.println(size);
        // System.out.println(colour);
        // System.out.println(age);
        System.out.println(breed+" "+size+" "+colour+" "+age);
    }
    public Dog(){System.out.println("暂无该狗信息");}
    public void eat(){
        System.out.println("eating...");
    }
    public void run(){
        System.out.println("running...");
    }
    public void sleep(){
        System.out.println("sleeping...");
    }
    private String name(String name){
        this.name=name;
        System.out.println(name);
        return name;
    }
    public static String returnClassname(){
        //System.out.println("this is Class Dog");
        return strtype;
    }


    public static void main(String[] args){
        System.out.println("————————Dog main函数————————");
        Dog Dog1= new Dog("斗牛犬",'大',"浅灰色",5);
        Dog Dog2= new Dog("小猎犬",'大',"橘色",6);
        Dog Dog3= new Dog("德国牧羊犬",'大',"橘色和白色",6);
        //Dog Dog4= new Dog();
        System.out.println(Dog2 instanceof Dog); //instanceof判断左侧内容是否是右侧类的对象
        //Dog4.returnClassname();
        System.out.println(Dog.returnClassname());
        // Dog1.name("灰太狼");
        // Dog2.name("菊太郎");
        // Dog3.name("白菊太郎");
        Dog1.eat();
        Dog2.run();
        Dog3.sleep();
        
    }

}
