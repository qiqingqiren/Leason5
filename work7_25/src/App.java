public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("——————App main 函数如下——————");
        pack.Dog dog1=new pack.Dog("雪橇犬",'大',"白色",3);
        pack.Dog dog2=new pack.Dog("小型犬",'小',"黄色",3);
        pack.Dog dog3=dog1;
        System.out.println(pack.Dog.returnClassname());
        System.out.println(dog1.equals(dog2)); 
        System.out.println(dog1.equals(dog3));
        //pack.Dog.main(args);
    }
}
