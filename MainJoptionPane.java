import javax.swing.JOptionPane;

public class MainJoptionPane {
    
    public static void main (String[] args){
        
        String stringEntrada = JOptionPane.showInputDialog("Entre com o valor");
        float valorInicial = Float.parseFloat(stringEntrada);

        calculadora calc = new calculadora(valorInicial);
        while (true) {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n 1 para somar\n 2 para subtrair\n 3 para multiplicar\n 4 para dividir \n 5 para sair"));
            if (opcao == 5){
                break;
            }else if (opcao == 69){
                JOptionPane.showMessageDialog(null, "Vitor é viado");
                }
            else if (opcao < 1 || opcao > 4){
                JOptionPane.showMessageDialog(null, "Valor Inválido\nDigite o valor entre 1 e 5");
                continue;
            }
            float ValorOperador = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do operando: "));
            if (opcao == 1){
                calc.somar(ValorOperador);
            }else if (opcao == 2){
                calc.subtrair(ValorOperador);

            }else if (opcao == 3){
                calc.multiplicar(ValorOperador);
                
            }else if (opcao == 4){
                if (ValorOperador == 0){
                    JOptionPane.showMessageDialog(null,"Não é possível dividir por 0.");
                    continue;
            }
                else{
                    calc.dividir(ValorOperador);

                }
                
            }
            JOptionPane.showMessageDialog(null, "O resultado é: " +calc.valor);
        }
    }
}