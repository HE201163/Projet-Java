package toucheCoule;

import toucheCoule.Plateau;
import toucheCoule.Bateau;


public class Run {
	Plateau plateauTC = new Plateau();
	
	
	/*
	 * Le joueur choisi s'il veut commencer une partie ou quitter le jeu
	 */ 
	
	public Run(){
		boolean lancerJeu=true;
		if (lancerJeu==false){
			//quitte le jeu
		}
		else lancement();

	}
		
	
	
	public Bateau constructionBateaux(){
		Bateau b = new Bateau();							// on construit les bateaux du joueur 1
		//System.out.println(b1.TBateau[0].longueur);

		return b;
	}
	
	public void constructionGrille(){
		Plateau grille = new Plateau();
	}
	
	/*
	 * méthode qui permet de donner la position des cases du bateau qui se trouvent entre les extrémités du bateau
	 */
	
	public void placerIntracase(Bateau bateau,int debutBateau, int finBateau){							
		int i;
		if(bateau.coordonnees[debutBateau].X==bateau.coordonnees[finBateau].X){							// si le bateau est positionné dans l'axe des X
			for(i=1;i<=bateau.longueur-2;i++){															// toutes les cases auront le même X
				System.out.println(i);
				//System.out.println(bateau.coordonnees[i-1].Y);
				//bateau.coordonnees[i].X=bateau.coordonnees[i-1].X;										// donc on donne la coo X identique pour toutes les cases
				bateau.coordonnees[i].Y=bateau.coordonnees[i-1].Y+1;									// et on donne la coo Y qui augmente d'une case par rapport à la précédente

			}
			
		}
		else{																							// sinon le bateau est placé sur l'axe des Y
			for(i=1;i<=bateau.longueur-2;i++){															// toutes les cases auront le même Y
				//bateau.coordonnees[i].Y=bateau.coordonnees[i-1].Y;										// donc on donne la coo Y identique pour toutes les cases
				//bateau.coordonnees[i].X=bateau.coordonnees[i-1].X+1;									// et on donne la coo X qui augmente d'une case par rapport à la précédente
			}
		}
	}
	
	/*
	 * méthode qui permet de positionner les bateaux du joueur 
	 * on a besoin de connaître sa position de début et de fin pour savoir placer un bateau correctement
	 */
	
	public void placerBateaux(Bateau bateaux){
		int i=0;
		Case position;
		position = new Case();
		position.X=1;
		position.Y=3;
		int debutBateau=0;
		int finBateau=0;
		bateaux.TBateau[i].coordonnees[debutBateau]=position;								// on met la position du premier bateau;
		for(i=1;i<=bateaux.getNB_BATEAU();i++){												// on met la position des autres
			finBateau=bateaux.TBateau[i].longueur-1;										// on donne la taille du bateau pour connaitre la fin du bateau
			bateaux.TBateau[i].coordonnees[debutBateau]=position;							// la première case du bateau
			bateaux.TBateau[i].coordonnees[finBateau]=position;								// la dernière case du bateau
			if(bateaux.TBateau[i].longueur>2){												// si le bateau à plus de deux cases
				
				placerIntracase(bateaux.TBateau[i],debutBateau, finBateau);					// on positione les cases entre le début et la fin
			}	
			
		}
	}
	
	/*
	 * méthode de lancement du jeu
	 * 
	 */
	
	public void lancement(){
		initialisation();
	}
	
	
	/*
	 * Méthode ou on initialise une partie
	 */
	
	public void initialisation(){
		Bateau bateauxJ1, bateauxJ2;					// une variable de bateau pour chaque joueur
		bateauxJ1=constructionBateaux();				// on construit les bateaux du premier joueur
		bateauxJ2=constructionBateaux();				// idem joueur 2
		constructionGrille();							// on construit la grille
		placerBateaux(bateauxJ1);						// on place les bateaux du premier joueur
		//placerBateaux(bateauxJ2);						// idem joueur 2
	}
	
	
	
	
	public static void main(String[] args){
		Run r = new Run();
	}
}
