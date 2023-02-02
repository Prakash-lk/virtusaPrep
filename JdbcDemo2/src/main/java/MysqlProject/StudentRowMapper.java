package MysqlProject;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student s = new Student();
		 s.setStudentID(rs.getInt("sid"));
		 s.setStudentName(rs.getString("sname"));
		 s.setStudentPhone(rs.getString("sphone"));
		 s.setStudentCity(rs.getString("scity"));
		 	return s;
		
	}
	
}
