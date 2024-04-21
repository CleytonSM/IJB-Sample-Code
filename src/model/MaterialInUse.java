package model;

public class MaterialInUse extends Material{
    private Material material;
    private Construction construction;

    public MaterialInUse(Material material, Construction construction) {
        super(material.getIdMaterial(), material.getNameMaterial(), material.getQtyMaterial());
        this.setMaterial(material);
        this.setConstruction(construction);
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Construction getConstruction() {
        return construction;
    }

    public void setConstruction(Construction construction) {
        this.construction = construction;
    }
}
