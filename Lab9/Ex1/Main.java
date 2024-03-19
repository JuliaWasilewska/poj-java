package Lab9.Ex1;

public class Main {
    public static void main(String[] args) {
     /*
        Lista listaint = new Lista<Integer>(10);
        for (int i = 0; i < 11 ; i++){
            if(i % 2 == 0){
                System.out.println(listaint.dodaj(1));
            }
            else {
                System.out.println(listaint.dodaj(2));
            }
        }
        System.out.println(listaint);

        System.out.println(listaint.czyZawiera(1));
        System.out.println(listaint.czyZawiera(3));

        System.out.println(listaint.zwrocIndeks(2));
        System.out.println(listaint.zwrocOstatniIndeks(1));

        System.out.println(listaint.zwrocElement(1));
        System.out.println(listaint.zwrocElement(8));
        System.out.println(listaint.zwrocElement(10));

        System.out.println(listaint.podmienElement(0,3));
        System.out.println(listaint);
     */
        Lista listaStr = new Lista<String>(3);

        System.out.println(listaStr.dodaj("abc"));
        System.out.println(listaStr.dodaj("def"));
        System.out.println(listaStr.dodaj("abc"));
        System.out.println(listaStr.dodaj("xyz"));

        System.out.println(listaStr);

        System.out.println(listaStr.czyZawiera("def"));
        System.out.println(listaStr.czyZawiera("xyz"));

        System.out.println(listaStr.zwrocIndeks("abc"));
        System.out.println(listaStr.zwrocIndeks("xyz"));

        System.out.println(listaStr.zwrocOstatniIndeks("abc"));
        System.out.println(listaStr.zwrocOstatniIndeks("xyz"));

        System.out.println(listaStr.zwrocElement(1));
        System.out.println(listaStr.zwrocElement(10));

        System.out.println(listaStr.podmienElement(2,"xyz"));
        System.out.println(listaStr);
    }

}
