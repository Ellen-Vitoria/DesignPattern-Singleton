public class Fila {
    private static Fila instance;

    //Método construtor
    private Fila() {
    }

    //Método para retornar a única instância da classe
    public static Fila getInstance() {
        if (instance == null) {
            instance = new Fila();
        }
        return instance;
    }

    public void ImprimeDocumento(){
    }
    public void RemoveDocumento(){
    }
    public void RemoveTodosDocumentos(){
    }
}