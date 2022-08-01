package factorydesignpattern;

public class MainTest {
public static void main(String[] args) {
	Computer c=new PC("130","328","23928");
	System.out.println(c);
	Computer c1=new Server("130","328","23928");
	System.out.println(c1);
}
}
