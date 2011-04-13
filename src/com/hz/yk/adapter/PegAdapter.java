package com.hz.yk.adapter;

public class PegAdapter extends SquarePeg{
	private RoundPeg roundPeg;

	public PegAdapter(RoundPeg peg) {
		this.roundPeg = peg;
	}

	public void insert(String str) {
		roundPeg.insertIntohole(str);
	}
}
