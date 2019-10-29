package com.project

class MethodExamples {

	ArrayList Compiler=["Java 1.6", "Java 1.8"]
	
	String cmp="java 2"
	
	
	public String getCmp() {
		return cmp;
	}

	public void setCmp(String cmp) {
		this.cmp = cmp;
	}

	ArrayList Os=["Window 7", "Window 8","Linux"]
	
	static def doSomething() {
		println("do Something method called..")
	}
	MethodExamples(){
		
	}

	public MethodExamples(ArrayList compiler, ArrayList os) {
		super();
		Compiler = compiler;
		Os = os;
	}

	def add(def a,def b) {
		println("addition is : "+(a+b))
	}


	static void main(String[] args) {
		doSomething()
		MethodExamples methodExample=new MethodExamples();
		methodExample.add(10,20)
	}

	public ArrayList getCompiler() {
		return Compiler;
	}

	public void setCompiler(ArrayList compiler) {
		Compiler = compiler;
	}
}