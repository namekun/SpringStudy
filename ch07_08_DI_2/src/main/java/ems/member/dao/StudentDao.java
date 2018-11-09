package ems.member.dao;

import java.util.HashMap;
import java.util.Map;

import ems.member.Student;

public class StudentDao {
	
	// DAO에 이게 있기 때문에, 모든 기능이 하나의 DB에 접근이 가능한 것.
	private Map<String, Student> studentDB = new HashMap<String, Student>();
	
	public void insert(Student student) {
		studentDB.put(student.getsNum(), student);
	}
	
	public Student select(String sNum) {
		return studentDB.get(sNum);
	}
	
	public void update(Student student) {
		studentDB.put(student.getsNum(), student);
	}
	
	public void delete(String sNum) {
		studentDB.remove(sNum);
	}
	
	public Map<String, Student> getStudentDB() {
		return studentDB;
	}
	
}
