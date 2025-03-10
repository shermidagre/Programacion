//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Canguro nai = new Canguro("Juana",1,true);
        nai.desprazarse();
        nai.voz();


        Reptil oliver = new Reptil("Oliver",1);
        oliver.voz();
        oliver.desprazarse();
        oliver.tipoSon = "Nautilus Top";
        System.out.println(oliver.tipoSon);

        Can can = new Can("Juaniya",1);
        can.desprazarse();
        can.voz();
        can.mamar();
        System.out.println(can.parir());
        System.out.println(can.ronroneo());

    }
}