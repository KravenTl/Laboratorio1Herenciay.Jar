package umg.programacionII;

import umg.programacionII.Drivers.Conductor;
import umg.programacionII.Drivers.ConductorDeCoche;
import umg.programacionII.Drivers.ConductorDeMoto;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Crear un objeto ConductorDeCoche
        Conductor conductorDeCoche = new ConductorDeCoche("Juan Perez", "ABC123");
        conductorDeCoche.mostrarInformacion();

        // Crear un objeto ConductorDeMoto
        Conductor conductorDeMoto = new ConductorDeMoto("Maria Lopez", "XYZ789");
        conductorDeMoto.mostrarInformacion();
        }
    }
