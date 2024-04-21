package model.material;

/**
 * Classe que representa um material comprado.
 * Estende a classe Material.
 */
public class BoughtMaterial extends Material{

    private Material material;

    /**
     * Construtor da classe BoughtMaterial.
     * 
     * @param material O material comprado.
     */
    public BoughtMaterial(Material material) {
        super(material.getIdMaterial(), material.getNameMaterial(), material.getQtyMaterial());
        this.setMaterial(material);
    }

    /**
     * Obtém o material comprado.
     * 
     * @return O material comprado.
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Define o material comprado.
     * 
     * @param material O material comprado.
     * @throws RuntimeException Se o material for nulo.
     */
    public void setMaterial(Material material) {
        if (material == null){
            throw new RuntimeException("Material can't be null");
        }
        this.material = material;
    }
}
