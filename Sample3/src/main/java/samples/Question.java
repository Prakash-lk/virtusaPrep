package samples;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Question {
	private int id;  
	private String name;  
	private Map<String,String> answers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
	public void displayInfo() {
		System.out.println("Enter ID:"+id);
		System.out.println("Question Name:"+name);
		System.out.println("Answer");
		Set<Entry<String,String>> set=answers.entrySet();
		Iterator<Entry<String,String>> itr=set.iterator();
		while(itr.hasNext()) {
			Entry<String,String> entry=itr.next();
			System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());
		}
	}
}
