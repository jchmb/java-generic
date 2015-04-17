package nl.jchmb.generic.similarity;

public class Diversity<T> {
	private Similarity<T> similarity;
	
	public Diversity(Similarity<T> similarity) {
		this.similarity = similarity;
	}
	
	public float getDiversity(Iterable<T> iterable) {
		int count = 0;
		float similarityTotal = 0.0f;
		
		for (T item : iterable) {
			 for (T item2 : iterable) {
				 if (item != item2) {
					 count++;
					 similarityTotal += similarity.measure(item, item2);
				 }
			 }
		}
		
		return similarityTotal / ((float) count);
	}
}
