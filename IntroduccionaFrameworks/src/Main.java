//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        contenedor <Integer> num = new contenedor<>();
        num.guardar(5);
        System.out.println(num.extraer());

        contenedor <String> l = new contenedor<>();
        l.guardar("Hola");
        System.out.println(num.extraer());

        contenedor c = new contenedor();
        c.guardar(1);
        System.out.println(c.extraer());

        Double [] temp = new Double[1];
        temp[0] = 1.3;
        temp[1] = 2.3;


        contenedorElementos <Double> t = new contenedorElementos<>(temp);
        t.apilar(2.2);
        t.apilar(2.1);
        System.out.println(t.desapìlar());

        implementacionCOla<Integer> cola = new implementacionCOla<>();
        cola.encolar(1);
        cola.encolar(2);

        System.out.println(cola.desencolar());
    }
}