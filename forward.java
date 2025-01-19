public class forward extends player{
  private int speed, pas, sho;
  public forward(String n, String t, int sh, int p, int s){
    super(n, t);
    sho = sh;
    pas = p;
    speed = s;
  }
  public getsho(){
    return this.sho;
  }
  public getpas(){
    return this.pas;
  }
  public getpac(){
    return this.speed;
  }
  
}
