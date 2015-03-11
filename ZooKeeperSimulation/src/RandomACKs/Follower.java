package RandomACKs;

import java.util.ArrayList;

public class Follower {
	private int id;
	private int countNonoAckSeq;
	private ArrayList<Integer> countNonoAcks = new ArrayList<Integer>();
	private boolean isAck;
	public Follower(int id) {
		this.id = id;
		this.countNonoAckSeq = 0;
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
	public boolean isAck() {
		return isAck;
	}
	public void setAck(boolean isAck) {
		this.isAck = isAck;
	}
	
	public void countNonoAckSeq() {
		countNonoAckSeq++;
	}
	public void countAck() {
		countNonoAcks.add(++countNonoAckSeq);
		countNonoAckSeq=0;
	}
	public ArrayList<Integer> getCountNonoAcks() {
		return countNonoAcks;
	}
	public int getAvg() {
		int sum = 0;
		if (countNonoAcks.size()==0)
			return 0;
		else{
			for(int n:countNonoAcks)
				sum+=n;
		}
		return sum/countNonoAcks.size();
	}
		
	
	
	
	
	

}
