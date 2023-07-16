package Entidad;

public class numeros {

    int x;
    int y;

    public numeros(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public numeros() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;

    }

    public double calcularDistancia(numeros num) {

        int x1 = x;
        int y1 = y;
        int x2 = num.getX();
        int y2 = num.getY();
        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        return dist;

    }

}
