public class Main {
    public static void main(String[] args) {
        perro a = new perro();

        String nomperro;
        String nomraza;
        String nomgenero;

        a.setNombre("Elsa");nomperro = a.getNombre();
        a.setRaza("Husky");nomraza = a.getRaza();
        a.setGenero("hembra");nomgenero = a.getGenero();
        a.setEdad(5);
        a.setPeso(50);

        System.out.println(nomperro);
        System.out.println(nomraza);
        System.out.println(nomgenero);
        System.out.println(a.getEdad());
        System.out.println(a.getPeso());


    }
}
}
