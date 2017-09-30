package com.capitalone.launcher;

import com.capitalone.screens.LoginScreen;
import com.capitalone.screens.Screen;

public class Launcher {

	public static void main(String[] args) {
		Screen currentScreen = new LoginScreen();

		while (true) {
			currentScreen = currentScreen.run();
		}

	}
}
