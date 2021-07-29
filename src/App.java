public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Llamando funcion sin parametros y con parametros
        System.out.printf("%.2f\n", App.metodo());
        System.out.printf("%.2f\n", App.metodo2("0.44"));

        //Creando objeto personas y llamando metodo contExcelente
        personas p = new personas();
        System.out.println(p.contExcelente());

    }

    public static float metodo(){
        String numero = "0.50";     
        float numeroF= Float.parseFloat(numero);
        return numeroF;
    }

    public static float metodo2(String num){
        String numero = num;     
        float numeroF= Float.parseFloat(numero);
        return numeroF;
    }
}


