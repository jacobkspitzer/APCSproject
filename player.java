public class player{
  private String name;
  private String team;
  private boolean playing;
  public player(String n, String t){
    this.name  = n;
    this.team = t;
  }
  public String toString(){
    return this.name;
  }
  public String getTeam(){
    return this.team
  }
  
}
