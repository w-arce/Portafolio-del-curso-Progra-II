public class Armadura extends Vitalidad {
    private Material material;
    public String color;
    public Armadura(
        short valor1,short valor2, short valor3,short valor4) {
        super(valor1,valor2,valor3,valor4);
    }

    public Armadura(
        short valor1,short valor2,
        short valor3,short valor4
        Material valor)5 {
        super(valor1,valor2,valor3,valor4);
    }
    public Material getMaterial(){
        return this.material;

    }   
}
