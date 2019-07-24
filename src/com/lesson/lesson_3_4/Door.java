package com.lesson.lesson_3_4;

public class Door {
	private Lock lock;

	public Door(Lock lock) {
		this.lock = lock;
	}

	public void openDoor() {
		lock.open();
	}

	public void closeDoor() {
		lock.close();
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}
}
