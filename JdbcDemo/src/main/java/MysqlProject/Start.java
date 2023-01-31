package MysqlProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hello User Please Enter Your Name: \n");
		String user = br.readLine();
		System.out.println("Welcome To Student Management App." + user);
		
		
		while(true) {
			System.out.println("PRESS 1 to ADD student");
			System.out.println("PRESS 2 to DELETE student");
			System.out.println("PRESS 3 to DISPLAY student");
			System.out.println("PRESS 4 to UPDATE student");
			System.out.println("PRESS 5 to EXIT App");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c == 1) {
				//Add student
				
				System.out.println("Enter User Name: ");
				String name = br.readLine();
				System.out.println("Enter User Phone: ");
				String phone = br.readLine();
				System.out.println("Enter User City: ");
				String city = br.readLine();
				
				//create student object
				Student st = new Student(name,phone,city);
				boolean ans = StudentDao.insertStudentRecordToDB(st);
				if(ans) {
					System.out.println("Student record Inserted Successfully...");
					System.out.println("Student Record:" + st);
				}
				else {
					System.out.println("Some error Occured While Inserting...Please try Again!");
				}
				
			}
			else if(c == 2) {
				//Delete student
				System.out.println("Enter Student ID To Delete: ");
				int userID = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deleteStudentRecordFromDB(userID);
				if(f) {
					System.out.println("Student Of ID " + userID + " Record Deleted... ");
				}else {
					System.out.println("Something Went Wrong.. Please try Again!");
				}
			}
			else if(c == 3) {
				//Display student
				StudentDao.showAllStudentRecords();
			}
			else if(c == 4) {
				//Update student
				System.out.println("PRESS 1 to UPDATE name");
				System.out.println("PRESS 2 to UPDATE phone");
				System.out.println("PRESS 3 to UPDATE city");
				int val = Integer.parseInt(br.readLine());
				if(val == 1) {
					//Update Name
					System.out.println("Enter name to UPDATE...");
					String name = br.readLine();
					System.out.println("Enter ID to identify student!");
					int id = Integer.parseInt(br.readLine());
					Student st = new Student();
					st.setStudentName(name);
					boolean f = StudentDao.updateStudentRecord(val,name,id,st);
					if(f) {
						System.out.println("Student Name Updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else if(val == 2) {
					//Update Phone
					System.out.println("Enter phone to UPDATE...");
					String phone = br.readLine();
					System.out.println("Enter ID to identify student!");
					int id = Integer.parseInt(br.readLine());
					Student st = new Student();
					st.setStudentPhone(phone);
					boolean f = StudentDao.updateStudentRecord(val,phone,id,st);
					if(f) {
						System.out.println("Student Phone Updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else if(val == 3) {
					//Update city
					System.out.println("Enter city to UPDATE...");
					String city = br.readLine();
					System.out.println("Enter ID to identify student!");
					int id = Integer.parseInt(br.readLine());
					Student st = new Student();
					st.setStudentCity(city);
					boolean f = StudentDao.updateStudentRecord(val,city,id,st);
					if(f) {
						System.out.println("Student City Updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else {
					System.out.println("Hey You have not updated Anything... Please choose option Correctly!");
				}
				
			}
			else if(c == 5) {
				//Exit
				
				System.out.println("Thank You For Using Application...If You Enjoyed, Please Experience It Again!" + user);
				break;
			}
			else {
				
			}
			
		}
	}
}

