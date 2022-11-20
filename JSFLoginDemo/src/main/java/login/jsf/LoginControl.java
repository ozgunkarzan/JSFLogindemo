package login.jsf;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean
@SessionScoped
public class LoginControl {


	 private String userName;
	 private String password;
		
	 public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	//check password
	public String check() {
		String matched;
		
		if (userName.equals("user1") && password.equals("pass")) {
		 matched = "success";
		} else {
		matched = "failure";
		}
		
		return matched;
		}

	

}
