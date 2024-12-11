import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        horarioCurso("lunes", 3);
    }

    static void horarioCurso(String dia, int hora) {
        String horario[][] = {
                {"BD", "BD", "BD", "BD", "DS", "PR", "PR", "PR"},
                {"BD", "BD", "BD", "SASP", "DS", "SI", "SI", "IPE"},
                {"PROG", "PROG", "PROG", "LMSXI", "DS", "LMSXI", "COD", "COD"},
                {"ING", "ING", "SI", "SI", "DS", "PROG", "PROG", "PROG"},
                {"COD", "LMSXI", "LMSXI", "SI", "DS", "SI", "IPE", "IPE"}};

        int numDia;
        switch (dia) {
            case "lunes":
                numDia = 0;
            case "martes":
                numDia = 1;
            case "miercoles":
                numDia = 2;
            case "jueves":
                numDia = 3;
            case "viernes":
                numDia = 4;
            default:
                numDia = -1;

        }
        if (numDia < 0 || numDia >= 5) {
            return "Introduce un dia correcto";
        } else if (hora <= 0 || hora > 8) {
            return "Introduce una hora entre 1 y 8";
        } else {
            return horario[numDia][hora];
        }
    }
        public static int horasModulo(String horario[][],String modulo) {
            int cantHoras=0;
            for(int dia=0; dia<5; dia++) {
            for(int hora=0; hora<8; hora++) {
                    if(modulo.equals(horario[hora][dia])) {
                        cantHoras++;
                    }
                    }
                }
                return cantHoras;
            }
        }