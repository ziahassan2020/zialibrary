package com.sarower.exception;

public class ExceptionTest {
	
	public static void main(String[] args) throws Exception {
		
	//	String a=10; // Error /this is not an exception this is a mistake
		
		//checked can be handled by either throws or try/catch
		try {
			Thread.sleep(3000);  //red=compilation issue or error/ checked/compile time exception/ no mistake but still red
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}  
		
		//unchecked can only be handled by try catch
		try {
			System.out.println(2/0);  //no red/ unchecked/runtime exception / only try catch use
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("Finished");
		
		//throw create our own exception / customer exception
		throw new Exception("Forcing code to fail");
	}

}
