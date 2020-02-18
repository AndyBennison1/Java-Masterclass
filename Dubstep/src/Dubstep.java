public class Dubstep {
    public static String SongDecoder (String song)
    {
        // Your code is here...
    String song1 = song.replaceAll("WUB"," ").replaceAll("  ", " ");

    return song1.strip();

    }
}
