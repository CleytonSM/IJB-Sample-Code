package model;

public class BoughtMaterial extends Material{

    private Material material;

    public BoughtMaterial(Material material) {
        super(material.getIdMaterial(), material.getNameMaterial(), material.getQtyMaterial());
        this.setMaterial(material);
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        if (material == null){
            throw new RuntimeException("Material can't be null");
        }
        this.material = material;
    }
}
