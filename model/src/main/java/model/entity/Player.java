package model.entity;

import model.entity.entityBehaviours.EnnemyDestructable;
import model.entity.entityBehaviours.FallableDestrutable;
import model.entity.entityBehaviours.IDestructable;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Player extends Entity {

    private static Player ourInstance = new Player();
    IDestructable destructableP;
    IDestructable destructableE;
    private char sprite = 'p';

    private Player() {
        super();
        destructableP = new FallableDestrutable();
        destructableE = new EnnemyDestructable();
    }

    public static Player getInstance() {
        return ourInstance;
    }

    public static Player getInstance(int x, int y, Entity[][] map) {
        ourInstance.x = x;
        ourInstance.y = y;
        ourInstance.map = map;
        return ourInstance;
    }


    @Override
    public void loadImage() {
        try {
            this.image = ImageIO.read(new File("C:\\Users\\theow\\Projet\\Code\\Projet-Java-et-UML\\model\\src\\main\\resources\\sprites\\player.png"));
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    /*
        Move the player Up by incrementing y
         */
    public void moveUp() {
        map[x][y] = new Empty(x, y, map);
        ourInstance.y--;
        map[x][y] = this;
    }

    /*
    Move the player Down by decrementing y
     */
    public void moveDown() {
        map[x][y] = new Empty(x, y, map);
        ourInstance.y++;
        map[x][y] = this;
    }

    /*
    Move the player Left by incrementing x
     */
    public void moveLeft() {
        map[x][y] = new Empty(x, y, map);
        ourInstance.x--;
        map[x][y] = this;
    }

    /*
        Move the player Right by decrementing x
    */
    public void moveRight() {
        map[x][y] = new Empty(x, y, map);
        ourInstance.x++;
        map[x][y] = this;
    }

    @Override
    public char getSprite() {
        return sprite;
    }
}

