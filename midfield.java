public class midfield extends player{
  private int speed, pas, sho;
  public midfield(String n, String t, int pac, int p, int s){
    super(n, t);
    pac = p;
    pas = p;
    speed = s;
  }
  public getsho(){
    return this.sho;
  }
  public getpas(){
    return this.pas;
  }
  public getdef(){
    return this.def;
  }
  
}
