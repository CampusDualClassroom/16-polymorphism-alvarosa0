package com.campusdual.classroom;

public class Tractor implements IMachine {

    protected int horsePower = 0;

    public Tractor(int hp) {
        this.horsePower = hp;
    }

    public void forward() {
        System.out.println("El tractor " + horsePower + " avanza");
    }

    public void backward() {
        System.out.println("El tractor " + horsePower + " retrocede");
    }

    @Override
    public void start() {
        System.out.println("El tractor de " + horsePower + "  está encendido.");
    }


    @Override
    public void stop() {
        System.out.println("El tractor de " + horsePower + "  está apagado.");

    }

    @Override
    public void maintenance() {
        System.out.println("El tractor de " + horsePower + "  está en mantenimiento.");
    }
}

