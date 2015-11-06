package com.paranoidkiwi.threed.opengl.constants;

public class DisplayListCompilationMode extends OpenGLConstant {

	public final static DisplayListCompilationMode COMPILE = new DisplayListCompilationMode(4864);
	public final static DisplayListCompilationMode COMPILE_AND_EXECUTE = new DisplayListCompilationMode(4865);

	// ****************************************************************
	// ** CONSTRUCTORS
	// ****************************************************************

	protected DisplayListCompilationMode(int value) {
		super(value);
	}
}
