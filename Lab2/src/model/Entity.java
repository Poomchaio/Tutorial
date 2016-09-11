package model;

public abstract class Entity {
	public static final int WEST=0,NORTH=1,EAST=2,SOUTH=3;
	protected int x,y,direction;
	protected boolean isDestroyed;
	protected int nextX,nextY,nextDirection;
	protected boolean isDestroyedInNextState;
	int movingDelay;
	int movingDelayCounter;
	protected Field field;
	public Entity(Field field,int x,int y, int direction,int movingDelay){
		field.addEntity();
		if(x>5 || y>5) {
			x=0;
			y=0;
		}
		if (direction > 3 ) direction = 2;
		calculateNextState();
	}
	protected abstract void update();
	protected abstract void calculateNextState();
	public boolean move(){
		if(isDestroyed) return false;
		else {
			calculateNextState();
			return true;
		}
	}
	public boolean isSamePosition(Entity other){
		if(this.x == other.x && this.y == other.y) return true;
		return false;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	public boolean isDestroyed() {
		return isDestroyed;
	}
	public void setDestroyed(boolean isDestroyed) {
		this.isDestroyed = isDestroyed;
	}
	public int getNextX() {
		return nextX;
	}
	public void setNextX(int nextX) {
		this.nextX = nextX;
	}
	public int getNextY() {
		return nextY;
	}
	public void setNextY(int nextY) {
		this.nextY = nextY;
	}
	public int getNextDirection() {
		return nextDirection;
	}
	public void setNextDirection(int nextDirection) {
		this.nextDirection = nextDirection;
	}
}
