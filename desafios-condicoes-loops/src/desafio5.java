import java.util.Scanner;

/*
Descrição
Você está desenvolvendo um programa simples em Java para auxiliar um cliente a realizar saques de uma conta bancária. O cliente pode fazer saques até atingir um limite diário predefinido.

Entrada
O programa solicitará ao usuário que informe o limite diário de saque.
Em seguida, o programa solicitará ao usuário que informe o valor do primeiro saque.
Saída
Utilizando um laço for, o programa iterará sobre os saques.
Para cada saque, o programa verificará se o valor ultrapassa o limite diário.
Se ultrapassar, o programa informará que o limite foi atingido e encerrará o loop.
Se não ultrapassar, o programa informará que o saque foi realizado com sucesso.
*/
public class desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double saque  = 0;
        // TODO: Crie um loop 'for' para iterar sobre os saques:
        for (double valorDoSaque  = saque; limiteDiario >valorDoSaque ;limiteDiario-=valorDoSaque){
            // TODO: Solicite ao usuário o valor do saque:
            saque = scanner.nextDouble();

            // TODO: Verifique se o valor do saque é zero, encerrando as transações:
            // Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;
            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                return;
            }else {

                // TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
                if (saque <= limiteDiario) {
                    limiteDiario -= saque;
                    System.out.println("Saque realizado. Limite restante: " + String.format("%.1f", limiteDiario));
                } else {

                    // TODO: Informe que o saque foi realizado e mostre o limite restante:
                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    return;
                }
            }
        }

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}
