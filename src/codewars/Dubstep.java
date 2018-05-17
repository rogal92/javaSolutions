package codewars;

public class Dubstep {
	public static void main(String[] args) {
		String str = "WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB";
		String s = songDecoder(str);
		System.out.println(s);
	}
	 public static String songDecoder(String song) {
		 
	     String s = song.replaceAll("WUB", " ");
	     return s.trim().replaceAll("( +)", " ");
	 }
}