public class Personaje extends Vitalidad {
    private String nombre;
    private Armadura armadura; 
    public Personaje(short valor1, short valor2,short valor3,short valor4){
        super (valor1,valor2,valor3,valor4);
    }
    public Armadura getArmadura(){
        return armadura;
    }
    public String getnombre(){
        return nombre;
}
