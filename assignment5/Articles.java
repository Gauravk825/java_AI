package assignment5;


public class Articles implements Comparable<Articles>{
	
	private int arid;
	private String arname;
	private String subject;
	private int yearpub;
	private long views;
	
	
	public Articles(int arid, String arname, String subject, int yearpub, long views) {
		this.arid = arid;
		this.arname = arname;
		this.subject = subject;
		this.yearpub = yearpub;
		this.views = views;
	}


	public int getArid() {
		return arid;
	}


	public void setArid(int arid) {
		this.arid = arid;
	}


	public String getArname() {
		return arname;
	}


	public void setArname(String arname) {
		this.arname = arname;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public int getYearpub() {
		return yearpub;
	}


	public void setYearpub(int yearpub) {
		this.yearpub = yearpub;
	}


	public long getViews() {
		return views;
	}


	public void setViews(long views) {
		this.views = views;
	}


	@Override
	public String toString() {
		return "Articles [arid=" + arid + ", arname=" + arname + ", subject=" + subject + ", yearpub=" + yearpub
				+ ", views=" + views + "]";
	}


	@Override
	public int compareTo(Articles o) {
		// TODO Auto-generated method stub
		return this.arid - o.arid;
	}
	
	
	
	

}
