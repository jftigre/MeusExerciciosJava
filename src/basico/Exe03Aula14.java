package basico;
/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
*/

public class Exe03Aula14 {
    public static void main(String[] args) {
        String nome = "João";
        String endereco = "Campina Grande-PB";
        double salario = 3446.42;
        String dataRecebimentoSalario = "04/08/25";

        System.out.println("Eu " + nome + ",morando no endereço " + endereco +", confirmo que recebi o salário de "+ salario +", na data "+ dataRecebimentoSalario +".");
    }
}
