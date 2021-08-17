import java.util.*;

public class Bodega {
    public static void main(String[] args) throws Exception {
        System.out.println("----- BODEGA DO JOAZIN -----");
		Scanner scanner = new Scanner (System.in);
        Integer contBebida = 0, contCliente = 0, contFuncionario = 0, opt = 0;
		List<Funcionario> bodegueiros = new ArrayList<>();
		List<Cliente> cachaceiros = new ArrayList<>();
		List<Bebida> bebidas = new ArrayList<>();

        do{ 
			System.out.println("--- MENU ---");
			System.out.println("( 1 ) - Cadastrar funcionario");
			System.out.println("( 2 ) - Mostrar funcionarios");
			System.out.println("( 3 ) - Cadastrar bebidas");
			System.out.println("( 4 ) - Mostrar bebidas");
			System.out.println("( 5 ) - Comprar bebida");
			System.out.println("( 6 ) - Vender bebida");
			System.out.println("( 7 ) - Cadastrar cliente");
			System.out.println("( 8 ) - Mostrar clientes");
			System.out.println("( 9 ) - Sair do sistema");
			System.out.print("O que deseja realizar: ");
			opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    scanner.nextLine();
                    Integer codigo;
                    String nome;
                    Integer idade;
                    Float salario;

                    codigo = contFuncionario;
			        System.out.print("Nome: ");
			        nome = scanner.nextLine();
			        System.out.print("Idade: ");
			        idade = scanner.nextInt();
			        System.out.print("Salario: ");
			        salario = scanner.nextFloat();
                    contFuncionario++;

				    Funcionario funcionario = new Funcionario(codigo, nome, idade, salario);
				    bodegueiros.add(funcionario);
                    break;
                case 2:
                    scanner.nextLine();
                    for (int i = 0; i < contFuncionario; i++) {
                        Funcionario a = bodegueiros.get(i);
                        System.out.println("---- BODEGUEIRO ----");
                        System.out.println("Codigo do funcionario: " + a.codigo);
                        System.out.println("Nome do funcionario: " + a.nome);
                        System.out.println("Idade do funcionario: " + a.idade);
                        System.out.println("Salario do funcionario: " + a.salario);
                        System.out.println("---- ---- ---- ----");
                    }
                    break;
                case 3:
                    scanner.nextLine();
                    Integer codigoBebida;
                    String nomeBebida;
                    Float teorAlcolicoBebida;
                    Float quantidadeBebida;
                    Integer estoqueBebida;

                    codigoBebida = contBebida;
			        System.out.print("Nome: ");
                    nomeBebida = scanner.nextLine();
			        System.out.print("Teor Alcolico: ");
                    teorAlcolicoBebida = scanner.nextFloat();
			        System.out.print("Quantidade Bebida: ");
                    quantidadeBebida = scanner.nextFloat();
			        System.out.print("Estoque: ");
                    estoqueBebida = scanner.nextInt();
                    contBebida++;

                    Bebida bebida = new Bebida(codigoBebida, nomeBebida, teorAlcolicoBebida, quantidadeBebida, estoqueBebida);
                    bebidas.add(bebida);
                    break;
                case 4:
                    scanner.nextLine();
                    for (int i = 0; i < contBebida; i++) {
                        Bebida a = bebidas.get(i);
                        System.out.println("---- BEBIDA ----");
                        System.out.println("Codigo da bebida: " + a.codigo);
                        System.out.println("Nome da bebida: " + a.nome);
                        System.out.println("Teor alcolico da bebida: " + a.teorAlcolico);
                        System.out.println("Quantidade em ml da bebida: " + a.quantidade);
                        System.out.println("Estoque da bebida: " + a.estoque);
                        System.out.println("---- ---- ---- ----");
                    }
                    break;
                case 5:
                    scanner.nextLine();
                    Integer codigoBebidaCompra;
                    Integer quantidadeBebidaCompra;

			        System.out.print("Codigo: ");
                    codigoBebidaCompra = scanner.nextInt();
			        System.out.print("Quantidade: ");
                    quantidadeBebidaCompra = scanner.nextInt();

                    Bebida a = bebidas.get(codigoBebidaCompra);

                    a.comprarBebida(quantidadeBebidaCompra);
                    System.out.println("Estoque da bebida (ATUALIZADO): " + a.estoque);
                    break;
                case 6:
                    scanner.nextLine();
                    Integer codigoBebidaVenda;
                    Integer quantidadeBebidaVenda;
                    Integer resultVenda;

			        System.out.print("Codigo: ");
                    codigoBebidaVenda = scanner.nextInt();
			        System.out.print("Quantidade: ");
                    quantidadeBebidaVenda = scanner.nextInt();

                    Bebida b = bebidas.get(codigoBebidaVenda);

                    resultVenda = b.venderBebida(quantidadeBebidaVenda);
                    if (resultVenda == 0) {
                        System.out.println("Venda realizada com sucesso!");
                        System.out.println("Estoque da bebida (ATUALIZADO): " + b.estoque);
                    } else {
                        System.out.println("Erro: Estoque insuficiente!");
                    }
                    break;
                case 7:
                    scanner.nextLine();
                    Integer codigoCliente;
                    String nomeCliente;
                    String CPFCliente;
                    Boolean fiadoCliente;

                    codigoCliente = contCliente;
			        System.out.print("Nome: ");
                    nomeCliente = scanner.nextLine();
			        System.out.print("CPF: ");
                    CPFCliente = scanner.nextLine();
			        System.out.print("Fiado: ");
                    fiadoCliente = scanner.nextBoolean();
                    contCliente++;

                    Cliente cliente = new Cliente(codigoCliente, nomeCliente , CPFCliente, fiadoCliente);

                    cachaceiros.add(cliente);
                    break;
                case 8:
                    scanner.nextLine();
                    for (int i = 0; i < contCliente; i++) {
                        Cliente c = cachaceiros.get(i);
                        System.out.println("---- CACHACEIRO ----");
                        System.out.println("Codigo do cachacheiro: " + c.codigo);
                        System.out.println("Nome do cachacheiro: " + c.nome);
                        System.out.println("CPF do cachacheiro: " + c.CPF);
                        System.out.println("Cachacheiro pode fiado: " + ( c.fiado ? "sim" : "nao"));
                        System.out.println("---- ---- ---- ----");
                    }
                    break;
                case 9:
			        System.out.println("Saindo do sistema!");
                    break;
                default:
                    scanner.nextLine();
			        System.out.println("Valor inválido!");
                    break;
            }
		} while(opt != 9);
        scanner.close();
    }
}
