public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(8); 
        //Testar soma
        double soma = calc.somar(2, 3);
        System.out.println(soma);
        //Testar subtração
        double sub = calc.subtrair(2, 3);
        System.out.println(sub);
        //Testar multiplicação
        double mult = calc.multiplicar(2, 3);
        System.out.println(mult);
        //Testar divisão
        double div = calc.dividir (2, 3);
        System.out.println(div);
        //Teste Professor
        System.out.println(calc.somarPref(2));
    }
}
