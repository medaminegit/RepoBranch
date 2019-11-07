public class Exercice
 {
 static private String msg = null;
 static private int n;

 Exercice(){
 n = 1;
 if (msg == null)
 msg = "Rouge";
 affiche();
 }

 private void affiche(){
 System.out.println(n + msg);
 if (!msg.equals("Vert")){
 msg = "Vert";
 new Exercice();
 }
 }

 
}
