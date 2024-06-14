package lecture;

public class ObjectTest {
	
	public static void add(int a) {
		a = a+10;
	}
	
	public static void minusHP(Pokemon p) {
		p.setHp( p.getHp() - 50);
	}

	public static void main(String[] args) {
	
		int a  = 10;
		
		Pkachu pica = new Pkachu();
		pica.setMyName("피카츄");
		pica.setHp(100);
		pica.setProtect(7);
		pica.setSkill("백만볼트");
		
		ObjectTest.add(a);
		ObjectTest.minusHP(pica);
		
		System.out.println(a);  // ? 10
		System.out.println(pica.getHp());  // ?  50
		
	}

}
