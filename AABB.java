import java.util.Map;
import java.util.HashMap;

class AABB{
  public Map<Coord, Float> box= new HashMap<Coord, Float>();
  public AABB(float x, float y, float wid, float hei){
    box.put(Coord.minX, x);
    box.put(Coord.minY, y);
    box.put(Coord.maxX, x+wid);
    box.put(Coord.maxY, y+hei);
  }
  public boolean intersects(AABB aabb){
    if (this.box.get(Coord.maxX)<aabb.box.get(Coord.minX) ||    this.box.get(Coord.minX)>aabb.box.get(Coord.maxX))      return false;
    if (this.box.get(Coord.maxY)<aabb.box.get(Coord.minY) ||    this.box.get(Coord.minY)>aabb.box.get(Coord.maxY))      return false;
    return true;
  }

  
}