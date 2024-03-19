package Lab9.Ex1;

import java.util.Arrays;

public class Lista <E>{
    private E[] lista;

    public Lista(int rozmiar){
        lista = (E[]) new Object[rozmiar];
    }

    public boolean dodaj(E element){
        for(int i = 0; i < lista.length;i++){
            if(lista[i] == null){
                lista[i] = element;
                return true;
            }
        }
        return false;
    }

    public boolean czyZawiera(E element){
        for(int i = 0; i < lista.length;i++){
            if(lista[i] == element){
                return true;
            }
        }
        return false;
    }

    public int zwrocIndeks(E element){
        for(int i = 0; i < lista.length;i++){
            if(lista[i] == element){
                return i;
            }
        }
        return -1;
    }

    public int zwrocOstatniIndeks(E element){
        int temp = -1;
        for(int i = 0; i < lista.length;i++){
            if(lista[i] == element){
                temp = i;
            }
        }
        return temp;
    }

    public E zwrocElement(int indeks){
        if(indeks >= lista.length){
            return null;
        }
        else{
            return lista[indeks];
        }
    }

    public boolean podmienElement(int indeks, E element){
        if(indeks > lista.length){
            return false;
        }
        else {
            lista[indeks] = element;
            return true;
        }
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("[");
        for (E e : lista) {
            if (e != null) {
                buffer.append(e + ",");
            }
        }
        if (buffer.length()>1) {
            buffer.deleteCharAt(buffer.length() - 1);
        }
        buffer.append("]");
        return buffer.toString();
    }
}
