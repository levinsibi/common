package general;

class Address{
	String Hname;
	int pin;
	String State;
	Address(String Hname,int pin,String state)
	{
		this.Hname=Hname;
		this.pin=pin;
		this.State=state;
	}
}
public class Employee_HASA {

	int id,sal;
	String name;
	Address address;
	Employee_HASA(String name,int id,int sal,Address address){
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.address=address;
			
	}
	public void show(){
		System.out.println("Employee Details are "+id+" name"+" "+sal);
		System.out.println("Address Details "+address.Hname+" "+address.pin+" "+address.State);
		System.out.println("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address a1=new Address("pournammi",3427,"Kerala");
		Address a2=new Address("kelos",3437,"UP");
		
		Employee_HASA e1=new Employee_HASA("vivek",6757,4000,a1);
		Employee_HASA e2=new Employee_HASA("ammu",6357,4300,a2);
		
		e1.show();
		e2.show();
	}

}
