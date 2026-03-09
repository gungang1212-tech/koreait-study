package chapter12;

public class MusicPlayer extends Player {
	@Override
	public void play() {
		System.out.println("음악이 재생됩니다.");
	}

	@Override
	public void stop() {
		System.out.println("음악 재생이 멈췄습니다.");
	}

	@Override
	public void pause() {
		System.out.println("음악을 일시정지 시켰습니다.");
	}
}