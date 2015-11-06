package com.paranoidkiwi.threed.opengl.constants;

public class LightProperty extends OpenGLConstant {

	public final static LightProperty AMBIENT = new LightProperty(4608);
	public final static LightProperty DIFFUSE = new LightProperty(4609);
	public final static LightProperty SPECULAR = new LightProperty(4610);
	public final static LightProperty POSITION = new LightProperty(4611);
	public final static LightProperty SPOT_DIRECTION = new LightProperty(4612);
	public final static LightProperty SPOT_EXPONENT = new LightProperty(4613);
	public final static LightProperty SPOT_CUTOFF = new LightProperty(4614);
	public final static LightProperty CONSTANT_ATTENUATION = new LightProperty(4615);
	public final static LightProperty LINEAR_ATTENUATION = new LightProperty(4616);
	public final static LightProperty QUADRATIC_ATTENUATION = new LightProperty(4617);

	// ****************************************************************
	// ** CONSTRUCTORS
	// ****************************************************************

	protected LightProperty(int value) {
		super(value);
	}
}