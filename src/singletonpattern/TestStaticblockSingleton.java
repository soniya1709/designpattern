package singletonpattern;

public class TestStaticblockSingleton {
	public static void main(String[] args) {
		
	
	StaticblockSingleton s1=StaticblockSingleton.getStaticblockSingleton();
	StaticblockSingleton s2=StaticblockSingleton.getStaticblockSingleton();
	System.out.println(s1==s2);
}
}