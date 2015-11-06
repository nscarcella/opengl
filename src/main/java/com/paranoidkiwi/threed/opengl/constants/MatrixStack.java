package com.paranoidkiwi.threed.opengl.constants;

public class MatrixStack extends OpenGLConstant {

	public final static MatrixStack MODEL_VIEW = new MatrixStack(5888);
	public final static MatrixStack PROJECTION = new MatrixStack(5889);
	public final static MatrixStack TEXTURE = new MatrixStack(5890);

	// ****************************************************************
	// ** CONSTRUCTORS
	// ****************************************************************

	protected MatrixStack(int value) {
		super(value);
	}
}
