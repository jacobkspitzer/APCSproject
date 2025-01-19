public class midfield extends player{
  private int sho, pas, def;
  public midfield(String n, String t, int s, int p, int d){
    super(n, t);
    sho = s;
    pas = p;
    def = d
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
