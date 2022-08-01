package singletonpattern;

public class BillpughSingleton {

	private BillpughSingleton() {
		
	}
	public static BillpughSingleton getBillpughSingleton() {
		return Helper.b;
	}
private static class Helper{
	private static final BillpughSingleton b=new BillpughSingleton();
}
}
