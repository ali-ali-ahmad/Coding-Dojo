package AppOne;

import java.util.ArrayList;
import java.util.Collections;


public class Museum {

	public static void main(String[] args) {
		
		ArrayList<Art> museum = new ArrayList<Art> ();
		museum.add(new Painting("The Boating Party", "Mary Cassatt", "woman, man, and child on small sailboat", "oil on canvas"));
		museum.add(new Painting("Red Canna", "Georgia O'Keefe", "red flowers in a vase", "watercolor on paper"));
		museum.add(new Painting("Der Kuss", "Gustav Klimpt", "a couple embrace", "oil and gold leaf on canvas"));
		museum.add(new Sculpture("Winged Victory of Samothrace", "unknown", "depicts the goddess Nike", "marble"));
		museum.add(new Sculpture("David", "Michelangelo", "depicts biblical figure David", "marble"));
		
		Collections.shuffle(museum);
		
		for(Art artwork : museum) {
			artwork.viewArt();
		}
		
	}
	
}
//package AppOne;
//
//import java.util.ArrayList;
//
//public class Museum {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayList<String> museum = new ArrayList<String>();
//		
//		Painting newPaintTybe1 = new Painting("Modren");
//		Painting newPaintTybe2 = new Painting("Old Fasion");
//		Painting newPaintTybe3 = new Painting("Normal");
//		
//		String thisPaintingTybe1  = newPaintTybe1.getPaintType();
//		String thisPaintingTybe2  = newPaintTybe2.getPaintType();
//		String thisPaintingTybe3  = newPaintTybe3.getPaintType();
//
//		museum.add(thisPaintingTybe1);
//		museum.add(thisPaintingTybe2);
//		museum.add(thisPaintingTybe3);
//		
////		for (int i = 0; i<museum.size(); i++) {
////			System.out.println(museum.get(i));
////		}
//		
//		Sculpture newPaintMaterial1 = new Sculpture("Metal");
//		Sculpture newPaintMaterial2 = new Sculpture("Wood");
//
//		
//		String thisPaintingMaterial1  = newPaintMaterial1.getMaterial();
//		String thisPaintingMaterial2  = newPaintMaterial2.getMaterial();
//
//
//		museum.add(thisPaintingMaterial1);
//		museum.add(thisPaintingMaterial2);
//		
//		for (int i = 0; i<museum.size(); i++) {
//			System.out.println(museum.get(i));
//		}
//
//
//	}
//
//}
