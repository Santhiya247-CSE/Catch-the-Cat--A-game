import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.Toolkit;
import java.util.Scanner;
class CatchTheCat extends JFrame
{
	static int score=0;
JLabel lb;
Random r;
 JMenuBar mb=new JMenuBar();
 JMenu helpMenu,aboutMenu;
 JMenuItem versionMI,howtoplayMI,copyrightMI;
 public CatchTheCat(int k)
 {
 // Set frame properties
  helpMenu=new JMenu("Help!");
  aboutMenu=new JMenu("About");
  mb.add(helpMenu);
  mb.add(aboutMenu);
  versionMI=new JMenuItem("Version",'V');
  howtoplayMI=new JMenuItem("HowToPlay?",'H');
  copyrightMI=new JMenuItem("Copyright",'C');
  helpMenu.add(howtoplayMI);
  aboutMenu.add(versionMI);
  aboutMenu.add(copyrightMI);
 setTitle("Catch The Cat");
 setLayout(new FlowLayout());
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setVisible(true);
 setContentPane(new JLabel(new ImageIcon("garden-pictures-for-background-22-home-ideas.jpg")));
 getContentPane().setLayout(new FlowLayout());
 lb=new JLabel(new ImageIcon("cat.png"));
 getContentPane().add(lb);
 add(mb);
 // Create Random object
 r=new Random();
 new Timer(k,new ActionListener(){
  public void actionPerformed(ActionEvent ae)
  {
  lb.setLocation(r.nextInt(getWidth()-75),r.nextInt(getHeight()-75));
  }
 }).start();
 lb.addMouseListener(new MouseAdapter(){
  public void mouseClicked(MouseEvent me)
  {
  Toolkit.getDefaultToolkit().beep();
  System.out.println(" Congrats!...Kitten Caught!!");
  //JOptionPane.showMessageDialog(null," Congrats!...Mouse Caught!! Target Score is 150");
  score++;
   if(score==7)
   {
   JOptionPane.showMessageDialog(null,score*10);
   JOptionPane.showMessageDialog(null,"Target Score reached....You Won the Game Congrats!!!!");
   JOptionPane.showConfirmDialog(null,"Do you want to continue? if so please click yes!");
  System.out.println("Game Over!!Your score is");
  System.out.println(score*10);
  }
    //JOptionPane.showMessageDialog(null,score);
  }
 });
 setExtendedState(MAXIMIZED_BOTH);
 }
 public static void main(String args[])
 {
	   JOptionPane.showMessageDialog(null,"Thanks for downloading this game! with regards,SAN Technologies,v98.7.24");
 	   JOptionPane.showMessageDialog(null,"How to play?:Tap the cat for 7 times to become a winner..All the best!!");
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the speed");
 int k=s.nextInt();
 new CatchTheCat(k);
 }
}
