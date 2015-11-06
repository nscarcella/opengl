package com.paranoidkiwi.threed.opengl.constants;

public class PixelFormat extends OpenGLConstant {

	public final static PixelFormat GL_COLOR_INDEX = new PixelFormat(6400);
	public final static PixelFormat GL_RED = new PixelFormat(6403);
	public final static PixelFormat GL_GREEN = new PixelFormat(6404);
	public final static PixelFormat GL_BLUE = new PixelFormat(6405);
	public final static PixelFormat GL_ALPHA = new PixelFormat(6406);
	public final static PixelFormat GL_RGB = new PixelFormat(6407);
	public final static PixelFormat GL_RGBA = new PixelFormat(6408);
	public final static PixelFormat GL_LUMINANCE = new PixelFormat(6409);
	public final static PixelFormat GL_LUMINANCE_ALPHA = new PixelFormat(6410);

	// ****************************************************************
	// ** CONSTRUCTORS
	// ****************************************************************

	protected PixelFormat(int value) {
		super(value);
	}
}
