package TemplateMethod;

abstract class   Document {
    private  Integer tamanho;
    public Document( Integer tamanho) {
        this.tamanho = tamanho;
    }


    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public   abstract  void MostrarDocumento();
}
