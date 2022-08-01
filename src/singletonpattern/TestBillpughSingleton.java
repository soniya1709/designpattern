package singletonpattern;

public class TestBillpughSingleton {
public static void main(String[] args) {
	BillpughSingleton s1=BillpughSingleton.getBillpughSingleton();
	BillpughSingleton s2=BillpughSingleton.getBillpughSingleton();
	System.out.println(s1==s2);
}
}
