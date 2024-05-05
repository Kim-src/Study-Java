package kr.exam.abs;

public class PokemonWorld {
	
	public static void main(String[] args) {
		
		Pikachu pika = new Pikachu();
		
		pika.setMyName("피카츄");
		pika.setHp(100);
		pika.setProtect(7);
		pika.setSkill("백만볼트");
		
		Charamon mon = new Charamon();
		
		mon.setMyName("파이리");
		mon.setHp(70);
		mon.setProtect(8);
		mon.setSkill("불꽃꼬리");
		
		pika.attack(mon);
		mon.attack(pika);
		
		System.out.println(pika);
		System.out.println(mon);
		
	}

}
