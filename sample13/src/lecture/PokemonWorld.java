package lecture;

public class PokemonWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pkachu pica = new Pkachu();
		
		pica.setMyName("피카츄");
		pica.setHp(100);
		pica.setProtect(7);
		pica.setSkill("백만볼트");
		
		Charamon chramon = new Charamon();
		
		chramon.setMyName("파이리");
		chramon.setHp(70);
		chramon.setProtect(8);
		chramon.setSkill("불꽃꼬리");
		
		pica.attack(chramon);
		chramon.attack(pica);
		
		System.out.println(pica);
		System.out.println(chramon);
		
	}

}
