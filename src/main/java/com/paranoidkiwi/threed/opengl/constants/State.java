package com.paranoidkiwi.threed.opengl.constants;

public class State extends OpenGLConstant {

	public final static State DEPTH_TEST = new State(2929);
	public final static State CULL_FACE = new State(2884);
	public final static State LINE_STIPPLE = new State(2852);
	public final static State POLYGON_STIPPLE = new State(2882);
	public final static State VIEWPORT = new State(2978);
	public final static State LIGHTING = new State(2896);
	public final static State LIGHT_0 = Light.LIGHT_0;
	public final static State LIGHT_1 = Light.LIGHT_1;
	public final static State LIGHT_2 = Light.LIGHT_2;
	public final static State LIGHT_3 = Light.LIGHT_3;
	public final static State LIGHT_4 = Light.LIGHT_4;
	public final static State LIGHT_5 = Light.LIGHT_5;
	public final static State LIGHT_6 = Light.LIGHT_6;
	public final static State LIGHT_7 = Light.LIGHT_7;
	public final static State TEXTURE_1D = TextureType.TEXTURE_1D;
	public final static State TEXTURE_2D = TextureType.TEXTURE_2D;
	public final static State TEXTURE_3D = TextureType.TEXTURE_3D;
	public final static State TEXTURE_CUBE_MAP = TextureType.TEXTURE_CUBE_MAP;

	// ****************************************************************
	// ** CONSTRUCTORS
	// ****************************************************************

	protected State(int value) {
		super(value);
	}
}