package RandomACKs;

public class Follower {
	private int id;
	private int countNonoAckSeq;
	private int avg;
	public Follower(int id) {
		super();
		this.id = id;
		this.countNonoAckSeq = 0;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCountNonoAckSeq() {
		return countNonoAckSeq;
	}
	public void setCountNonoAckSeq(int countNonoAckSeq) {
		this.countNonoAckSeq = countNonoAckSeq;
	}
	
	

}
