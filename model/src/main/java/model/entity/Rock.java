package model.entity;

public class Rock extends Entity
{
    
    IDestructable destructable;
    private char sprite = 'r';

    public Rock(int x, int y, Entity[][] map)
    {
        super(x, y, map);
        destructable = new PlayerDestructable();
    }

    @Override
    public char getSprite() {
        return sprite;
    }
    
}
