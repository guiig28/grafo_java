package view;

import controller.GrafoMatrizController;

public class GrafoMatrizView {
    public static void main (String[] args) {
        try {
            GrafoMatrizController obj = new GrafoMatrizController();
            System.out.println(obj.teste2());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}