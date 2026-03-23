package kr.co.restStudy;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResDTO {
	// 직원번호
	private Long id;
	// 이름
	private String name;
	// 부서명
	private String deptName;
	// 직책
	private String position;
	// 상태
	private String status;
	// 이메일
	private String email;
}
