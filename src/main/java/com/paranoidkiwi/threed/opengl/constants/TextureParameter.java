package com.paranoidkiwi.threed.opengl.constants;

public class TextureParameter extends OpenGLConstant {

	public final static TextureParameter TEXTURE_MAG_FILTER = new TextureParameter(10240);
	public final static TextureParameter TEXTURE_MIN_FILTER = new TextureParameter(10241);
	public final static TextureParameter TEXTURE_WRAP_S = new TextureParameter(10242);
	public final static TextureParameter TEXTURE_WRAP_T = new TextureParameter(10243);
	public final static TextureParameter TEXTURE_WRAP_R = new TextureParameter(32882);
	public final static TextureParameter TEXTURE_PRIORITY = new TextureParameter(32870);
	public final static TextureParameter GENERATE_MIPMAP = new TextureParameter(33169);
	public final static TextureParameter TEXTURE_MIN_LOD = new TextureParameter(33082);
	public final static TextureParameter TEXTURE_MAX_LOD = new TextureParameter(33083);
	public final static TextureParameter TEXTURE_BASE_LEVEL = new TextureParameter(33084);
	public final static TextureParameter TEXTURE_MAX_LEVEL = new TextureParameter(33085);
	public final static TextureParameter DEPTH_TEXTURE_MODE = new TextureParameter(34891);
	public final static TextureParameter TEXTURE_COMPARE_MODE = new TextureParameter(34892);
	public final static TextureParameter TEXTURE_COMPARE_FUNC = new TextureParameter(34893);
	public final static TextureParameter TEXTURE_BORDER_COLOR = new TextureParameter(4100);

	// ****************************************************************
	// ** CONSTRUCTORS
	// ****************************************************************

	protected TextureParameter(int value) {
		super(value);
	}
}
