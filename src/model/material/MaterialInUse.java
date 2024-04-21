package model.material;

import model.Construction;

/**
 * Representa um material em uso em uma construção.
 * Esta classe estende a classe Material e adiciona informações sobre a construção em que o material está sendo utilizado.
 */
public class MaterialInUse extends Material{
    private Material material;
    private Construction construction;

    /**
     * Cria uma nova instância de MaterialInUse com o material e a construção especificados.
     * @param material O material em uso.
     * @param construction A construção em que o material está sendo utilizado.
     */
    public MaterialInUse(Material material, Construction construction) {
        super(material.getIdMaterial(), material.getNameMaterial(), material.getQtyMaterial());
        this.setMaterial(material);
        this.setConstruction(construction);
    }

    /**
     * Obtém o material em uso.
     * @return O material em uso.
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Define o material em uso.
     * @param material O material em uso.
     * @throws RuntimeException Se o material for nulo.
     */
    public void setMaterial(Material material) {
        if (material == null){
            throw new RuntimeException("Material can't be null");
        }
        this.material = material;
    }

    /**
     * Obtém a construção em que o material está sendo utilizado.
     * @return A construção em que o material está sendo utilizado.
     */
    public Construction getConstruction() {
        return construction;
    }

    /**
     * Define a construção em que o material está sendo utilizado.
     * @param construction A construção em que o material está sendo utilizado.
     */
    public void setConstruction(Construction construction) {
        this.construction = construction;
    }
}
