package entities.enums;

public enum GenerosDeLivros {
    ACAO,
    TERROR,
    SUSPENSE,
    MAGIA,
    ROMANCE,
    CIENCIA,
    TECNOLOGIA;

    GenerosDeLivros() {
    }

    public static void interarNomeGeneros(){
        for(GenerosDeLivros generosLivros : GenerosDeLivros.values()){
            System.out.printf("%d - %s%n", generosLivros.ordinal(), generosLivros);
        }
    }

    public static GenerosDeLivros escolherGenero(int generoEscolhido){
        GenerosDeLivros genero = null;
        for(GenerosDeLivros generosLivros : GenerosDeLivros.values()){
            if(generoEscolhido == generosLivros.ordinal()){
                genero = generosLivros;
            }
        }
        return genero;
    }
}
