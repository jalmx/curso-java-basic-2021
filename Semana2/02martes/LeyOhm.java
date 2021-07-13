public class LeyOhm {

    private LeyOhm() {
    }// candado

    public static double voltage(double corriente, double resistencia) {
        double resultado = corriente * resistencia;
        return resultado;
    }

    public static double corriente(double voltage, double resistencia) {
        return voltage / resistencia;
    }

    public static double resistencia(double voltage, double corriente){
        return voltage / corriente;
    }
}
