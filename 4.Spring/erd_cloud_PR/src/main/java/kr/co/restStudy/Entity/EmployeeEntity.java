package kr.co.restStudy.Entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name ="emplyee")
public class EmployeeEntity {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;	// 사원번호
	
	@Column(name = "name" , nullable = false , length = 50)
	private String name; // 이름
	
	@Column(name = "dept_name", length = 50)
	private String deptName; // 부서명
	
	@Column(name = "position", length = 50)
	private String position; // 직책
	
	@Column(name = "email", length = 100)
	private String email;	// 이메일
	
	@Column(name = "status", length = 20)
	@Builder.Default
	private String status = "활성";  // 상태
	
	@CreatedDate
	@Column(name = "created_at" , updatable = false,
			columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")			
	private LocalDateTime createdAt;	// 생성일
	
	@LastModifiedDate
	@Column(name = "updated_at",
			columnDefinition = "TIMESTAMP DEFUALT CURRENT_TIMESTAMP")
	private LocalDateTime updatedAt;	// 수정일		 									
	
}
