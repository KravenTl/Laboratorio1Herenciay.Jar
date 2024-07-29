package umg.programacionII.Drivers;

public class ConductorDeCoche extends Conductor {

    public ConductorDeCoche(String nomcon, String licencia) {
        super(nomcon, licencia);
    }
    public int experienciaAños=5;
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nomcon+"\nLicencia: " + licencia+"\nExperiencia: "+experienciaAños);
    }
}