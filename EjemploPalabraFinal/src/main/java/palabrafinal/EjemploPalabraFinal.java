package palabrafinal;

public class EjemploPalabraFinal {

    public static void main(String[] args) {

        //El siguiente codigo arroja error porque la variable esta marcada como final en la clase origen
        //Aunque la clase "ClaseFinal" estuviera marcada como final, pero no "VAR_NUMERO" si permitiria modificarlo
//        ClaseFinal.VAR_NUMERO = 20;
//        System.out.println(ClaseFinal.VAR_NUMERO);
        //El siguiente codigo arrojara error porque no puede apuntar a otro objeto por estar marcado como final
        //en la clase origen
//        ClaseFinal.VAR_PERSONA = new Persona();
        //
        //Sin embargo, aunque se marque como final, puede consultar y modificar el estado del objeto
        ClaseFinal.VAR_PERSONA.setNombre("Jeysson");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());

        ClaseFinal.VAR_PERSONA.setNombre("Jorge");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
    }
}
