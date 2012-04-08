package jmb;

import placeholderDatabeans.UserBean;

public class GamerScoreAction {
	private String name;
	private UserBean user;
	
	private String target;
	
	private static final String SUMMARY = "summary";
	private static final String SUCCESS = "success";

	   public String login() throws Exception {
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
		  return SUMMARY;
	   }
	   
	   
	   // just navigate based on the value provided by the clicked button/link. Probably bad practice in the real world, we shall see.
	   public String nav() throws Exception {
		   //TODO get the target param, use that as the forward.
		   System.out.println(getTarget());
		   return getTarget();
	   }
	   
	   
	   // remove the UserBean. 
	   public String logout() throws Exception {
		   user = null;
		   return SUCCESS;
	   }
	   
	   
	   public String getName() {
	      return name;
	   }
	
	   public void setName(String name) {
	      this.name = name;
	   }
	   
	   public UserBean getUser() {
		   return user;
	   }
	   
	   public void setUser(UserBean user) {
		   this.user = user;
	   }


	public String getTarget() {
		return target;
	}


	public void setTarget(String target) {
		this.target = target;
	}
	   
	   
}
