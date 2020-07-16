package com.loop;

public class BreakContinue {
	//continues statement can only be used in loop (skipping the statement)
	//Break can be done in Loop and switches(break the remaining part of the execution)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BreakContinue obj = new BreakContinue();
		obj.continueFunction();
		
	}
	public void breakfunction() {
		for(int i=0; i<13;i++) {			
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
	}
	public void continueFunction() {
		for (int i=0; i<11; i++) {
			if(i>=5 && i<=7) {
				continue;
			}			
			System.out.println(i);
		}
	}

}
