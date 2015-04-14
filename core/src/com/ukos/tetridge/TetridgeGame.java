package com.ukos.tetridge;

import aurelienribon.tweenengine.Tween;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.ukos.screens.MainMenu;


public class TetridgeGame extends Game {
	
	@Override
	public void create () {
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
		Tween.setCombinedAttributesLimit(5);
		setScreen(new MainMenu());
	}

}
