package javaSample;

public class SamsungTv {
	
//	public SamsungTv() 				// 추상메소드 - {중괄호-실행부}가 없는 메소드
	
	public SamsungTv() {
		System.out.println("sm Tv 생성");
	}
	public void powerOn() {
		System.out.println("sm 켬");
	}
	public void powerOff() {
		System.out.println("sm 끔");
	}
	public void volumeOn() {
		System.out.println("sm 소리 켬");
	}
	public void volumeOff() {
		System.out.println("sm 소리 끔");
	}
}
