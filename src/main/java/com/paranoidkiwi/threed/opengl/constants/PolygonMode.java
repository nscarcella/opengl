package com.paranoidkiwi.threed.opengl.constants;

public class PolygonMode extends OpenGLConstant {

	public final static PolygonMode POINT = new PolygonMode(6912);
	public final static PolygonMode LINE = new PolygonMode(6913);
	public final static PolygonMode FILL = new PolygonMode(6914);

	// ****************************************************************
	// ** CONSTRUCTORS
	// ****************************************************************

	protected PolygonMode(int value) {
		super(value);
	}
}
