package wukai1;

public class MobilePhone {
	String style;
	int price;
	String brand;
	/**
	 * @param args
	 */
	void call(){
		System.out.println("���ڲ�ͨ110...");
	}
	void text(){
		System.out.println("���ڷ��͸�ǰŮ��..");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone aMobilePhone=new MobilePhone();
		aMobilePhone.style="IP6";
		aMobilePhone.price=4800;
		aMobilePhone.brand="apple";
		System.out.println(aMobilePhone.brand+"\t"+aMobilePhone.style+"\t"+aMobilePhone.price);
		aMobilePhone.call();
		aMobilePhone.text();
	}

}
