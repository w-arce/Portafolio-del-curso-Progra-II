public class  Usuario
    extends Entidad
    implements Imprimible
    {

    public String apellido;
    public String correo;
    public String telefonos;
    public Rol rolDelUsuario;
    public Usuario(int ID){
        this.id = ID;
    } 
    public int getId(){return this.id;}

    @Override
    public String imprimir(){
        return "NOMBRE DEL USUARIO " + 
        this.nombre + " " + this.apellido;
    }
}
