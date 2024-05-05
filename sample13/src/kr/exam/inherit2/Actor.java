package kr.exam.inherit2;

public class Actor extends Person {

	private String myMovie;
	
	// 생성자
	public Actor(String myName, int age, String string) {
		// 숨어있는 것
		// super 부모
		super(myName, age);
		// 부모 생성자 호출이 맨처음으로 나와야 한다.
		// 나머지 코드는 그 다음에 쓴다.
		this.setMyMovie(myMovie);
	}

	public String getMyMovie() {
		return myMovie;
	}

	public void setMyMovie(String myMovie) {
		this.myMovie = myMovie;
	}
	
}
