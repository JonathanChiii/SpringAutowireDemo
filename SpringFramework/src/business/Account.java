package business;

import org.springframework.stereotype.Component;

@Component
public class Account {
	private int accNum;
	private String accType;
	private String accBranchName;
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getAccBranchName() {
		return accBranchName;
	}
	public void setAccBranchName(String accBranchName) {
		this.accBranchName = accBranchName;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accType=" + accType + ", accBranchName=" + accBranchName + "]";
	}
	
	
	
}
