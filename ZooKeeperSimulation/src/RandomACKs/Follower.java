package RandomACKs;

public class Follower {
	private int id;
	private int countNonoAckSeq;
	private int avg;
	private boolean isAck;
	public Follower(int id) {
		this.id = id;
		this.countNonoAckSeq = 0;
		this.avg = 0;
		this.isAck = false;
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
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public boolean isAck() {
		return isAck;
	}
	public void setAck(boolean isAck) {
		this.isAck = isAck;
	}
	
	
	

}
