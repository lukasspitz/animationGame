package animationGame;

import java.awt.Color;

public class SimpleSizedPanel extends SizedPanel{
public void paintComponent (java.awt.Graphics g){
	g.setColor(new Color (176,100,42));   
	g.fillRoundRect(30,50,45,70,80,50); 
	   
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ShowInFrame.show(new SimpleSizedPanel());
	}

}
