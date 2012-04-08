package placeholderDatabeans;

import java.text.NumberFormat;

public class StatBean {

	private Integer kills;
	
	private Integer deaths;
	
	private Integer wins;
	
	private Integer losses;
	
	private Integer time;
	
	private Integer shots;
	
	private Integer hits;
	
	public StatBean() {
		setKills(0);
		setDeaths(0);
		setWins(0);
		setLosses(0);
		setTime(0);
		setShots(0);
		setHits(0);
	}

	public Integer getKills() {
		return kills;
	}

	public void setKills(Integer kills) {
		this.kills = kills;
	}

	public Integer getDeaths() {
		return deaths;
	}

	public void setDeaths(Integer deaths) {
		this.deaths = deaths;
	}

	public Integer getWins() {
		return wins;
	}

	public void setWins(Integer wins) {
		this.wins = wins;
	}

	public Integer getLosses() {
		return losses;
	}

	public void setLosses(Integer losses) {
		this.losses = losses;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public Integer getShots() {
		return shots;
	}

	public void setShots(Integer shots) {
		this.shots = shots;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}
	
	// increments the total values by the last game's values.
	public void onGameFinish(StatBean finishedGameStats) {
		setKills(getKills() + finishedGameStats.getKills());
		setDeaths(getDeaths() + finishedGameStats.getDeaths());
		setWins(getWins() + finishedGameStats.getWins());
		setLosses(getLosses() + finishedGameStats.getLosses());
		setTime(getTime() + finishedGameStats.getTime());
		setShots(getShots() + finishedGameStats.getShots());
		setHits(getHits() + finishedGameStats.getHits());
	}
	
	public String getAccuracy() {
		if (getHits() == 0)
			return "N/A";
		Float floatShots = Float.valueOf(getShots());
		Float floatHits = Float.valueOf(getHits());
		Float ratio = floatHits/floatShots;
		ratio = ratio * 100;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		nf.setMinimumFractionDigits(0);
		return nf.format(ratio) + "%";
	}
}
