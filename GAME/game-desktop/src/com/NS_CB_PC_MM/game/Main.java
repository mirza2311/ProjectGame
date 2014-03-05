package com.NS_CB_PC_MM.game;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "game";
		cfg.useGL30 = true;
		cfg.width = 480;
		cfg.height = 320;
		
		new LwjglApplication(new MyGdxGame(), cfg);
	}
}
