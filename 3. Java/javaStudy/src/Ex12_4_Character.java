public interface Ex12_4_Character {
	// attack() 추상 메서드를 구현하세요.
	public boolean attack(Ex12_4_MonsterAbility monster, Ex12_4_CharacterAbility ability);
	public boolean dexSkill(Ex12_4_MonsterAbility monster, Ex12_4_CharacterAbility ability);
	public boolean knowledgeSkill(Ex12_4_MonsterAbility monster, Ex12_4_CharacterAbility ability);
	
	public boolean dead(Ex12_4_CharacterAbility ability);
}
