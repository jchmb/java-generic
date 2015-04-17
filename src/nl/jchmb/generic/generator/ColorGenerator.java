package nl.jchmb.generic.generator;

import java.awt.Color;
import java.util.Random;

public class ColorGenerator implements Generator<Color> {
	private Random random;
	
	public ColorGenerator() {
		random = new Random();
	}
	
	@Override
	public Color generate() {
		return new Color(
				random.nextInt(256),
				random.nextInt(256),
				random.nextInt(256)
		);
	}
}
