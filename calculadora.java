public class calculadora{
    public float valor = 0;

    public calculadora ( float valor){
        this.valor = valor;
    }

    public void somar (float valor){
        this.valor += valor;
    }

    public void subtrair (float valor){
        this.valor -= valor;
    }

    public void multiplicar (float valor){
        this.valor *= valor;
    }

    public void dividir (float valor){
        this.valor /= valor;
    }
}