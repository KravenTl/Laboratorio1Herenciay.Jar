package umg.programacionII.Drivers;

public class ConductorDeMoto extends Conductor{

    public ConductorDeMoto(String nomcon, String licencia) {
        super(nomcon, licencia);
    }

    public boolean tieneLicenciaMoto=false;

    @Override
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nomcon+"\nLicencia: " + licencia+"\nTiene licencia de moto: " + tieneLicenciaMoto);
    }
}
