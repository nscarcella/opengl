package com.paranoidkiwi.threed.opengl.constants;

public class Buffer extends OpenGLConstant {

	public final static Buffer COLOR_BUFFER = new Buffer(16384);
	public final static Buffer DEPTH_BUFFER = new Buffer(256);

	// ****************************************************************
	// ** CONSTRUCTORS
	// ****************************************************************

	protected Buffer(int value) {
		super(value);
	}
}