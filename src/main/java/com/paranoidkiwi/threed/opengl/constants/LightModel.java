package com.paranoidkiwi.threed.opengl.constants;

public class LightModel extends OpenGLConstant {

	public final static LightModel LOCAL_VIEWER = new LightModel(2897);
	public final static LightModel TWO_SIDE = new LightModel(2898);
	public final static LightModel AMBIENT = new LightModel(2899);

	// ****************************************************************
	// ** CONSTRUCTORS
	// ****************************************************************

	protected LightModel(int value) {
		super(value);
	}
}
