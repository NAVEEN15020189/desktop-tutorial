package com.naveen.program;

public class EggMain {
	public static void main(String[] args) {
		
		Eggs_dis ed=new Eggs_dis();
		ed.setTotal(184);
		System.out.println(ed.getNum_gross()+" number of gross eggs");
		System.out.println(ed.getNum_dozen()+" number of dozen eggs");
		System.out.println(ed.getRem_eggs()+" number of remaining eggs");
	}
}
