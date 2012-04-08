package placeholderDatabeans;

public class UserBean {

	private String name;
	
	private String password;
	
	private StatBean lastGameStats = new StatBean();
	
	private StatBean totalStats = new StatBean();
	
	public UserBean() {}
	
	public UserBean(String name) {
		setName(name);
		setLastGameStats(new StatBean());
		setTotalStats(new StatBean());
	}
	
	//TODO testing.
	public static UserBean esf = new UserBean("esf");
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public StatBean getLastGameStats() {
		return lastGameStats;
	}

	public void setLastGameStats(StatBean lastGameStats) {
		this.lastGameStats = lastGameStats;
	}

	public StatBean getTotalStats() {
		return totalStats;
	}

	public void setTotalStats(StatBean totalStats) {
		this.totalStats = totalStats;
	}
	
	public void onGameFinish() {
		//TODO data comes from game, place into StatBean, that = the lastGameStats. then add all 
		setLastGameStats(fromLastGamePlaceholder());
		getTotalStats().onGameFinish(getLastGameStats());
	}
	
	private StatBean fromLastGamePlaceholder() {
		StatBean stat = new StatBean();
		stat.setKills(1);
		stat.setDeaths(1);
		stat.setHits(1);
		stat.setShots(2);
		stat.setWins(1);
		stat.setLosses(0);
		return stat;
	}
}
