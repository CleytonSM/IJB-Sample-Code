package model;

public class Construction{
    private int idConstruction;

    public Construction(int idConstruction) {
        this.setIdConstruction(idConstruction);
    }

    public int getIdConstruction() {
        return idConstruction;
    }

    public void setIdConstruction(int idConstruction) {
        if(idConstruction <= 0){
            throw new RuntimeException("id less than one");
        }
        this.idConstruction = idConstruction;
    }


}
