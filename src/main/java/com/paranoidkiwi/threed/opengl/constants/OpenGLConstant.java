package com.paranoidkiwi.threed.opengl.constants;

public abstract class OpenGLConstant {

	private int value;

	// ****************************************************************
	// ** CONSTRUCTORS
	// ****************************************************************

	protected OpenGLConstant(int value) {
		this.setValue(value);
	}

	// ****************************************************************
	// ** ACCESSORS
	// ****************************************************************

	public int getValue() {
		return this.value;
	}

	protected void setValue(int value) {
		this.value = value;
	}
}