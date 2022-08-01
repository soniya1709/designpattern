package builderdesignpattern;

public class User {
String fname;//required
String lname;//required
int age;
String address;
String mobno;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(UserBuilder builder) {
	super();
	this.fname = builder.fname;
	this.lname =builder.lname;
	this.age = builder.age;
	this.address = builder.address;
	this.mobno = builder.mobno;
}
@Override
public String toString() {
	return "User [fname=" + fname + ", lname=" + lname + ", age=" + age + ", address=" + address + ", mobno=" + mobno
			+ "]";
}
public static class UserBuilder{
	String fname;//required
	String lname;//required
	int age;
	String address;
	String mobno;
	public UserBuilder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserBuilder(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	public UserBuilder getAge(int age) {
		 this.age=age;
		 return this;
	}
	public UserBuilder getAddress(String address) {
		this.address=address;
		return this;
	}
	public UserBuilder getMobno(String mobno) {
		this.mobno=mobno;
		return this;
	}
	public User build() {
		User u=new User(this);
		return u;
	}
}
}
