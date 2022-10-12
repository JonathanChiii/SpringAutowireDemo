package business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int id;
	private String name;
	private String email;

	//@Qualifier("account") // annotation version of byName
	@Autowired              // annotation version of byType
	private Account account;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account acc) {
		this.account = acc;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", acc=" + account + "]";
	}
}
