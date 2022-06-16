package eraser;

public class Eraser {
    public static String erase(String str) {
        //On sélectionne UNIQUEMENT les espaces simples pour les remplacer par rien (on les supprimes)
        str = str.replaceAll("(?<! ) (?! )", "");
        return str;
    }
}
