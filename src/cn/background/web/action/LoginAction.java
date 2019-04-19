package cn.background.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String name;
	private String passwd;
	
	
	public String execute() throws Exception {
		if (name=="") { 
			return "toLogin"; 
		} else if (name.equals("admin")&&passwd.equals("123")) {
			ActionContext.getContext().getSession().put("user", name);
			return SUCCESS;
		} else {
			return "toLogin"; 
		}
		 
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
}

