package Menmento;

public class Originator {
    private  String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public  Menmento saveStateToMenmento(){
        return  new Menmento(state);
    }
    public  void getStateFromMenmento(Menmento menmento){
        state=menmento.getState();
    }
}
