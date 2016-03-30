public class Aufgabe2{
	public static void main (String[] args) {
		int summe = 1000;
		boolean gefunden = false;
		for(int u=1; !gefunden;u++) {                        
		for(int v=1; v<u && !gefunden;v++){
				int zahl1= u*u -v*v;
				int zahl2 = 2*u*v;
				int zahl3 = u*u + v*v;
				if( summe % (zahl1+zahl2+zahl3)==0){               			int multipli = 						summe/(zahl1+zahl2+zahl3);
				System.out.println(multipli*zahl1);
				System.out.println(multipli*zahl2);
				System.out.println(multipli*zahl3);
				gefunden=true;
}}}}} 				











/*a+b+c=1000 deshalb c*c=(1000-a-b)*(1000-a-b)*/
	/*a+b+c=1000 und a*a+b*b=c*c deshalb a*a+b*b= 		       		(1000-a-b)*(1000-a-b)*/
        /*public static void main(String[] args){
	int zahl1;
	int zahl2;
	int zahl3;
	for(zahl1=1;zahl1<=998;zahl1++){
		for(zahl2=1;zahl2<=998;zahl2++){
			if((zahl1*zahl1 + zahl2*zahl2) == 					(1000-zahl1-zahl2)*(1000-zahl1-zahl2)){
				zahl3= 1000 - zahl2- zahl1;
				if(zahl1 + zahl2 + zahl3 == 1000){
					System.out.println(zahl1);
					System.out.println(zahl2);
					System.out.println(zahl3);
				}
			}
		}
	}
}
}	*/




