package Day07.Ex02_다중상속;

import java.text.MessageFormat;

// 다중 구현
// public class 클래스명 implements 인터페이스A, 인터페이스B.. {}
public class SmartTelevision implements SmartRemoteControl, Searchable {
	
	int Volume; 				// 볼륨
	int channel;				// 채널
	String keyword;				// 검색어
	int x,y;					// 터치패드 좌표
	
	// 재정의
	@Override
	public void turnOn() {
		System.out.println("전원 ON");
	}
	@Override
	public void turnOff() {
		System.out.println("전원 OFF");
		
	}
	@Override
	public void setVolum(int volume) {
		this.Volume = volume;
		System.out.println("Volume : " + volume);
	}
	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.println("channel : " + channel);
	}
	@Override
	public String receiveVoice(String voice) {
		System.out.println("음성 입력 : " + voice);
		return "voice :" + voice;
	}
	@Override
	public int channelSearch(String keyword) {
		int channel = 0;
		switch (keyword) {
		case "SBS":			channel = 5; break;
		case "KBS":			channel = 7; break;
		case "MBC":			channel = 11; break;
		case "Mnet":		channel = 27; break;
		case "ENA":			channel = 30; break;
		}
		return channel;
	}
	@Override
	public String[] contentSearch(String keyword) {
		String[] movieContents = {"포레스트 검프", "신세계", "러덜리스", "마녀", "말할수 없는 비밀"};
		String[] idolContents = {"아이브", "에스파", "블랙핑크", "BTS", "뉴진스"};
		String[] recommendContend = {"경영자들", "노바꾸","핑계고","굿데이","알클"};
		String[] choiceContents;
		switch (keyword) {
		case "영화" :
			choiceContents = movieContents; break;
		case "아이돌" :
			choiceContents = idolContents; break;
		default:
			choiceContents = recommendContend; break;
		}
		return choiceContents;
	}
	@Override
	public void touch(int a, int b) {
		this.x=a;
		this.y=b;
		System.out.println("(x,y : " + MessageFormat.format("({},{})", x,y));
		
	}
	
	
	
	
	
}
