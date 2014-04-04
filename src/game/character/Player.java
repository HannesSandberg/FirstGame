package game.character;
 
import game.physics.AABoundingRect;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
 
public class Player extends Gubbe {
 
    public Player(float x, float y) throws SlickException{
        super(x,y);
        sprite = new Image("data/img/characters/player/player.png");
        boundingShape = new AABoundingRect(x+3, y, 26, 32);
        
        accelerationSpeed = 0.001f;
        maximumSpeed = 0.15f;
        maximumFallSpeed = 0.3f;
        decelerationSpeed = 0.001f;
    }
 
    public void updateBoundingShape(){
        boundingShape.updatePosition(x+3,y);
    }
    public void moveLeft(int delta){
        x = x - (0.15f*delta);
    }
 
    public void moveRight(int delta){
        x = x + (0.15f*delta);
    }

}
