package singletonpattern;

public class TestSingletonUsingLazyInitializer {
public static void main(String[] args) {
	SingletonUsingLazyInitializer s1=SingletonUsingLazyInitializer.getSingletonUsingLazyInitializer();
	SingletonUsingLazyInitializer s2=SingletonUsingLazyInitializer.getSingletonUsingLazyInitializer();
	System.out.println(s1==s2);
}
}
