/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pcdejemplo;

import java.util.Random;

/**
 *
 * @author antonio diego
 */
public class Saludador implements ISaludable {

    private int j;

    public Saludador(int j) {
        this.j = j;
    }

    @Override
    public void Saludar(String menssaje) {

        for (int i = 0; i < j; i++) {
            System.out.println(menssaje);
        }
    }

    public int Despide(String mensaje) throws Exception {

        Random r = new Random();
        r.setSeed(System.currentTimeMillis());

        if (r.nextInt(2) == 0) {
            System.out.println(mensaje);
        } else {
            throw new Exception("ERROR!!! 1 en vez de 0");
        }

        return 0;
    }

    @Override
    public void adios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
