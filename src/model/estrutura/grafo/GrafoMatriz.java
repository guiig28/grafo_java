package model.estrutura.grafo;

import java.util.*;

public class GrafoMatriz<T> {
    private int[][] matriz;
    private T[] labels;
    private Map<T, Integer> indice;

    public GrafoMatriz(T[] labels) {
        this.labels = labels;
        this.matriz = new int[labels.length][labels.length];
        this.indice = new HashMap<T, Integer>();

        for(int i = 0; i < labels.length; i++) 
            this.indice.put(labels[i], i);
    }

    public void link(T label1, T label2) {
        int i = this.indice.get(label1);
        int j = this.indice.get(label2);
        this.matriz[i][j] = 1;
        this.matriz[j][i] = 1;
    }

    public boolean contains(T label) {
            for (T l : this.labels) {
                if (label == l)
                    return true;
            }
    }

    public T[] melhorCaminho(T tInicio, T tFinal) {
        // verificar se existem elementos
        if (!this.contains(tInicio) || !this.contains(tFinal)) {
            T[] empty = {};
            return empty;
        }

        int bestCount;
        List<T> bestRoute;
      
        int iInicio = this.indice.get(tInicio);
        int iLast = this.indice.get(tFinal);
        int iWay;

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < this.labels.length; i++) {
            builder.append(this.labels[i]).append(": ");

            for(int j = 0; j < this.labels.length; j++) {
                if (this.matriz[i][j] == 1) 
                    builder.append(this.labels[j]).append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}