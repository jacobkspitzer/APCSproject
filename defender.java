public class defender extends player{
  private int def, pas, sho;
  public defender(String n, String t, int d, int p, int s){
    super(n, t);
    def = d;
    pas = p;
    sho = s;
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
