package virtual_pet;

public class VirtualPet {
    private int hunger;
    private int thirst;
    private int developReaction;
    private int tiredness;

    public VirtualPet(int hunger,int thirst,int developReaction,int tiredness){
        this.hunger=hunger;
        this.thirst=thirst;
        this.developReaction=developReaction;
        this.tiredness=tiredness;
    }
    public void feedPet(){
        hunger-=1;
        thirst+=1;
        developReaction+=1 ;
        tiredness+=3 ;

    }
    public void waterPet(){
        hunger--;
        thirst-=1;
    }
    public void playPet(){
        hunger+= 4;
        thirst+= 5;
        developReaction+=2 ;
        tiredness += 6 ;
    }
    public void cleanPet(){
        developReaction+=2 ;
        tiredness -=1 ;
    }

  public void tick(){
   hunger = hunger - 1;
      thirst= thirst - 1;
      developReaction = developReaction- 1 ;
      tiredness = tiredness - 1 ;

  }

    public int getHunger(){
        return hunger;
    }
    public int getThirst(){
        return thirst;
    }
    public int getplayPet(){
        return developReaction;
    }
    public int getcleanPet(){
        return tiredness;
    }
}
