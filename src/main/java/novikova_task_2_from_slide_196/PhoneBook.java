package novikova_task_2_from_slide_196;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook
{
	private Map<String,String> notes;
	
	public PhoneBook()
	{
		notes = new HashMap();
	}
	
	public PhoneBook(Map<String, String> notes)
	{
		this.notes = notes;
	}
	
	public void addNote(String name, String phone)
	{
		if(!notes.containsKey(name))
			notes.put(name, phone);
		else
			System.out.println("Note with this abonent already exists");
	}
	
	public void deleteNote(String name)
	{
		if (notes.containsKey(name))
			notes.remove(name);
		else
			System.out.println("Note with this abonent does not exists");
	}
	
	public void edit(String name, String phone)
	{
		if(notes.containsKey(name))
			notes.replace(name,phone);
		else
			System.out.println("Note with this abonent does not exists");
	}

	public Map<String, String> getNotes()
	{
		return notes;
	}

	public void setNotes(Map<String, String> notes)
	{
		this.notes = notes;
	}
}
