package MysqlProject;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springbean.xml");
		StudentDao s=(StudentDao) context.getBean("stuSerImp");
		Student stu=new Student();
		stu.setStudentName("Prakash");
		stu.setStudentPhone("883492383");
		stu.setStudentCity("Trichy");
		s.insertStu(stu);
		s.deleteStuById(10);
		s.updateStuCourseById("9787060925", 1);
		List<Student> st= s.getAllStudents();
		for(Student ss: st)
			System.out.println(ss.getStudentID()+" "+ss.getStudentName()+" "+ss.getStudentPhone()+" "+ss.getStudentCity());
	}
}

