package javaSample;

public class TVUser {

	public static void main(String[] args) {
//		System.out.println("test");

//		LgTv tv = new LgTv() ;			//new입력후 ctrl+spacebar
//		tv.turnOn() ;					//ctrl+alt+↓ 행복사
//		tv.soundOn() ;
//		tv.soundOff();
//		tv.turnOff() ;

//		Tv tv = new SamsungTv() ;		// 강한결합 - 유지보수가 어려움
		
		SamsungTv tv = new SamsungTv();
		tv.powerOn() ;
		tv.volumeOn() ;
		tv.volumeOff() ;
		tv.powerOff() ;
	}

}
