package model;
import javafx.scene.paint.Color;
public class Tank extends Entity {
	int life;
	Color color;
	int bulletType = 0;
	int firingDelay;
	int firingDelayCounter;
	
	public Tank (int firingDelay,int firingType,int life, Color color){
		
		if (life<1) this.life = 1;
	}
}
