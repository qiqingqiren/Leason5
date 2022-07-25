package Leason5;
public class Dog {
    char size;
    String breed;
    String colour;
    int age;
    String name;
    Dog(String breed,char size,String colour,int age){
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
    public String name(String name){
        this.name=name;
        System.out.println(name);
        return name;
    }



    public static void main(String[] args){
        Dog Dog1= new Dog("斗牛犬",'大',"浅灰色",5);
        Dog Dog2= new Dog("小猎犬",'大',"橘色",6);
        Dog Dog3= new Dog("德国牧羊犬",'大',"橘色和白色",6);
        Dog Dog4= new Dog();
        Dog1.name("灰太狼");
        Dog2.name("菊太郎");
        Dog3.name("白菊太郎");
        Dog1.eat();
        Dog2.run();
        Dog3.sleep();
        
    }

}
