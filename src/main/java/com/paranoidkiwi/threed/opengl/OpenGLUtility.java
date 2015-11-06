package com.paranoidkiwi.threed.opengl;

public interface OpenGLUtility {

	void perspective(float f, float g, float h, float i);

	void lookAt(float cameraX, float cameraY, float cameraZ, float targetX, float targetY, float targetZ, float upX, float upY, float upZ);
}
