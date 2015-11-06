package com.paranoidkiwi.threed.opengl.constants;

public class PixelType extends OpenGLConstant {

	public final static PixelType GL_BYTE = new PixelType(5120);
	public final static PixelType GL_UNSIGNED_BYTE = new PixelType(5121);
	public final static PixelType GL_SHORT = new PixelType(5122);
	public final static PixelType GL_UNSIGNED_SHORT = new PixelType(5123);
	public final static PixelType GL_INT = new PixelType(5124);
	public final static PixelType GL_UNSIGNED_INT = new PixelType(5125);
	public final static PixelType GL_FLOAT = new PixelType(5126);
	public final static PixelType GL_BITMAP = new PixelType(6656);

	// ****************************************************************
	// ** CONSTRUCTORS
	// ****************************************************************

	protected PixelType(int value) {
		super(value);
	}
}
