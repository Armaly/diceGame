import java.util.*;
import java.awt.*;
import javax.swing.*;
//Armaly Albert
//3/29/14
public class DiceGame  extends JFrame
{
  public DiceGame()
  {
    //Frame Name
    super("Dice Game");
    //Frame Size
    setBounds(0,0,400,400);
    //Panel Creation
    JPanel dicePanel = new JPanel();
    //makes visible
    dicePanel.setVisible(true);
    //randomly accquires numbers
    int dice1 = (int)(Math.random()*6)+1;
    int dice2= (int) (Math.random()*6)+1;
    int sum = dice1+dice2;
    JLabel die1;
    JLabel die2;
    JLabel answer;
    
    setBackground(Color.GRAY);//sets color
    answer = new JLabel("                                                     You rolled a "+sum);
    //makes answer visible
    answer.setVisible(true);
    //assigns proper number icon to label
    if(dice1==1)
    {
      die1 = new JLabel(new ImageIcon("die1.png"));
      dicePanel.add(die1);
    }
    if(dice1==2)
    {
      die1 = new JLabel(new ImageIcon("die2.png"));
      dicePanel.add(die1);
    }
    if(dice1==3)
    {
      die1 = new JLabel(new ImageIcon("die3.png"));
      dicePanel.add(die1);
    }
    if(dice1==4)
    {
      die1 = new JLabel(new ImageIcon("die4.png"));
      dicePanel.add(die1);
    }
    if(dice1==5)
    {
      die1 = new JLabel(new ImageIcon("die5.png"));
      dicePanel.add(die1);
    }
    if(dice1==6)
    {
      die1 = new JLabel(new ImageIcon("die6.png"));
      dicePanel.add(die1);
    }
    if(dice2==1)
    {
      die2 = new JLabel(new ImageIcon("die1.png"));
      dicePanel.add(die2);
    }
    if(dice2==2)
    {
      die2 = new JLabel(new ImageIcon("die2.png"));
      dicePanel.add(die2);
    }
    if(dice2==3)
    {
      die2 = new JLabel(new ImageIcon("die3.png"));
      dicePanel.add(die2);
    }
    if(dice2==4)
    {
      die2 = new JLabel(new ImageIcon("die4.png"));
      dicePanel.add(die2);
    }
    if(dice2==5)
    {
      die2 = new JLabel(new ImageIcon("die5.png"));
      dicePanel.add(die2);
    }
    if(dice2==6)
    {
      die2 = new JLabel(new ImageIcon("die6.png"));
      dicePanel.add(die2);
    }
    add(dicePanel);
    add(answer,BorderLayout.SOUTH);
  }
  public static void main (String[] args)
  {
  DiceGame game = new DiceGame();
  game.setSize(400,400);
  game.setResizable(true);
  game.setVisible(true);
  game.setTitle("Dice Game");
  game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  //makes default dice game
  }
}