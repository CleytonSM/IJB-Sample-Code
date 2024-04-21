package model;

public class Material {

    private int idMaterial;
    private String nameMaterial;
    private long qtyMaterial;

    public Material(int idMaterial, String nameMaterial, long qtyMaterial) {
        this.setIdMaterial(idMaterial);
        this.setNameMaterial(nameMaterial);
        this.setQtyMaterial(qtyMaterial);
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
    if (idMaterial <= 0) {
        throw new RuntimeException("Id length less than one");
    }
        this.idMaterial = idMaterial;
    }

    public String getNameMaterial() {
        return nameMaterial;
    }

    public void setNameMaterial(String nameMaterial) {
        if(nameMaterial.length() > 60){
            throw new RuntimeException("Name length bigger than 60 chars");
        }
        this.nameMaterial = nameMaterial;
    }

    public long getQtyMaterial() {
        return qtyMaterial;
    }

    public void setQtyMaterial(long qtyMaterial) {
        if(qtyMaterial < 0){
            throw new RuntimeException("Quantity less than 0");
        }
        this.qtyMaterial = qtyMaterial;
    }
}
