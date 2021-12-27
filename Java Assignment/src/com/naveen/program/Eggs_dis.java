package com.naveen.program;

public class Eggs_dis {
	private int total;
	private int gross=144;
	private int dozen=12;
	private int num_gross;
	private int num_dozen;
	private int rem_eggs=0;
	public void setTotal(int total) {
		this.total = total;
	}
	public int getNum_gross() {
		grosscal();
		return num_gross;
	}
	public int getNum_dozen() {
		dozencal();
		return num_dozen;
	}
	public int getRem_eggs() {
		return rem_eggs;
	}
	public void grosscal() {
		num_gross=total/gross;
		rem_eggs=total%gross;
	}
	public void dozencal() {
		if(rem_eggs>=12) {
			num_dozen=rem_eggs/dozen;
			rem_eggs=rem_eggs%dozen;
		}
	}

}
