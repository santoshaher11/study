package com.java8.features;

public class FunctionaInterFaceMainClass implements FunctionaInterFace {

	@Override
	public void sampleMethod() {
		System.out.println("This is overriden sampleMethod");
		
	}

	
	public static void main(String[] args) {
		
		FunctionaInterFace ft=new FunctionaInterFaceMainClass();
		ft.sampleMethod();
		ft.sampleDefaultMethod();
		//FunctionaInterFace.sampleStaticMethod();
		
		FunctionaInterFace fo=()->{System.out.println("This is overriden by lambda");};
		fo.sampleMethod();

	}

}
