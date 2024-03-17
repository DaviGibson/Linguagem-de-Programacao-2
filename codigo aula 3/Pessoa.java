public class Pessoa{
    double peso;
    double altura;
    
    public Pessoa(){
        peso = 0.0;
        altura = 0.0;
    }
    
    public double getPeso(){
        return peso;
    }
    public double getAltura(){
        return altura;
    }
    
    public void setPeso(double novopeso){
        this.peso = peso;
    }
    public void setAltura(double novaaltura){
        this.altura = altura;
    }
    
    public double calcularIMC(){
        return peso/(altura*altura);
    }
    
    public void informarIMC(double imc){
        if (imc < 18.5){
            System.out.println("Pessoa está Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Pessoa está com Peso normal");
        } else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Pessoa está com Pré-obesidade");
        } else if (imc >= 30.0 && imc <= 34.9){
            System.out.println("Pessoa está com Obesidade Grau 1");
        } else if (imc >= 35.0 && imc <= 39.9){
            System.out.println("Pessoa está com Obesidade Grau 2");
        } else if (imc >= 40.0){
            System.out.println("Pessoa está com Obesidade Grau 3");
        } 
    }
    
}