package com.paranoidkiwi.threed.opengl.constants;

public class Light extends State {

	public final static Light LIGHT_0 = new Light(16384);
	public final static Light LIGHT_1 = new Light(16385);
	public final static Light LIGHT_2 = new Light(16386);
	public final static Light LIGHT_3 = new Light(16387);
	public final static Light LIGHT_4 = new Light(16388);
	public final static Light LIGHT_5 = new Light(16389);
	public final static Light LIGHT_6 = new Light(16390);
	public final static Light LIGHT_7 = new Light(16391);

	// ****************************************************************
	// ** CONSTRUCTORS
	// ****************************************************************

	protected Light(int value) {
		super(value);
	}
}