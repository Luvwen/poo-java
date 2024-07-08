public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil toyota = new Automovil("toyota", "supra");
        Automovil toyota2 = new Automovil("toyota", "corolla");
        Automovil toyota3 = new Automovil("toyota", "corolla");

        System.out.println(toyota.detalle());
        System.out.println(toyota2.detalle());
        System.out.println(toyota3.detalle());

        System.out.println(Automovil.getColorPatente());

        System.out.println(Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println(Automovil.VELOCIDAD_MAX_CIUDAD);
    }
}
