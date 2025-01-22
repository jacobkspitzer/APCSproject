public class midfield extends player{
  private int sho, pas, def;
  public midfield(String n, String t, int s, int p, int d){
    super(n, t);
    sho = s;
    pas = p;
    def = d;
  }
  public int getsho(){
    return this.sho;
  }
  public int getpas(){
    return this.pas;
  }
  public int getdef(){
    return this.def;
  }
  
}
