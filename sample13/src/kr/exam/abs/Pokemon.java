package kr.exam.abs;

// 추상화 클래스는 접근제한자 뒤에 abstract 키워드를 붙인다.
public abstract class Pokemon {
	
	private String myName;
	private int hp;
	private int protect;
	private String skill;
	
	
	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getProtect() {
		return protect;
	}

	public void setProtect(int protect) {
		this.protect = protect;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	
	
	// 추상화 메서드 추가
	// attack 하나만 추상화 메서드
	public abstract void attack(Pokemon p);
	
	public String toString() {
		String str = "";
		// Ctrl + Alt + 아래 방향키
		str += "이름 = " + this.getMyName() + ", ";
		str += "체력 = " + this.getHp() + ", ";
		str += "방어력 = " + this.getProtect() + ", ";
		str += "스킬 = " + this.getSkill();
		return str;
	}
	
}
