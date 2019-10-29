package com.project.test

import static org.hamcrest.CoreMatchers.isA
import static org.junit.Assert.assertThat
import static org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

import com.project.MethodExamples

class TestDemo {

	MethodExamples examples=new MethodExamples();

	@Test
	void test() {
		//		examples.version="Java 1.8"
		//		println examples.getVersion().get(0)

		
		if(examples.getCmp()=="java 1")
			{
				examples.getCmp()=="java 1"
				println "using java7 compiler"
			}
			else if(examples.getCmp()=="Java 2")
			{
				examples.getCmp()=="java 2"
				println "using java8 compiler"
			}
	
		

		if(examples.getCompiler().get(0)=="Java 1.7")
		{
			assertEquals(examples.getCompiler().get(0),"Java 1.7")
		}
		else if(examples.getCompiler().get(1)=="Java 1.8")
		{
			assertEquals(examples.getCompiler().get(1),"Java 1.8")
		}



		assertEquals(examples.getOs().get(0),"Window 7")

		assertEquals(examples.getOs().get(1),"Window 8")

		assertEquals(examples.getOs().get(2),"Linux")




		//assertThat(examples.getVersion().get(1),"Java 1.7")

		//assertThat(examples.get(0).getVersion(), is("Roy"));

		//		assertEquals("Java 1.8", examples.getVersion())
		//
		//		assertEquals("Java 1.7", examples.getVersion())


		//
		//		println examples.getVersion()
		//	examples.getVersion()=="Java 1.8";
		//	if(examples.getVersion()=="Java 1.8")
		//	{
		//		println Sucess
		//	}
		//	else
		//	{
		//		println fail
		//	}
		//assertThat("Java 1.8", isA(examples.version));

		//examples.add(2, 3)
	}

}
