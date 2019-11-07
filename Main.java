public class Main {

private void affiche(String str)
{
	 System.out.println(str)
}

public static void main(String[] args){
 Exercice x = new Exercice();
 n++;
  System.out.println("la valeur de n after calling constructor x step 0 :"+n);
// x.affiche(); comment line from machine 2
 Exercice y = new Exercice();
 n++;
 x.affiche();
 y.affiche();
 System.out.println("la valeur de n after calling constructor y step 1 :"+n);
 }
}