package stellinox.ihm.graphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import stellinox.ihm.nonGraphique.ActionQuitter;



public class FenetreConnexion extends JFrame {

	   private JTextField adresseIP;
	   private JLabel messadresse;
	   private JTextField port;
	   private JLabel messport;
	   private JTextField pseudo;
	   private JLabel messpseudo;
	   private JPasswordField pass;
	   private JLabel messpass;
	   private JButton valider;
	   private JButton retour;
	   private static final long serialVersionUID = -7843466605812479973L;

	   /**
	    * constructeur de la fênetre de connexionw
	    */
	   public FenetreConnexion()
	   {
		 this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	     JPanel connex = new JPanel(new GridLayout(6, 1));
	     getContentPane().add(connex, "West");
	     Font police = new Font("Arial", 1, 14);
	     setTitle("Stellinox - Connexion");
	     setResizable(false);
	     //setIconImage(new ImageIcon(getClass().getResource("essai.png")).getImage());
	     JPanel Titre = connectionTitle();
	     connex.add(Titre);
	 
	     JPanel addresse = connectionAdress(police);
	     connex.add(addresse);
	 
	     JPanel por = connectionPort(police);
	     connex.add(por);

	     JPanel pseud = connectionPseudo(police);
	     connex.add(pseud);
	 
	     JPanel mdp = connectionPassword(police);
	     connex.add(mdp);

	     JPanel bouton = connectionButton();
	     connex.add(bouton);
	     this.valider.setDefaultCapable(true);
	     getRootPane().setDefaultButton(this.valider);
	 
	     this.adresseIP.setText("localhost");
	     this.port.setText("5432");
	     setDefaultCloseOperation(3);
	     pack();
	     setLocationRelativeTo(null);
	   }

	   /**
	    * fonction permettant de construire le panel de bouton
	    * @return le panel remplit des 2 boutons
	    */
	private JPanel connectionButton() {
		JPanel bouton = new JPanel(new GridLayout(1, 2));
		 JPanel ssval = new JPanel(new FlowLayout());
	     JPanel ssret = new JPanel(new FlowLayout());
	     this.valider = new JButton("valider");
	     this.retour = new JButton(new ActionQuitter(this));
	     this.retour.setText("Quitter");
	     ssval.add(this.valider);
	     ssret.add(this.retour);
	     this.valider.setPreferredSize(new Dimension(150, 30));
	     this.retour.setPreferredSize(new Dimension(150, 30));
	     bouton.add(ssval);
	     bouton.add(ssret);
		return bouton;
	}

	/**
	 * fonction permmettant de construire le panel contenant le titre de la fenetre
	 * @return panel contenant le titre
	 */
	private JPanel connectionTitle() {
		JPanel Titre = new JPanel(new GridLayout(1, 1));
	     JLabel titre = new JLabel("Connexion");
	     Font policeTitre = new Font("Arial", 1, 18);
	     titre.setFont(policeTitre);
	     titre.setHorizontalAlignment(0);
	     Titre.add(titre);
		return Titre;
	}

	/**
	 * fonction permettant de construire le panel du mot de passe
	 * @param police police du panel
	 * @return panel contenant la getion du mot de passe
	 */
	private JPanel connectionPassword(Font police) {
		JPanel mdp = new JPanel(new BorderLayout());
	     JPanel ssmdp = new JPanel(new FlowLayout());
	     this.pass = new JPasswordField();
	     this.pass.setPreferredSize(new Dimension(30, 30));
	     ssmdp.add(this.pass);
	     this.messpass = new JLabel("mot de passe :      ");
	     this.pass.setFont(police);
	     this.pass.setPreferredSize(new Dimension(150, 30));
	     this.pass.setForeground(Color.BLUE);
	     mdp.add(this.messpass, "West");
	     mdp.add(ssmdp, "East");
		return mdp;
	}

	/**
	 * fonction permettant de construire le panel du nom d'utilisateur
	 * @param police police du panel
	 * @return panel contenant la gestion du nom d'utilisateur
	 */
	private JPanel connectionPseudo(Font police) {
		JPanel pseud = new JPanel(new BorderLayout());
	     JPanel sspseudo = new JPanel(new FlowLayout());
	     this.pseudo = new JTextField();
	     this.pseudo.setPreferredSize(new Dimension(30, 30));
	     sspseudo.add(this.pseudo);
	     this.messpseudo = new JLabel("pseudo :      ");
	 
	     this.pseudo.setFont(police);
	     this.pseudo.setPreferredSize(new Dimension(150, 30));
	     this.pseudo.setForeground(Color.BLUE);
	     pseud.add(this.messpseudo, "West");
	     pseud.add(sspseudo, "East");
		return pseud;
	}

	/**
	 * fonction permettant de construire le panel du port
	 * @param police police du panel
	 * @return panel contenant la gestion du nom d'utilisateur
	 */
	private JPanel connectionPort(Font police) {
		JPanel por = new JPanel(new BorderLayout());
	     JPanel ssport = new JPanel(new FlowLayout());
	     this.port = new JTextField();
	     this.port.setPreferredSize(new Dimension(30, 30));
	     ssport.add(this.port);
	     this.messport = new JLabel("port de connexion :      ");
	 
	     this.port.setFont(police);
	     this.port.setPreferredSize(new Dimension(150, 30));
	     this.port.setForeground(Color.BLUE);
	     por.add(this.messport, "West");
	     por.add(ssport, "East");
		return por;
	}

	/**
	 * fonction permettant de construire le panel de l'adresse de la base de donnée
	 * @param police police du panel
	 * @return contenant la gestion du nom d'utilisateur
	 */
	private JPanel connectionAdress(Font police) {
		JPanel addresse = new JPanel(new BorderLayout());
	     JPanel ssadress = new JPanel(new FlowLayout());
	     this.adresseIP = new JTextField();
	     this.adresseIP.setPreferredSize(new Dimension(30, 30));
	     ssadress.add(this.adresseIP);
	     this.messadresse = new JLabel("adresse de connexion :      ");
	 
	     
	     this.adresseIP.setFont(police);
	     this.adresseIP.setPreferredSize(new Dimension(150, 30));
	     this.adresseIP.setForeground(Color.BLUE);
	     addresse.add(this.messadresse, "West");
	     addresse.add(ssadress, "East");
		return addresse;
	}
	
}
