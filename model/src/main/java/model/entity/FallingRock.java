package model.entity;

import model.entity.entityBehaviours.Fallable;
import model.entity.entityBehaviours.Pushable;

public class FallingRock extends Entity
{
    
    Fallable fallable;
    Pushable pushable;

    private char sprite = 'f';
    public FallingRock(int x, int y, Entity[][] map)
    {
        super(x, y, map);
        fallable = new Fallable(this);
        pushable = new Pushable(this);
    }

    @Override
    public char getSprite() {
        return sprite;
    }
    
}