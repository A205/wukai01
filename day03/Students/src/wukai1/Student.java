package wukai1;
class students{
	int num;
	String name;
	int rank;
	void getNum(){
		System.out.println(num);
	}
	void getName(){
		System.out.println(name);
	}
	void getRank(){
		System.out.println(rank);
	}
	void introduce(){
		System.out.println("��Һ��ҵ����ֽ�"+name+"���ҵ�ѧ����"+num);
	}
}
public class Student {

	public static void main(String[] args) {
		students stu1=new students();
		stu1.num=60;
		stu1.name="������";
		stu1.rank=1;
		stu1.getName();
		stu1.getNum();
		stu1.getRank();
		stu1.introduce();
	}
	
}