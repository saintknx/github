public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(); 
        //Testar soma
        double soma = calc.somar(2, 3);
        System.out.println(soma);
        //Testar subtração
        double sub = calc.subtrair(2, 3);
        System.out.println(sub);
    }
}
