package com.paranoidkiwi.threed.opengl.constants;

public class PrimitiveMode extends OpenGLConstant {

	public final static PrimitiveMode TRIANGLES = new PrimitiveMode(4);
	public final static PrimitiveMode TRIANGLE_STRIP = new PrimitiveMode(5);
	public final static PrimitiveMode QUADS = new PrimitiveMode(7);
	public final static PrimitiveMode QUAD_STRIP = new PrimitiveMode(8);
	public final static PrimitiveMode LINE = new PrimitiveMode(6913);

	// ****************************************************************
	// ** CONSTRUCTORS
	// ****************************************************************

	protected PrimitiveMode(int value) {
		super(value);
	}
}
