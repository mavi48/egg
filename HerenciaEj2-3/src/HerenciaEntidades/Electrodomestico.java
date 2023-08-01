package HerenciaEntidades;

public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;

    protected final static String colorDef = "blanco";
    protected final static char consumoDef = 'F';
    protected final static int precioDef = 1000;
    protected final static int pesoDef = 10;

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Double peso) {
        this.precio = precio;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    /*Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.*/

    public void comprobarConsumoEnergetico(char consumoEnergetico) {
        if (consumoEnergetico >= 100 && consumoEnergetico <= 1000){
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = consumoDef;
        }
    }
/*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.*/
    
    
    public void comprobarColor(String color) {
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean buscado = false;

        for (int i = 0; i < colores.length && !buscado; i++) {
            if (colores[i].equals(color)) {
                buscado = true;

            }
        }
        if (buscado) {
            this.color = color;
        } else {
            this.color = colorDef;

        }
    }
    
        public double precioFinal() {
        int  precios=0;
       

        switch (consumoEnergetico) {
            case 'A':
                precios = 1000;
                break;
            case 'B':
                precios = 800;
                break;
            case 'C':
                precios = 600;
                break;
            case 'D':
                precios = 500;
                break;
            case 'E':
                precios = 300;
                break;
            case 'F':
                precios = 100;
                break;
        }
        
        if (peso >= 0 && peso <= 19) {
            precio += 100;
        }
        if (peso >= 20 && peso <= 49) {
            precio += 500;
        }
        if (peso >= 50 && peso <= 79) {
            precio += 800;
        }
        if (peso > 80) {
            precio += 1000;
        }
        
        return precio + precios;
    }
}

