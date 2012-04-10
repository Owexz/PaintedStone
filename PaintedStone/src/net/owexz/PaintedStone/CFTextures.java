package net.owexz.PaintedStone;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class CFTextures {
	private static final String BUNDLE_NAME = "net.owexz.PaintedStone.cftextures"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private CFTextures() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
