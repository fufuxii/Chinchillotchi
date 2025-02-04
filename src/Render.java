import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Render extends JFrame {

  public Render() {

  }

  public void window() {
    setTitle("Chinchillotchi");
    setSize(515, 535);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);
    setLayout(null);

    ImageIcon chinchillaBase = new ImageIcon("images/chinchilla.png");
    ImageIcon buttonPet = new ImageIcon("images/acariciar.png");
    ImageIcon buttonEat = new ImageIcon("images/comer.png");
    ImageIcon buttonPlay = new ImageIcon("images/jugar.png");
    ImageIcon background = new ImageIcon("images/fondo.png");

    JLabel labelChinchillaBase = new JLabel(chinchillaBase);
    labelChinchillaBase.setBounds(0, 0, chinchillaBase.getIconWidth(), chinchillaBase.getIconHeight());
    JLabel labelButtonPet = new JLabel(buttonPet);
    labelButtonPet.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
    JLabel labelButtonEat = new JLabel(buttonEat);
    labelButtonEat.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
    JLabel labelButtonPlay = new JLabel(buttonPlay);
    labelButtonPlay.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
    JLabel labelBackground = new JLabel(background);
    labelBackground.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());

    add(labelChinchillaBase);
    add(labelButtonPet);
    add(labelButtonEat);
    add(labelButtonPlay);
    add(labelBackground);

    setVisible(true);
  }
}