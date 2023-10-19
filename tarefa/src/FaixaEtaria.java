import java.util.Scanner;

//exercício 1 FAIXA ETARIA
public class FaixaEtaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        if (idade < 18) {
            System.out.println("Você é menor de idade");
        } else if (idade <= 60) {
            System.out.println("Você é adulto");
        } else {
            System.out.println("Você é idoso");
        }
    }
}

//Exercício 2- SOMA DOS NUMEROS IMPARES

import java.util.Scanner;
public static void main(String[] args) {
Scanner ler = new Scanner(System.in); // Cria um objeto Scanner para leitura de entrada
int soma = 0; // Inicializa a variável 'soma' para armazenar a soma dos números ímpares
int atual = 1; // Inicializa a variável 'atual' com 1 para representar o primeiro número ímpar
System.out.println("Digite um número: "); // Solicita ao usuário que digite um número
int n = ler.nextInt(); // Lê o número inserido pelo usuário
for (int c = 1; c < n; c++) { // Inicia um loop de 1 até o número inserido pelo usuário
if (c % 2 == 1) { // Verifica se 'c' é ímpar (resto da divisão por 2 igual a 1)
soma += atual; // Se 'c' for ímpar, adiciona o valor de 'atual' à 'soma'
atual += 2; // Atualiza 'atual' para o próximo número ímpar (acrescenta 2)
}
}
System.out.println("A soma dos ímpares é: " + soma); // Imprime a soma dos números ímpares
}

//Exercício 3 - Lista de nomes

import java.util.Scanner;
public class VerificarNome {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
String[] nomes = new String[5]; // Declara um array de strings para armazenar nomes
for (int c = 0; c < 5; c++) { // Use índices de 0 a 4 para preencher o array de nomes
System.out.println("Digite um nome: ");
nomes[c] = ler.nextLine();
}
System.out.println("Digite outro nome para verificar: ");
String outronome = ler.nextLine();
boolean nomeIgualEncontrado = false; // Variável para verificar se um nome igual foi encontrado
for (int c = 0; c < 5; c++) { // Use índices de 0 a 4 para verificar o array de nomes
if (outronome.equals(nomes[c])) {
nomeIgualEncontrado = true; // Define a variável como verdadeira se encontrar um nome igu
al
break; // Sai do loop após encontrar o nome igual
}
}
if (nomeIgualEncontrado) {
System.out.println("Nome igual encontrado");
} else {
System.out.println("Nome igual não encontrado");
}
}
}

//exercício 4- senha secreta

import java.util.Scanner;
public class SenhaSecreta {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String senhaCorreta = "python123"; // Defina a senha secreta
boolean senhaCorretaInserida = false;
while (!senhaCorretaInserida) {
System.out.print("Digite a senha: ");
String senhaInserida = scanner.nextLine();
if (senhaInserida.equals(senhaCorreta)) {
senhaCorretaInserida = true;
System.out.println("Senha correta! Acesso permitido.");
} else {
System.out.println("Senha incorreta. Tente novamente.");
}
}
scanner.close();
}
}