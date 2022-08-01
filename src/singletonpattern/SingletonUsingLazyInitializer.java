package singletonpattern;

public class SingletonUsingLazyInitializer {
private static SingletonUsingLazyInitializer s=new SingletonUsingLazyInitializer();
private SingletonUsingLazyInitializer() {
	
}
public static SingletonUsingLazyInitializer getSingletonUsingLazyInitializer() {
if(s==null)
{
	return s=new SingletonUsingLazyInitializer();
}
return s;
}//make this method synchronized
@Override
public String toString() {
	return "SingletonUsingLazyInitializer [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}

}
