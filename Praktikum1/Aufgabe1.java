public class Aufgabe1{
	
	public static void main(String[] args) {
	int distanz;
	int zielpos = Integer.parseInt(args[0]);
	int startpos = Integer.parseInt(args[1]);	
	int laengez= zielpos/10;
	int laenges= startpos/10;
	int hoehez= zielpos%10;
	int hoehes= startpos%10;
	distanz= Math.abs(laengez - laenges) + (hoehez - hoehes);
	System.out.println("Die Manhatten Distanz beträgt:" +distanz);
}
}
