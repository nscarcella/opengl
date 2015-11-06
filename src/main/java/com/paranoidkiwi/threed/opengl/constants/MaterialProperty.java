package com.paranoidkiwi.threed.opengl.constants;

public class MaterialProperty extends OpenGLConstant {

	public final static MaterialProperty AMBIENT = new MaterialProperty(4608);
	public final static MaterialProperty DIFFUSE = new MaterialProperty(4609);
	public final static MaterialProperty AMBIENT_AND_DIFFUSE = new MaterialProperty(5634);
	public final static MaterialProperty SPECULAR = new MaterialProperty(4610);
	public final static MaterialProperty SHININESS = new MaterialProperty(5633);
	public final static MaterialProperty EMISSION = new MaterialProperty(5632);

	// ****************************************************************
	// ** CONSTRUCTORS
	// ****************************************************************

	protected MaterialProperty(int value) {
		super(value);
	}
}