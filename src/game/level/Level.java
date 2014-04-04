package game.level;
 
import game.character.Gubbe;

import java.util.ArrayList;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;
 
public class Level {
 
    private TiledMap map;
    private ArrayList<Gubbe> gubbar;
    
    public Level(String level) throws SlickException{
        map = new TiledMap("data/levels/" + level + ".tmx","data/img");
        gubbar = new ArrayList<Gubbe>();
    }
    
    public void addCharacter(Gubbe g){
        gubbar.add(g);
    }
    
    public void render(){
        map.render(0, 0, 0, 0, 32, 18);
        
        for(Gubbe g : gubbar){
            g.render();
        }

    }
 
}
