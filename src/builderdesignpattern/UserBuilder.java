package builderdesignpattern;

public class UserBuilder {
public static void main(String[] args) {
	User u1=new User.UserBuilder("soniya","nawale")
			.getAge(23)
			.getAddress("Pune")
			.getMobno("463563489")
			.build();
	System.out.println(u1);
}
}
