package palabrafinal;

public final class ClaseFinal {

    //variable marcada como static, esta no se puede acceder con la clase y  "."
    public final int numero = 10;
    
    //constante en Java, estas se definen en mayuscula, al ser estatica se puede acceder con la clase y "."
    public static final int VAR_NUMERO = 3;
    
    //Esta variable objeto solo apuntara al objeto Persona, no podra modificarse para apuntar a otro objeto
    public static final Persona VAR_PERSONA = new Persona();
    
    //un metodo marcado como final no puede ser posteriormente modificado (sobreescrito) desde otra clase
    public static final void metodoFinal(){}
}
//Una clase marcada como final no puede heredar, 
//El siguiente codigo presenta error por lo dicho anteriormente, por ello se comenta
//class ClaseHija extends ClaseFinal{
    //la siguiente linea de codigo marcaria error porque el metodo esta marcado como final en la clase a la que pertenece
//    public static void metodoFinal(){}
//}
