package com.paranoidkiwi.threed.opengl;

import java.awt.Color;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import com.paranoidkiwi.threed.opengl.constants.Buffer;
import com.paranoidkiwi.threed.opengl.constants.ClientState;
import com.paranoidkiwi.threed.opengl.constants.ClipPlane;
import com.paranoidkiwi.threed.opengl.constants.DisplayListCompilationMode;
import com.paranoidkiwi.threed.opengl.constants.Light;
import com.paranoidkiwi.threed.opengl.constants.LightProperty;
import com.paranoidkiwi.threed.opengl.constants.MaterialProperty;
import com.paranoidkiwi.threed.opengl.constants.MatrixStack;
import com.paranoidkiwi.threed.opengl.constants.PixelFormat;
import com.paranoidkiwi.threed.opengl.constants.PixelType;
import com.paranoidkiwi.threed.opengl.constants.PolygonFace;
import com.paranoidkiwi.threed.opengl.constants.PolygonMode;
import com.paranoidkiwi.threed.opengl.constants.PrimitiveMode;
import com.paranoidkiwi.threed.opengl.constants.State;
import com.paranoidkiwi.threed.opengl.constants.TargetTexture;
import com.paranoidkiwi.threed.opengl.constants.TextureParameter;
import com.paranoidkiwi.threed.opengl.constants.TextureType;

public interface OpenGL {

	// ****************************************************************
	// ** STATE
	// ****************************************************************

	public abstract void enable(State state);

	public abstract void disable(State state);

	public abstract void enableClientState(ClientState clienteState);

	public abstract void disableClientState(ClientState state);

	// ****************************************************************
	// ** CLEAR
	// ****************************************************************

	// TODO: Clase Color de la interfaz
	public abstract void clearColor(Color color);

	public abstract void clear(Buffer... buffers);

	// ****************************************************************
	// ** DRAW
	// ****************************************************************

	public abstract void begin(PrimitiveMode mode);

	public abstract void end();

	// TODO: un tipo más copado que short?
	public abstract void lineStipple(int factor, short pattern);

	// TODO: recibir algo más capo que un byteBuffer? Tal vez una clase de la Api... O poner funciones auxiliares
	public abstract void polygonStipple(ByteBuffer mask);

	// TODO: recibir un color?
	public abstract void color(float red, float green, float blue);

	public abstract void color(float red, float green, float blue, float alpha);

	public abstract void normal(float x, float y, float z);

	public abstract void vertex(float x, float y, float z);

	public abstract void drawArrays(PrimitiveMode mode, int first, int primitiveCount);

	public abstract void polygonMode(PolygonFace face, PolygonMode mode);

	public abstract void cullFace(PolygonFace face);

	public abstract void flush();

	public abstract void viewport(int x, int y, int width, int height);

	public abstract void clipPlane(ClipPlane plane, DoubleBuffer equation);

	// ****************************************************************
	// ** TEXTURES
	// ****************************************************************

	// TODO: Feo el components to use, hay que extraerlo a una constante o usar una abstracción mejor?
	// Si se extrae, la extracción tiene que indicar cuantos bytes se usan y PARA QUE.
	// TODO: hace falta el type? No puedo solo usar sobrecarga?
	public abstract void texImage2D(TargetTexture target, int mipmapReductionLevel, int componentsToUse, int width, int height, int border, PixelFormat format, PixelType type, FloatBuffer image);

	public abstract void texParameter(TextureType target, TextureParameter parameter, float value);

	public abstract void texParameter(TextureType target, TextureParameter parameter, FloatBuffer value);

	public abstract void texCoord(float s);

	public abstract void texCoord(float s, float t);

	public abstract void texCoord(float s, float t, float r);

	public abstract void texCoord(float s, float t, float r, float q);

	// ****************************************************************
	// ** LIGHT
	// ****************************************************************

	// TODO: Vale la pena poner todas las sobrecargas?
	// Las dos que no son buffers funcionan solo con Shininess...
	// Y, hacen falta las de int? O es mejor dejar que el autocast haga su magia?

	public abstract void light(Light light, LightProperty property, float value);

	public abstract void light(Light light, LightProperty property, int value);

	public abstract void light(Light light, LightProperty property, FloatBuffer values);

	public abstract void light(Light light, LightProperty property, IntBuffer values);

	public abstract void material(PolygonFace face, MaterialProperty property, float value);

	public abstract void material(PolygonFace face, MaterialProperty property, int value);

	public abstract void material(PolygonFace face, MaterialProperty property, FloatBuffer values);

	public abstract void material(PolygonFace face, MaterialProperty property, IntBuffer values);

	// ****************************************************************
	// ** MATRIX
	// ****************************************************************

	public abstract void matrixMode(MatrixStack stack);

	// TODO: algo más capo que un buffer?
	public abstract void loadMatrix(FloatBuffer matrix);

	public abstract void loadIdentity();

	public abstract void pushMatrix();

	public abstract void popMatrix();

	public abstract void translate(float x, float y, float z);

	public abstract void translate(double x, double y, double z);

	public abstract void scale(float x, float y, float z);

	public abstract void scale(double x, double y, double z);

	public abstract void rotate(float angle, float x, float y, float z);

	public abstract void multMatrix(FloatBuffer matrix);

	// ****************************************************************
	// ** POINTERS
	// ****************************************************************

	public abstract void vertexPointer(int groupSize, int stride, FloatBuffer vertexes);

	public abstract void normalPointer(int stride, FloatBuffer pointer);

	// ****************************************************************
	// ** DISPLAY LISTS
	// ****************************************************************

	public abstract int genLists(int count);

	public abstract boolean isList(int index);

	public abstract void newList(int index, DisplayListCompilationMode mode);

	public abstract void endList();

	public abstract void deleteLists(int index, int count);

	public abstract void callList(int index);

}