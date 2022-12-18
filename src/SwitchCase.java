public class SwitchCase {
    public static void main(String[] args) {
        var estacion = "PRIMAVERA";

        switch (estacion) {
            case "VERANO" :
                System.out.println("es verano");
                break;
            case "INVIERNO" :
                System.out.println("es invierno");
                break;
            default :
                    System.out.println("es otra estacion");
        }
    }
}
