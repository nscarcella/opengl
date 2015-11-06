package com.paranoidkiwi.threed.opengl.constants;

public class PolygonFace extends OpenGLConstant {

	public final static PolygonFace FRONT = new PolygonFace(1028);
	public final static PolygonFace BACK = new PolygonFace(1029);
	public final static PolygonFace FRONT_AND_BACK = new PolygonFace(1032);

	// ****************************************************************
	// ** CONSTRUCTORS
	// ****************************************************************

	protected PolygonFace(int value) {
		super(value);
	}
}