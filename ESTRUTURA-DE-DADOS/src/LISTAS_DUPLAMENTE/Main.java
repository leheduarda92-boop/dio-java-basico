public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        System.out.println(lista);
        System.out.println(lista.get(2));
        lista.remove(2);
        System.out.println(lista);
    }

}
