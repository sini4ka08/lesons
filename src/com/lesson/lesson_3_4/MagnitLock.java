package com.lesson.lesson_3_4;

public class MagnitLock implements Lock {

	@Override
	public void open() {
		System.out.println("magnitlock open");

	}

	@Override
	public void close() {
		System.out.println("magnitlock close");

	}

}
