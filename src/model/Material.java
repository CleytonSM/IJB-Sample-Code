package model;

public class Material {

    private int IdMaterial;
    private String NameMaterial;
    private long QtyMaterial;

    public int getIdMaterial() {
        return IdMaterial;
    }

    public void setIdMaterial(int IdMaterial) {
    if (IdMaterial < 0) {
        throw new RuntimeException("Id lenght less than zero");
    }
        this.IdMaterial = IdMaterial;
    }

    public String getNameMaterial() {
        return NameMaterial;
    }

    public void setNameMaterial(String nameMaterial) {
        if(nameMaterial.length() > 60){
            throw new RuntimeException("Name lenght bigger than 60 chars");
        }
        this.NameMaterial = nameMaterial;
    }

    public long getQtyMaterial() {
        return QtyMaterial;
    }

    public void setQtyMaterial(long qtyMaterial) {
        if(qtyMaterial < 0){
            throw new RuntimeException("Quantity less than 0");
        }
        this.QtyMaterial = qtyMaterial;
    }
}
