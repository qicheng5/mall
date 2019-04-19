package cn.background.web.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		Object object = ActionContext.getContext().getSession().get("user");
		if(object==null) {
			//不存在=>没登陆=>重定向到登录页面
			return "toLogin";
		}else {
			//存在=>登录=>放行
			return arg0.invoke();
		}
	}

}
