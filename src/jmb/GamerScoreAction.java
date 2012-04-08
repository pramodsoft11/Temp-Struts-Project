package jmb;

import placeholderDatabeans.UserBean;

public class GamerScoreAction {
	private String name;
	private UserBean user;

	   public String execute() throws Exception {
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
		  return "summary";
	   }
	   
	   public String logout() throws Exception {
		   user = null;
		   return "success";
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
}
