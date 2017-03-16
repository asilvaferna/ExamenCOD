package examendiagramas;

import javax.swing.JOptionPane;

/**
* <h1>Hora</h1>
* Esta clase contiene todas las operaciones de hora
* entre ellas los modos: alarma y hora.
*
* @author  Adri
* @version 1.0
*/
public class Hora {

    private int horas;
    private int minutos;
    private String alarma;
    private String hora;
        /**
        /* Este metodo devuelve las horas.
        /* @return int
        */
    public int getHoras() {
        return horas;
    }
        /**
        /* Este metodo define la alarma segun el valor por parametro.
        * @param alarma 
        */
    public void setAlarma(String alarma) {
        this.alarma = alarma;
    }
        /**
        /* Este metodo devuelve la hora de alarma.
        /* @return String
        */
    public String getAlarma() {
        return alarma;
    }
        /**
        /* Este metodo devuelve la hora.
        /* @return String
        */
    public String getHora() {
        return hora;
    }
        /**
        /* Este metodo define la hora segun el valor por parametro.
        * @param hora
        */
    public void setHora(String hora) {
        this.hora = hora;
    }
        /**
        /* Este metodo devuelve los minutos.
        /* @return int
        */
    public int getMinutos() {
        return minutos;
    }
        /**
        /* Este metodo define los minutos.
        * @param int
        */
    
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
        /**
        /* Este metodo define la hora con una unidad int.
        * @param int
        */
    
    public void setHoras(int hora) {
        this.horas = hora;
    }
        
        /**
        /* Este metodo es el menu de hora, configura y define la hora (Inacabado).
        */
    public void modoHora() {    
        setHora("00:00");
        int menu = Integer.parseInt(JOptionPane.showInputDialog("MODO HORA:\n1. Aumentar hora\n2. Aumentar minutos\n3. Set hora\n\n#####\nHora: " + Display.mostrarHora(this.hora)));
        while (menu != 3) {
            switch (menu) {
                case 1:
                    setHoras(this.horas + 1);
                    break;
                case 2:
                    setMinutos(this.minutos + 1);
                    break;
                case 3:
                    setHora(Integer.toString(this.horas) + ":" + Integer.toString(this.minutos));
                    break;
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog("MODO HORA:\n1. Aumentar hora\n2. Aumentar minutos\n3. Set hora\n\n#####\nHora: " + Display.mostrarHora(this.hora)));
        }
    }
        /**
        /* Este metodo es el menu de alarma, configura y define la alarma (Inacabado)
        /* Llama al metodo visualizaModo() de la clase display.
        */
    public void modoAlarma() {
        setAlarma("");
        int menu = Integer.parseInt(JOptionPane.showInputDialog("MODO ALARMA:\n1. Aumentar hora\n2. Aumentar minutos\n3. Set hora\n\n#####\nHora: " + Display.mostrarHora(this.hora)));
        while (menu != 3) {
            switch (menu) {
                case 1:
                    setHoras(this.horas + 1);
                    break;
                case 2:
                    setMinutos(this.minutos + 1);
                    break;
                case 3:
                    setAlarma(Integer.toString(this.horas) + ":" + Integer.toString(this.minutos));
                    break;
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog("MODO ALARMA:\n1. Aumentar hora\n2. Aumentar minutos\n3. Set hora\n\n#####\nHora: " + Display.mostrarHora(this.hora)));
        }
    }
}
