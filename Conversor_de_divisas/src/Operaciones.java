
public class Operaciones {
    private double Valor, Resultado;
    private int divisa, divisafinal;
   
    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        this.Valor = valor;
    }

    public int getDivisa() {
        return divisa;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public int getDivisafinal() {
        return divisafinal;
    }

    public void setDivisafinal(int divisafinal) {
        this.divisafinal = divisafinal;
    }

    public double getResultado() {
        return Resultado;
    }

    public void setResultado(double Resultado) {
        this.Resultado = Resultado;
    }

    public Operaciones() {
    }
    
    
    
  public double convertir(){
      
      if (divisa==0 && divisafinal ==0 ){
            
            Resultado = Valor;
        }
        else if(divisa==0 && divisafinal ==1){
            Resultado = Valor * 0.13;
        }
        else if(divisa==0 && divisafinal ==2){
            Resultado = Valor * 0.12;
        }
        else if(divisa==0 && divisafinal ==3){
            Resultado = Valor * 2.67;
        }
        else if (divisa==1 && divisafinal ==0 ){
            
            Resultado = Valor * 7.67;
        }
        else if(divisa==1 && divisafinal ==1){
            Resultado = Valor;
        }
        else if(divisa==1 && divisafinal ==2){
            Resultado = Valor * 0.95;
        }
        else if(divisa==1 && divisafinal ==3){
            Resultado = Valor * 20.43;
        }
        else if (divisa==2 && divisafinal ==0 ){
            
            Resultado = Valor * 8.07;
        }
        else if(divisa==2 && divisafinal ==1){
            Resultado = Valor * 1.05;
        }
        else if(divisa==2 && divisafinal ==2){
            Resultado = Valor;
        }
        else if(divisa==2 && divisafinal ==3){
            Resultado = Valor * 21.50;
        }
        else if (divisa==3 && divisafinal ==0 ){
            
            Resultado = Valor * 0.38;
        }
        else if(divisa==3 && divisafinal ==1){
            Resultado = Valor * 0.049;
        }
        else if(divisa==3 && divisafinal ==2){
            Resultado = Valor * 0.047;
        }
        else if(divisa==3 && divisafinal ==3){
            Resultado = Valor;
        }
    
      return Resultado;
      
  }
    
}
