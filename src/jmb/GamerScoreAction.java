package jmb;

import java.util.HashMap;
import java.util.Map;

import placeholderDatabeans.UserBean;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

public class GamerScoreAction {
	private String name;
	
	private String target;
	
	private static final String SUMMARY = "summary";
	private static final String SUCCESS = "success";

	   public String login() throws Exception {
		   Map<String, Object> session = ActionContext.getContext().getSession();
//		   ValueStack stack = ActionContext.getContext().getValueStack();
		   /*
		   Map<String, Object> context = new HashMap<String, Object>();
		   */
		   if (session.get("user") == null) {
			   UserBean user = new UserBean();
			   user.setName(name);
				user.getTotalStats().setShots(1000);
				user.getTotalStats().setHits(40);
				user.onGameFinish();
				session.put("user", user);
//			   stack.push(context);
		   }
		   
		   
		   /*
		  if (user == null) {
			  user = new UserBean();
			  user.setName(name);

			if (user.getName().equals(UserBean.esf.getName()))
				user = UserBean.esf;
			else {
				user.getTotalStats().setShots(1000);
				user.getTotalStats().setHits(40);
				user.onGameFinish();
			}
		  }
		  */
		  return SUMMARY;
	   }
	   
	   
	   // just navigate based on the value provided by the clicked button/link. Probably bad practice in the real world, we shall see.
	   public String nav() throws Exception {
		   //TODO get the target param, use that as the forward.
		   return getTarget();
	   }
	   
	   
	   // remove the UserBean. 
	   public String logout() throws Exception {
		   Map<String, Object> session = ActionContext.getContext().getSession();
		   session.remove("user");
		   return SUCCESS;
	   }
	   
	   
	   public String getName() {
	      return name;
	   }
	
	   public void setName(String name) {
	      this.name = name;
	   }

	public String getTarget() {
		return target;
	}


	public void setTarget(String target) {
		this.target = target;
	}
	   
	   
}
