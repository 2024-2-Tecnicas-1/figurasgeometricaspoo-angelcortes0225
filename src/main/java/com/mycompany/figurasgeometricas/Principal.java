package com.mycompany.figurasgeometricas;

import java.util.Scanner;

    class FiguraGeometrica {

    protected String nombre;
    protected String color;

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Complejidad O(1) - constante, ya que no depende de ningún parámetro
    public double obtenerArea() {
        return 0;
    }

    // Complejidad O(1) - constante, ya que no depende de ningún parámetro
    public double obtenerPerimetro() {
        return 0;
    }
}

    class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Complejidad O(1) - constante, ya que solo implica operaciones aritméticas con el radio
    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    // Complejidad O(1) - constante, ya que solo implica operaciones aritméticas con el radio
    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}

    class Rectangulo extends FiguraGeometrica {

    private double lado1;
    private double lado2;

    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    // Complejidad O(1) - constante, ya que solo realiza multiplicación de los lados
    @Override
    public double obtenerArea() {
        return lado1 * lado2;
    }

    // Complejidad O(1) - constante, ya que solo realiza suma y multiplicación de los lados
    @Override
    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2);
    }
}

    class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Complejidad O(1) - constante, ya que solo realiza multiplicación y división
    @Override
    public double obtenerArea() {
        return (base * altura) / 2;
    }

    // Complejidad O(1) - constante, aunque la fórmula del perímetro puede variar, este ejemplo es simplificado
    @Override
    public double obtenerPerimetro() {
        return base * 3;
    }
}

public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura:");
        String nombre = lector.nextLine();

        System.out.println("Ingrese el color de la figura:");
        String color = lector.nextLine();

        System.out.println("Ingrese el tipo de figura (1: Circulo, 2: Rectangulo, 3: Triangulo):");
        int tipoFigura = lector.nextInt();

        FiguraGeometrica figura = null;

        switch (tipoFigura) {
            case 1:
                System.out.println("Ingrese el radio del circulo:");
                double radio = lector.nextDouble();
                figura = new Circulo(nombre, color, radio);
                break;
            case 2:
                System.out.println("Ingrese el valor del lado 1 del rectangulo:");
                double lado1 = lector.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectangulo:");
                double lado2 = lector.nextDouble();
                figura = new Rectangulo(nombre, color, lado1, lado2);
                break;
            case 3:
                System.out.println("Ingrese el valor de la base del triangulo:");
                double base = lector.nextDouble();
                System.out.println("Ingrese el valor de la altura del triangulo:");
                double altura = lector.nextDouble();
                figura = new Triangulo(nombre, color, base, altura);
                break;
            default:
                System.out.println("Opcion no valida.");
                System.exit(0);
        }

        // Complejidad O(1) - constante para los cálculos de área y perímetro
        System.out.println("Area de la figura: " + figura.obtenerArea());
        System.out.println("Perimetro de la figura: " + figura.obtenerPerimetro());

    }
}
