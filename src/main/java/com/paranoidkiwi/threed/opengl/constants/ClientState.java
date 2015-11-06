package com.paranoidkiwi.threed.opengl.constants;

public class ClientState extends OpenGLConstant {

	public final static ClientState VERTEX_ARRAY = new ClientState(32884);
	public final static ClientState NORMAL_ARRAY = new ClientState(32885);
	public final static ClientState COLOR_ARRAY = new ClientState(32886);

	// ****************************************************************
	// ** CONSTRUCTORS
	// ****************************************************************

	protected ClientState(int value) {
		super(value);
	}
}