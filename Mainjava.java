class ashu {

	int age;
	String name;
	
ashu(int a ,String n){
	 System.err.println("constructor call");
	age=a;
	name=n;
	// System.err.println(age""+name);
	// System.out.println(age+" "+name);
	}
ashu(ashu a){
	age=a. age;
	name=a.name;

}
void display(){
	System.err.println(name+"  "+age);
}

}

public class Mainjava{

	public static void main(String[] args) {
		ashu a1 = new ashu(10,"ashu");
		ashu a2 =new ashu (a1);
		
		a1.display();
		a2.display();
	}
}
