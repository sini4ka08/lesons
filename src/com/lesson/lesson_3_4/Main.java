package com.lesson.lesson_3_4;

public class Main {

	public static void main(String[] args) {
		Lock lock = new MagnitLock();
		lock.close();
		Door door = new Door(lock);
		door.openDoor();
		door.closeDoor();
		door.setLock(new ElectronicLock());
		door.openDoor();
		System.out.println(Lock.sum(2, 54));
		Object ob;
	}

}
