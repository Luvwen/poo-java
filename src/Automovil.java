public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private double cilindrada;
    private int capacidadTanque;
    private static int ultimoId;
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final Integer VELOCIDAD_MAX_CIUDAD = 60;
    private static final int capacidadTanqueEstatico = 50;
    private static String colorPatente = "naranja";

    public Automovil(){
        this.id = ++ultimoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    };

    public Automovil(String fabricante, String modelo, Color color){
        this(fabricante, modelo);
        this.color = color;
    };
    public Automovil(String fabricante, String modelo, Color color, double cilindrada){
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    };
    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadTanque){
        this(fabricante, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    };
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static String getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente){
        // atributos estáticos solo se les puede asignar valor accediendo mediante el nombre de la clase
        Automovil.colorPatente = colorPatente;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public String detalle(){
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("El id es: ").append(this.id);
        sb.append("\nEl fabricante del auto es: ").append(this.fabricante);
        sb.append("\nEl modelo del auto es: ").append(this.modelo);
        sb.append("\nEl color del auto es: ").append(this.color.getColor());
        sb.append("\nEl color de la patente del auto es: ").append(colorPatente);
        sb.append("\nLa cilindrada del auto es: ").append(this.cilindrada);

        return sb.toString();
    }

    public String acelerar(int rpm){
        return "El auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    };

    public String frenar(){
        return "El auto " + this.fabricante + " esta frenando!!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km / (this.capacidadTanque * porcentajeBencina);
    };

    public float calcularConsumo(int km, int porcentajeBencina){
        return km / (this.capacidadTanque * (porcentajeBencina / 100f));
    };

    public static float calcularConsumoestatico(int km, int porcentajeBencina){
        return km / (Automovil.capacidadTanqueEstatico * (porcentajeBencina / 100f));
    };

    @Override
    public boolean equals(Object obj) {
        // Si el obj es de tipo Automovil se devuelve true
        if(this == obj){
            return true;
        }
        //Si el obj es de otro tipo diferente al de Automovil se devuelve false
        if(!(obj instanceof Automovil)){
            return false;
        }
        //Conversión de tipo (cast)
        Automovil a = (Automovil) obj;

        return (this.fabricante != null
                && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}
