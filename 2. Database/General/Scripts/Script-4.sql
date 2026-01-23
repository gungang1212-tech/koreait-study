CREATE TABLE employee (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(50),
  age INT,
  gender CHAR(1),
  dept VARCHAR(30),
  salary INT
);

ALTER TABLE employee RENAME TO employees;

CREATE TABLE position (
  id INT PRIMARY KEY AUTO_INCREMENT,
  position_name VARCHAR(30)
);

ALTER TABLE employee ADD position_id INT;

INSERT INTO position (id, position_name) VALUES
(1, '사원'),
(2, '대리'),
(3, '과장'),
(4, '차장'),
(5, '팀장');

INSERT INTO employee (id, name, age, gender, dept, salary, position_id) VALUES
(1, '김민수', 25, 'M', '개발팀', 3000, 1),
(2, '이영희', 32, 'W', '개발팀', 4200, 3),
(3, '박지훈', 28, 'M', '기획팀', 3500, 2),
(4, '최은지', 35, 'W', '마케팅팀', 4800, 4),
(5, '정우성', 41, 'M', '개발팀', 6000, 5),
(6, '김서연', 27, 'W', '기획팀', 3100, 1),
(7, '이민호', 29, 'M', '마케팅팀', 3300, 2),
(8, '홍길동', 23, 'M', '개발팀', NULL, 1),
(9, '김하늘', 31, 'W', '개발팀', 3900, 2),
(10, '오세훈', 38, 'M', '영업팀', 4500, 3);

