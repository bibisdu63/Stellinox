package stellinox.ihm.nonGraphique;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

public class ActionQuitter extends AbstractAction{

    /**
	 * 
	 */
	private static final long serialVersionUID = 4025224040395833383L;
	JFrame maFenetre = null;
	
	public ActionQuitter(JFrame maFenetre) {
		this.maFenetre = maFenetre;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
