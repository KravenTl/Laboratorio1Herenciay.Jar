package umg.programacionII.Drivers;

public class Conductor {
    public String nomcon;
    public String licencia;

    public Conductor(String nomcon, String licencia){
       this.nomcon = nomcon;
       this.licencia = licencia;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nomcon+"\nLicencia: " + licencia);
    }
}
