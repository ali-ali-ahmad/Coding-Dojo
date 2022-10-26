import java.util.Set;
import java.util.HashMap;


public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put(
            "I'm so lonely", 
            "I have nobody for my own, I'm so lonely, I'm Mr. Lonely, I have nobody for my own, I am so lonely"
        );
        trackList.put(
            "Seether - Driven Under", 
            "Do you think I'm faking, When I'm lying next to you?, Do you think that I am blind?, There's nothing left for me to lose, Must be something on your mind, Something lost and left behind, Do you know I'm faking now?"
        );
        trackList.put(
            "Bushido & Animus - Ronin", 
            "Yeah, Sonny Black ist back und Hunde haben Leinenzwang, Halte diese gottverdammte Szene in nur einer Hand, Sie fragen mich, ob ich mein'n Streit mit diesen Nutten klär', Doch ich mach' aus Beef Gold, so, als ob ich Nusret wär, Du kannst gerne mal probier'n, ob du mich klein kriegst, Fick' dein Junkie-Label und bring' Hip-Hop in die 90s, Frage: Was ist eine Fotze in 'nem Livestream?"
        );
        trackList.put(
            "Blues Saraceno - The Devil You Know", 
            "Pray sinner, Pray sinner, Say a prayer for me ... Pray for me, My blood runs cold, Like the killer you know ... The killer you chose, Ooh . I'm the devil you know, Ooh . The devil you know"
        );
        String songLyrics  = trackList.get("I'm so lonely");
        System.out.println("\n----------------------------------------------------");
        System.out.println(songLyrics);
        System.out.println("\n----------------------------------------------------");

        // get the keys by using the keySet method
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
            System.out.println("\n----------------------------------------------------");
        }
    }
}

