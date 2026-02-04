public class Ex12_4_CharacterAbility {									
	private int str, dex, knowledge, experience; // 힘, 덱스, 지력, 경험치
	private int level = 1; // 레벨
	private int hp = 100; // 체력
	private int mp = 100; // 마나
	private int unusedStatus = 0; // 사용하지 않은 스텟
	private int hpPortionCount = 10; // 체력 포션, 초기값 10, 사용 시 HP 50 회복
	private int mpPortionCount = 10; // 마나 포션, 초기값 10, 사용 시 MP 50 회복
	
	// 기본 생성자에 아래 능력치의 기본값을 설정하세요.
	// 힘:30, 덱스:30, 지력:30, 경험치:0
	public Ex12_4_CharacterAbility() {
		this.str = 30;
		this.dex = 30;
		this.knowledge = 30;
	}

	public Ex12_4_CharacterAbility(int str, int dex, int knowledge, int experience, int level, int hp, int mp,
			int unusedStatus, int hpPortionCount, int mpPortionCount) {
		super();
		this.str = str;
		this.dex = dex;
		this.knowledge = knowledge;
		this.experience = experience;
		this.level = level;
		this.hp = hp;
		this.mp = mp;
		this.unusedStatus = unusedStatus;
		this.hpPortionCount = hpPortionCount;
		this.mpPortionCount = mpPortionCount;
	}

	// setter, getter 생성
	// alt+shift+S
	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(int knowledge) {
		this.knowledge = knowledge;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getUnusedStatus() {
		return unusedStatus;
	}

	public void setUnusedStatus(int unusedStatus) {
		this.unusedStatus = unusedStatus;
	}

	public int getHpPortionCount() {
		return hpPortionCount;
	}

	public void setHpPortionCount(int hpPortionCount) {
		this.hpPortionCount = hpPortionCount;
	}

	public int getMpPortionCount() {
		return mpPortionCount;
	}

	public void setMpPortionCount(int mpPortionCount) {
		this.mpPortionCount = mpPortionCount;
	}

	@Override
	public String toString() {
		return "Ex12_4_CharacterAbility [str=" + str + ", dex=" + dex + ", knowledge=" + knowledge + ", experience="
				+ experience + ", level=" + level + ", hp=" + hp + ", mp=" + mp + ", unusedStatus=" + unusedStatus
				+ ", hpPortionCount=" + hpPortionCount + ", mpPortionCount=" + mpPortionCount + "]";
	}
}












