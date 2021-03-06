import java.util.Arrays;
import java.util.stream.*;
public class AsciiPlotter {
	public static final int WIDTH = 48;
	public static final int HEIGHT = 48;
	private final char[][] grid = new char[HEIGHT][WIDTH];
	public AsciiPlotter(){
		Stream.of(grid).forEach(line -> Arrays.fill(line, '.'));
	}
	public void set (int x, int y){
		if (x<0)
			return;
		if (y<0)
			return;
		if (x>= WIDTH)	
			return;
		if (y>= HEIGHT)
			return;
		
		grid[HEIGHT - y -1][x] = 'X';
	}
	@Override
	public String toString(){
	return Stream.of(grid)
	.map(String::new)
	.collect(Collectors.joining("\n"));
}
	public static void main(String[] args){
		final AsciiPlotter asciiPlotter = new AsciiPlotter();
		asciiPlotter.elementatrer(0,0,10,3);
		asciiPlotter.set (x, y);  /**/
		/*this.set();*/
		
		System.out.println(asciiPlotter);
	}
	public void elementatrer(int Startx, int Starty, int Endex, int Endey){
		double Streckex = Endex - Startx;
		double Streckey = Endey - Starty;
		double Steigung = Streckey / Streckex;
		int Ywert = Starty;
		double Abweichung = 0.0;
		for(int Xwert = Startx; Xwert <= Endex; Xwert++){
			Abweichung = Abweichung + Steigung;
			if(Abweichung>0.5){
				Ywert = Ywert + 1;
				Abweichung = Abweichung -1;
			}
		}
}}
