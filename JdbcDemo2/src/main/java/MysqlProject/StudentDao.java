package MysqlProject;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void insertStu(Student stu) {
		String s = "insert into students(sname,sphone,scity) values(?,?,?)";
		int insert=	jdbcTemplate.update(s,  stu.getStudentName(),stu.getStudentPhone(),stu.getStudentCity());
		if(insert>0)
			System.out.println("data inserted");
	}
	public void deleteStuById(int studentID) {
		 String s="delete from students where sid=? ";
			int delete= jdbcTemplate.update(s,studentID);
			if(delete>0)
				System.out.println("Deleted the data successfully");
			
	}

	public void updateStuCourseById(String studentPhone, int studentID) {
		 String s="update students set sphone=? where sid=? ";
		int update= jdbcTemplate.update(s,studentPhone,studentID);
		if(update>0)
			System.out.println("Updated the data successfully");
		
	}
	public List<Student> getAllStudents() {
		 String s="select * from students";
	List<Student>stus=	jdbcTemplate.query(s,new StudentRowMapper());
		return stus;
	}
	
	
	
}
