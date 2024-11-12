package org.example;


public class JuegoDeDados {
    private Dado dado1;
    private Dado dado2;
    private Calculadora calculadora;

    public JuegoDeDados() {
        this.dado1 = new Dado();
        this.dado2 = new Dado();
        this.calculadora = new Calculadora();
    }

    public void jugar() {
        int resultadoDado1 = dado1.lanzar();
        int resultadoDado2 = dado2.lanzar();
        int suma = calculadora.sumar(resultadoDado1, resultadoDado2);

        System.out.println("Lanzaste los dados: " + resultadoDado1 + " y " + resultadoDado2);
        System.out.println("Suma de los dados: " + suma);

        if (suma == 7) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Perdiste, inténtalo de nuevo.");
        }
    }
}
