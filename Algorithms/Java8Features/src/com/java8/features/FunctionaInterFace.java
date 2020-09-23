package com.java8.features;

@FunctionalInterface
public interface FunctionaInterFace {

	public void sampleMethod();
	
	default public void sampleDefaultMethod()
	{
		
		System.out.println("Default sample method called from interface itself");
		//samplePrivateMethod();
	}
	
	/*
	private void samplePrivateMethod()
	{
		System.out.println("This is private method from interface");
	}

	public static void sampleStaticMethod()
	{
		System.out.println("sampleStaticMethod called from interface ");
		samplePrivateStaticMethod();
	}
	private static void samplePrivateStaticMethod()
	{
		System.out.println("samplePrivateStaticMethod called from interface");
		
	}*/
}
