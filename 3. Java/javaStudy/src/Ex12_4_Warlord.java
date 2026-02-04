public class Ex12_4_Warlord implements Ex12_4_Character {

	@Override
	public boolean attack(Ex12_4_MonsterAbility monster, Ex12_4_CharacterAbility ability) {
		int monsterDamage = monster.getDamage(); // 몬스터의 현재 공격력
		int monsterHp = monster.getHp(); // 몬스터의 현재 체력
		int hp = ability.getHp(); // 현재 체력
		int mp = ability.getMp(); // 현재 마나
		int exp = ability.getExperience(); // 현재 경험치
		int damage = (int) (ability.getStr() * 1.3); // 몬스터의 체력을 힘*1.3만큼 감소
		monster.setHp(monsterHp - damage);

		if (mp >= 10) { // 마나 3감소 (만약, 마나가 10 미만이라면 공격 사용 불가)
			ability.setMp(mp - 3);
			System.out.println("기본 공격을 사용했습니다.");
			System.out.println("몬스터가 " + damage + "의 피해를 입었습니다!");
			System.out.println("몬스터의 현재 체력 : " + (monsterHp - damage));
			if ((monsterHp - damage) <= 0) { // 몬스터의 체력이 0이되면 경험치가 13증가하고 처음 메뉴(startGame)으로 돌아감
				ability.setExperience(exp + 13);

				if (exp >= 100) { // 경험치가 100 이상이라면 레벨+1, 경험치는 0으로 초기화
					ability.setLevel(ability.getLevel() + 1);
					ability.setUnusedStatus(ability.getUnusedStatus()+5);
					ability.setExperience(0);
				}

				System.out.println("몬스터가 쓰러졌습니다!");
				System.out.println("------------------");
				return true;
			}

			System.out.println();
			System.out.println("몬스터가 공격했습니다!");
			System.out.println("케릭터가 " + monsterDamage + "의 피해를 입었습니다!");
			System.out.println("케릭터의 현재 체력 : " + (hp - monsterDamage));
			ability.setHp(hp - monsterDamage);

			dead(ability); // 케릭터 사망 확인
		} else {
			System.out.println("마나 부족합니다.");
		}

		return false;
	}

//	------------------------------------------------------------------------------------

	@Override
	public boolean dexSkill(Ex12_4_MonsterAbility monster, Ex12_4_CharacterAbility ability) {
		int monsterDamage = monster.getDamage();
		int monsterHp = monster.getHp();
		int hp = ability.getHp();
		int mp = ability.getMp();
		int exp = ability.getExperience();
		int damage = (int) (ability.getDex() * 1.8);
		monster.setHp(monsterHp - damage);

		if (mp >= 20) {
			ability.setMp(mp - 7);
			System.out.println("기본 공격을 사용했습니다.");
			System.out.println("몬스터가 " + damage + "의 피해를 입었습니다!");
			System.out.println("몬스터의 현재 체력 : " + (monsterHp - damage));
			if ((monsterHp - damage) <= 0) {
				ability.setExperience(exp + 15);

				if (exp >= 100) {
					ability.setLevel(ability.getLevel() + 1);
					ability.setUnusedStatus(ability.getUnusedStatus()+5);
					ability.setExperience(0);
				}

				System.out.println("몬스터가 쓰러졌습니다!");
				System.out.println("------------------");
				return true;
			}

			System.out.println();
			System.out.println("몬스터가 공격했습니다!");
			System.out.println("케릭터가 " + monsterDamage + "의 피해를 입었습니다!");
			System.out.println("케릭터의 현재 체력 : " + (hp - monsterDamage));
			ability.setHp(hp - monsterDamage);

			dead(ability); // 케릭터 사망 확인
		} else {
			System.out.println("마나 부족합니다.");
		}

		return false;
	}

//	------------------------------------------------------------------------------------

	@Override
	public boolean knowledgeSkill(Ex12_4_MonsterAbility monster, Ex12_4_CharacterAbility ability) {
		int monsterDamage = monster.getDamage();
		int monsterHp = monster.getHp();
		int hp = ability.getHp();
		int mp = ability.getMp();
		int exp = ability.getExperience();
		int damage = (int) (ability.getKnowledge() * 2.5);
		monster.setHp(monsterHp - damage);

		if (mp >= 30) {
			ability.setMp(mp - 15);
			System.out.println("기본 공격을 사용했습니다.");
			System.out.println("몬스터가 " + damage + "의 피해를 입었습니다!");
			System.out.println("몬스터의 현재 체력 : " + (monsterHp - damage));
			if ((monsterHp - damage) <= 0) {
				ability.setExperience(exp + 21);

				if (exp >= 100) {
					ability.setLevel(ability.getLevel() + 1);
					ability.setUnusedStatus(ability.getUnusedStatus()+5);
					ability.setExperience(0);
				}
			}

			System.out.println("몬스터가 쓰러졌습니다!");
			System.out.println("------------------");
			return true;
		}

		System.out.println();
		System.out.println("몬스터가 공격했습니다!");
		System.out.println("케릭터가 " + monsterDamage + "의 피해를 입었습니다!");
		System.out.println("케릭터의 현재 체력 : " + (hp - monsterDamage));
		ability.setHp(hp - monsterDamage);

		dead(ability); // 케릭터 사망 확인

		return false;
	}

//	------------------------------------------------------------------------------------

	@Override
	public boolean dead(Ex12_4_CharacterAbility ability) {
		if (ability.getHp() <= 0) { // 케릭터가 사망하면 체력과 마나가 70으로 초기화되고, 경험치를 30만큼 잃습니다.
			ability.setHp(70);
			ability.setMp(70);
			ability.setExperience(ability.getExperience() - 30);
			System.out.println("케릭터가 사망했습니다.");
			System.out.println("처음 메뉴로 돌아갑니다.");
			return true;
		} else {
			System.out.println("마나 부족합니다.");
			return false;
		}
	}

}
