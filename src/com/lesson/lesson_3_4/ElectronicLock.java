package com.lesson.lesson_3_4;

public class ElectronicLock implements Lock{

	@Override
	public void open() {
		System.out.println("ElectronicLock open");
		
	}

	@Override
	public void close() {
	System.out.println("ElectronicLock close");
	}

}
