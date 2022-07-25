
//类名
public class Student {
	//成员变量
	public int       id;
	private String  name;
	double score1 = 99; 
    double score2 = 100; 
    double score3 = 97;
	//构造函数
	Student(int ID,String myName) {
		id = ID;
        name = myName;
		System.out.println("Student....");
	}
	//成员方法，成员函数
	public double getAverageScore() {
		return  (score1 + score2 + score3)/3;
	}

	String getName()
	{
		return name;
	}

	public static void main(String[] args) throws Exception {

		Student st = new Student(11, "zhangsan");
        //Student st = new Student();
        
        System.out.println("name: "+ st.getName()+"  Socre is: "+st.getAverageScore());

    }
}
