public class LightBoard
{
  /** The lights on the board, where true represents on and false represents off.
   */
  private boolean[][] lights;

  /** Constructs a LightBoard object having numRows rows and numCols columns.
   * Precondition: numRows > 0, numCols > 0
   * Postcondition: each light has a 40% probability of being set to on.
   */
  public LightBoard(int numRows, int numCols)
  {
    lights=new boolean[numRows][numCols];
    for(int i=0;i<numRows;i++)
      for (int u=0;u<numCols;u++)
        if(Math.random()<.4)
          lights[i][u]=true;
    else lights[i][u]=false;

  }

  /** Evaluates a light in row index row and column index col and returns a status
   *  as described in part (b).
   *  Precondition: row and col are valid indexes in lights.
   */
  public boolean evaluateLight(int row, int col)
  {
    /* to be implemented in part (b) */
    if (lights[row][col]==true){
    int h=0;
      for(int i=0;i<lights.length;i++)
        if(lights[i][col]==true)
          h++;
   return h%2!=0;
    }
 if (lights[row][col]==false){
    int h=0;
      for(int i=0;i<lights.length;i++)
        if(lights[i][col]==true)
          h++;
   return h%3==0;
  }
    return lights[row][col];
  }
  public boolean[][] getLights()
  {
    return lights;
  }
  //used for testing
  public String toString()
  {
    String s = "";
    for (int r = 0; r < lights.length; r++)
    {
      for (int c = 0; c < lights[0].length; c++)
        if (lights[r][c])
          s += "*";
        else
          s += ".";
      s += "\n";
    }
    return s;
  }
  
}
