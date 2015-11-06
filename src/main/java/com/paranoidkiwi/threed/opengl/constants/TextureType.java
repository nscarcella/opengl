package com.paranoidkiwi.threed.opengl.constants;

public class TextureType extends State {

	public final static TextureType TEXTURE_1D = new TextureType(3552);
	public final static TextureType TEXTURE_2D = new TextureType(3553);
	public final static TextureType TEXTURE_3D = new TextureType(32879);
	public final static TextureType TEXTURE_CUBE_MAP = new TextureType(34067);

	// ****************************************************************
	// ** CONSTRUCTORS
	// ****************************************************************

	protected TextureType(int value) {
		super(value);
	}
}
