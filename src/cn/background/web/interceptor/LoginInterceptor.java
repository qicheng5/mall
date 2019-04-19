package cn.background.web.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		Object object = ActionContext.getContext().getSession().get("user");
		if(object==null) {
			//������=>û��½=>�ض��򵽵�¼ҳ��
			return "toLogin";
		}else {
			//����=>��¼=>����
			return arg0.invoke();
		}
	}

}
