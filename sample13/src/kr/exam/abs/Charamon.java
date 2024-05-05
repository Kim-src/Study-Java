package kr.exam.abs;

public class Charamon extends Pokemon {
	
	@Override
	public void attack(Pokemon p) {
		
		System.out.println(this.getMyName() + "의 " + this.getSkill() + " 공격!!!");
		
		if(this.getProtect() < 10) {
			int remind = p.getHp() - (10 - this.getProtect());
			p.setHp(remind);
			
			System.out.println(this.getMyName() + "이 공격하여 "
								+ p.getMyName() + "의 체력을 "
								+ remind + "만큼 줄었습니다.");
			
			if(p.getHp() <= 0) {
				System.out.println(p.getMyName() + "사망...");
			}
			
			
		} else {
			System.out.println(this.getMyName() + "이 공격했지만 "
					+ p.getMyName() + "이 영향을 받지 않습니다.");
		}
	}
}
