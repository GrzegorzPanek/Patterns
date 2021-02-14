package edu.grcy.patterns.creational.factory;

public class MacBookPro extends MacBook {

	private String memory;
	private String disc;
	private int screenSize;

	public MacBookPro(String name, String par1, int par2) {
		this.memory = name;
		this.disc = par1;
		this.screenSize = par2;
	}

	@Override
	public String getMemory() {
		return memory;
	}

	@Override
	public String getDisk() {
		return disc;
	}

	@Override
	public int getScreenSize() {
		return screenSize;
	}
}
