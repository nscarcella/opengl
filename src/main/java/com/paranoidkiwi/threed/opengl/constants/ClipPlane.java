package com.paranoidkiwi.threed.opengl.constants;

public class ClipPlane extends OpenGLConstant {

	public final static ClipPlane PLANE_0 = new ClipPlane(12288);
	public final static ClipPlane PLANE_1 = new ClipPlane(12289);
	public final static ClipPlane PLANE_2 = new ClipPlane(12290);
	public final static ClipPlane PLANE_3 = new ClipPlane(12291);
	public final static ClipPlane PLANE_4 = new ClipPlane(12292);
	public final static ClipPlane PLANE_5 = new ClipPlane(12293);

	// ****************************************************************
	// ** CONSTRUCTORS
	// ****************************************************************

	protected ClipPlane(int value) {
		super(value);
	}
}