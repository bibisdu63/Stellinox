package stellinox.ihm.graphique;

public class FenetreMenu {

	FenetreMenu maFenetre = null;
	
	FenetreMenu getInstance(){
		if (maFenetre==null){
			maFenetre = new FenetreMenu();
		}
		return maFenetre;
	}
	
}
