package singletonpattern;

public class StaticblockSingleton {
public static StaticblockSingleton s;
private StaticblockSingleton() {
	
}
static {
	try {
		s=new StaticblockSingleton();
		
	}
	catch(Exception e){
		throw new RuntimeException("not create object of singleton");
	}
}
public static StaticblockSingleton getStaticblockSingleton() {
	return s;
}
}
