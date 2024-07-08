public class EjemploAutomovil {
    public static void main(String[] args){

        Automovil toyota = new Automovil("toyota", "supra");
        toyota.setColor(Color.AZUL);
        toyota.setCilindrada(3.0);
        toyota.setCapacidadTanque(68);

        Automovil toyota2 = new Automovil("toyota", "corolla", Color.NARANJA);
        Automovil toyota3 = new Automovil("toyota", "corolla", Color.GRIS, 50);

        System.out.println(toyota.detalle());

        System.out.println(toyota.acelerar(2500));
        System.out.println(toyota.frenar());

        System.out.println(toyota.acelerarFrenar(2500));

        System.out.println(toyota.calcularConsumo(300, 0.75f));

        System.out.println(toyota.calcularConsumo(300, 60));

        System.out.println("Son iguales toyota2 y toyota3? " + toyota2.equals(toyota3));
        System.out.println(Automovil.getColorPatente());
    }
}
