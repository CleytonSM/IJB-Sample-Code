package model;

public class Construction extends Material{
    private int idConstruction;

    public Construction(int idMaterial, String nameMaterial, long qtyMaterial, int idConstruction) {
        super(idMaterial, nameMaterial, qtyMaterial);
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
