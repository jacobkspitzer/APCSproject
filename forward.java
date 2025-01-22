public class forward extends player{
  private int speed, pas, sho;
  public forward(String n, String t, int sh, int p, int s){
    super(n, t);
    sho = sh;
    pas = p;
    speed = s;
  }
  public int getsho(){
    return this.sho;
  }
  public int getpas(){
    return this.pas;
  }
  public int getpac(){
    return this.speed;
  }
  
}
