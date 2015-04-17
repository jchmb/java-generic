package nl.jchmb.generic.similarity;

import java.awt.Color;

public class ColorSimilarity implements Similarity<Color> {
	@Override
	public float measure(Color o1, Color o2) {
		int dr = Math.abs(o1.getRed() - o2.getRed());
		int dg = Math.abs(o1.getGreen() - o2.getGreen());
		int db = Math.abs(o1.getBlue() - o2.getBlue());
		float d = (dr + dg + db) / 3;
		return 1.0f - (d / 255.0f);
	}
}
