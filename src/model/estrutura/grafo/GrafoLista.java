package model.estrutura.grafo;

import java.util.*;

public class GrafoLista<T> {
    private Map<T, List<T>> map = new HashMap<>();

    // add: adiciona um novo elemento
    // has: verifica se existe um elemento específico
    // size: retorna o número de elementos existentes 
    // toString: imprime na tela

    public void add (T source) {
        map.put(source, new LinkedList<T>());
    } 

    public void add (T source, T destination) {
        if (!map.containsKey(source))
            add(source);
        if (!map.containsKey(destination))
            add(destination);

        map.get(source).add(destination);
        map.get(destination).add(source);
    }

    public boolean has(T source) {
        return map.containsKey(source);
    }

    public boolean has(T source, T destination) {
        return map.get(source).contains(destination);
    }

    public int size() {
        return map.keySet().size();
    }

    // não verificado
    public T remove(T source) {
        return map.remove(source);
    } 

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n")
        }
    }
}