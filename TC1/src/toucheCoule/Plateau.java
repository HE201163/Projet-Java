package toucheCoule;





import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * Cr�ation d'un plateau
 * Un plateau de jeu est compos� de deux grilles, et de deux rangements, chaque joueur poss�de un de chaque.
 *
 */


public class Plateau {
	Case[][] grille1;		//plateau de jeu du joueur 1
	Case[][] grille2;		// idem joueur 2

	
	


	
/*
 * Construction du plateau

 * La grille poss�de 49 cases (7,7);
 */
	public Plateau(){

		int axeX,axeY;
		int NB_CASE_X=7;  											//on d�finit la taille du rangement 
		int NB_CASE_Y=7;
		


		
		this.grille1=new Case[NB_CASE_X][NB_CASE_Y];				// idem pour la grille que pour le rangement
			
		for (axeX=0;axeX<=NB_CASE_X-1;axeX++){
			
			for (axeY=0;axeY<=NB_CASE_Y-1;axeY++){
				
				this.grille1[axeX][axeY] = new Case();
				//this.grille1[axeX][axeY].coordoneeX=(char)(65 + (axeX/26)*6 + axeX);
				this.grille1[axeX][axeY].Y=axeY+1;
				this.grille1[axeX][axeY].X=axeX+1;
				//System.out.println("axeX " + this.rangement1[axeX][axeY].coordoneeX + " axeY " + this.rangement1[axeX][axeY].coordoneeY);
			}
		}
		
		this.grille2=new Case[NB_CASE_X][NB_CASE_Y];
		
		for (axeX=0;axeX<=NB_CASE_X-1;axeX++){
			
			for (axeY=0;axeY<=NB_CASE_Y-1;axeY++){
				
				this.grille2[axeX][axeY] = new Case();
				//this.grille2[axeX][axeY].coordoneeX=(char)(65 + (axeX/26)*6 + axeX);
				this.grille2[axeX][axeY].Y=axeY+1;
				this.grille2[axeX][axeY].X=axeX+1;
				//System.out.println("axeX " + this.rangement1[axeX][axeY].coordoneeX + " axeY " + this.rangement1[axeX][axeY].coordoneeY);
			}
		}
		
		
	}
	
	public static void main(String[] args){
		//Plateau plateauTC = new Plateau();
		//System.out.print(plateauTC.grille2[0][0].coordoneeX);
		//System.out.println(plateauTC.grille2[0][0].coordoneeY);
		
	
		
		
	}
}
