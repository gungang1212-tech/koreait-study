package chapter12;

public abstract class Player {
	public abstract void play();
	public abstract void stop();
	public abstract void pause();
	
	public void soundUp() {
		System.out.println("소리를 크게 한다.");
	}
}
