import java.util.Scanner;

public class Ex12_4_Game {
	static Scanner sc = new Scanner(System.in);	

	static Ex12_4_Warlord warlord = new Ex12_4_Warlord(); // 케릭터
	static Ex12_4_CharacterAbility ability = new Ex12_4_CharacterAbility(); // 케릭터 어빌리티
	
	public static void main(String[] args) {
		startGame(); // 게임 시작
	}
	
	public static void startGame() {
		do { // 게임 시작
			System.out.println("게임 메뉴를 선택해주세요.");
			System.out.println("1. 사냥 시작");
			System.out.println("2. 인벤토리-포션");
			System.out.println("3. 스텟");
			System.out.println("4. 케릭터 정보 확인");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			System.out.println("------------------");

			if(menu == 1) {
				huntMenu(); // 사냥 시작
			} else if(menu == 2) {
				setPorsion(); // 인벤토리-포션
			} else if(menu == 3) {
				setStatus(); // 스텟
			} else if(menu == 4) {
				getCharInfo(); // 케릭터 정보 확인
			} else if(menu == 0) {
				System.out.println("게임을 종료합니다."); // 종료
				break;
			} else {
				System.out.println("올바른 메뉴를 선택해주세요.");
				System.out.println("------------------");
			}
		} while(true);
	}
	
	public static boolean huntMenu() {
		Ex12_4_MonsterAbility monster = new Ex12_4_MonsterAbility();
		
		do {
			System.out.println("공격을 선택해주세요.");
			System.out.println("1. 기본 공격");
			System.out.println("2. 민첩 스킬 사용");
			System.out.println("3. 지력 스킬 사용");
			System.out.println("0. 처음으로 돌아가기");
			System.out.print("메뉴 선택 : ");
			int selectAttack = sc.nextInt();
			System.out.println("------------------");

			if(selectAttack == 1) {
				// warlod의 attack 메서드를 호출하세요.
				// 인자값으로 monster를 넘겨주어야 합니다.
				boolean returnCheck = warlord.attack(monster, ability);
				if(returnCheck) {
					return true;
				}
			} else if(selectAttack == 2) {
				boolean returnCheck = warlord.dexSkill(monster, ability);
				if(returnCheck) {
					return true;
				}
			} else if(selectAttack == 3) {
				boolean returnCheck = warlord.knowledgeSkill(monster, ability);
				if(returnCheck) {
					return true;
				}
			} else if(selectAttack == 0) {
				// 처음으로 돌아가기
				System.out.println("처음 메뉴로 돌아갑니다.");
				System.out.println("------------------");
				return true;
			} else {
				System.out.println("------------------");
				System.out.println("올바른 메뉴를 선택해주세요.");
			}
			System.out.println("------------------");

		} while(true);
	}
	
	public static boolean setStatus() {
		// 레벨업 할때마다 스텟(unusedStatus) 5가 생김
		// 현재 레벨 확인 후 여유분의 스텟을 추가하는 코드 작성
		// * ability의 setter/getter를 이용
		do {
			System.out.println("사용할 스텟을 입력해주세요.");
			System.out.println("1. 힘+5");
			System.out.println("2. 민첩+5");
			System.out.println("3. 지력+5");
			System.out.println("0. 처음으로 돌아가기");
			System.out.print("사용할 스텟 : ");
			int selectStatus = sc.nextInt();
			System.out.println("------------------");

			if(selectStatus == 1) {
				// 힘이 5 증가되는 코드 작성
				if(ability.getUnusedStatus() >= 5) {
					ability.setStr(ability.getStr()+5);
					ability.setUnusedStatus(ability.getUnusedStatus()-5);
					System.out.println("힘이 5 증가되었습니다.");
					System.out.println("총 힘 : " + ability.getStr()); // 총 힘 출력
				} else {
					System.out.println("사용 가능한 스텟이 없습니다.");
				}
			} else if(selectStatus == 2) {
				if(ability.getUnusedStatus() >= 5) {
					ability.setDex(ability.getDex()+5);
					ability.setUnusedStatus(ability.getUnusedStatus()-5);
					System.out.println("민첩이 5 증가되었습니다.");
					System.out.println("총 민첩 : " + ability.getDex()); 
				} else {
					System.out.println("사용 가능한 스텟이 없습니다.");
				}
			} else if(selectStatus == 3) {
				if(ability.getUnusedStatus() >= 5) {
					ability.setKnowledge(ability.getKnowledge()+5);
					ability.setUnusedStatus(ability.getUnusedStatus()-5);
					System.out.println("지력이 5 증가되었습니다.");
					System.out.println("총 지력 : " + ability.getKnowledge()); 
				} else {
					System.out.println("사용 가능한 스텟이 없습니다.");
				}
			
			} else if(selectStatus == 0) {
				// 처음으로 돌아가기
				System.out.println("처음 메뉴로 돌아갑니다.");
				System.out.println("------------------");
				return true;
			} else {
				System.out.println("올바른 메뉴를 선택해주세요.");
			}
			System.out.println("------------------");

		} while(true);
	}
	
	public static boolean getCharInfo() {
		// 케릭터의 체력, 마나, 힘, 민첩, 지력, 사용가능스텟, 현재 경험치를 출력하는 코드 작성
		// ability의 getter 사용
		System.out.println("<케릭터 정보>");
		System.out.println("체력 : " + ability.getHp());
		System.out.println("마나 : " + ability.getMp());
		System.out.println("힘 : " + ability.getStr());
		System.out.println("민첩 : " + ability.getDex());
		System.out.println("지력 : " + ability.getKnowledge());
		System.out.println("사용 가능 스텟 : " + ability.getUnusedStatus());
		System.out.println("현재 레벨 : " + ability.getLevel());
		System.out.println("현재 경험치 : " + ability.getExperience());
		System.out.println("------------------");
		return true;
	}
	
	public static boolean setPorsion() {
		do {
			System.out.println("인벤토리-포션");
			System.out.println("1. 체력 포션");
			System.out.println("2. 마나 포션"); 
			System.out.println("3. 포션 목록");
			System.out.println("0. 처음으로 돌아가기");
			System.out.print("사용할 포션을 선택하세요: ");
			int selectPorsion = sc.nextInt();
			System.out.println("------------------");
			
			if(selectPorsion == 1) {
				if(ability.getHpPortionCount() > 0) { // hpPortionCount 1 감소 (만약, 개수가 0개라면 사용 불가)
					ability.setHpPortionCount(ability.getHpPortionCount()-1);
					ability.setHp(ability.getHp()+50);// hp 50 증가
					System.out.println("체력 포션을 사용했습니다!");
					System.out.println("현재 체력 : " + ability.getHp()); // 회복 후 체력 출력
				} else {
					System.out.println("사용 가능한 물약이 없습니다.");
				}
			} else if(selectPorsion == 2) {
				if(ability.getMpPortionCount() > 0) { 
					ability.setMpPortionCount(ability.getMpPortionCount()-1);
					ability.setMp(ability.getMp()+50);
					System.out.println("마나 포션을 사용했습니다!");
					System.out.println("현재 마나 : " + ability.getMp()); 
				} else {
					System.out.println("사용 가능한 물약이 없습니다.");
				}
			} else if(selectPorsion == 3) {
				System.out.println("현재 체력 포션 개수 : " + ability.getHpPortionCount()); 
				System.out.println("현재 마나 포션 개수 : " + ability.getMpPortionCount()); 
			} else if(selectPorsion == 0) {
				// 처음으로 돌아가기
				System.out.println("처음 메뉴로 돌아갑니다.");
				System.out.println("------------------");
				return true;
			} else {
				System.out.println("올바른 메뉴를 선택해주세요.");
			}
			System.out.println("------------------");
		} while(true);
	}
}
