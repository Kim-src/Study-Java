package review;

public class Actor extends Person {
	
	private String myMovie;
	
	// 생성자를 정의하였습니다.
	public Actor(String name, int age, String gender, String myMovie) {
		super(name, age, gender);
		this.setMyMovie(myMovie);
	}

	// myMovie에 대한 getter/setter 메서드입니다.
	public String getMyMovie() {
		return myMovie;
	}

	public void setMyMovie(String myMovie) {
		this.myMovie = myMovie;
	}
	
}
