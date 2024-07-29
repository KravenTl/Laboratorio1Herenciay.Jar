package umg.programacionII;

import umg.programacion2.Autos.Coche;
import umg.programacion2.Autos.Moto;
import umg.programacion2.Autos.Vehiculo;
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
        System.out.println();

        //Crear un objeto Carro
        Vehiculo carro = new Coche("Toyota","Rav4",2015);
        carro.mostrarDetalles();
        //Crear un objeto Moto
        Vehiculo moto = new Moto("Honda","Navi",2020);
        moto.mostrarDetalles();

    }
    }
