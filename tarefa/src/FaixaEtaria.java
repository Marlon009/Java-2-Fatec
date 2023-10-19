//Exercício 1 - Array de Números Pares
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // Cria um objeto Scanner para entrada do usuário

        Random rand = new Random(); // Cria um objeto Random para gerar números aleatórios
        int[] aleatorios = new int[10]; // Declara um array de inteiros com tamanho 10 para armazenar os números aleatórios

        // Gera 10 números aleatórios entre 0 e 99 e armazena no array 'aleatorios'
        for (int c = 0; c < 10; c++) { // Corrigi o uso do operador <= para <
            aleatorios[c] = rand.nextInt(100);
        }

        // Itera pelo array 'aleatorios' e verifica se cada número é par
        for (int c = 0; c < 10; c++) { // Corrigi o uso do operador <= para <
            if (aleatorios[c] % 2 == 0) { // Se o número for par
                System.out.println(aleatorios[c]); // Imprime o número par
            }
        }
    }
}

//Exercício 2 - Adivinhe o Número
import java.util.Random;
import java.util.Scanner;
public class JogoAdivinhacao {
public static void main(String[] args) {
Random rand = new Random(); // Cria um objeto Random para gerar números aleatórios
int numeroAleatorio = rand.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
int tentativas = 0; // Inicializa o contador de tentativas
Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada d
o usuário
System.out.println("Bem-vindo ao jogo de adivinhação!");
System.out.println("Tente adivinhar o número entre 1 e 100.");
while (true) { // Inicia um loop que continuará até o usuário acertar o número
System.out.print("Digite seu palpite: ");
int palpite = scanner.nextInt(); // Lê o palpite do usuário
tentativas++; // Incrementa o contador de tentativas
if (palpite < numeroAleatorio) {
System.out.println("Tente um número mais alto."); // Dá uma dica se o palp
ite for baixo
} else if (palpite > numeroAleatorio) {
System.out.println("Tente um número mais baixo."); // Dá uma dica se o pal
pite for alto
} else {
System.out.println("Parabéns! Você acertou o número em " + tentativas + "
tentativas.");
break; // Se o palpite estiver correto, exibe uma mensagem e sai do loop
}
}
scanner.close(); // Fecha o objeto Scanner quando o jogo termina
}
}

//Exercício 3 - Média de Valores

import java.util.Random;
public class MediaArrayAleatorio {
public static void main(String[] args) {
Random rand = new Random(); // Cria um objeto Random para gerar números aleatórios
int[] numeros = new int[20]; // Declara um array de inteiros com tamanho 20
// Preenche o array com 20 números aleatórios entre 1 e 100
for (int i = 0; i < numeros.length; i++) {
numeros[i] = rand.nextInt(100) + 1;
}
int soma = 0; // Variável para armazenar a soma dos números no array
//Calcula a soma dos números no array
for (int i = 0; i < numeros.length; i++) {
soma += numeros[i];
}
double media = (double) soma / numeros.length; // Calcula a média
//Imprime os números do array
System.out.println("Números no array:");
for (int i = 0; i < numeros.length; i++) {
System.out.print(numeros[i] + " ");
}
//Imprime a média
System.out.println("\\nMédia dos números: " + media);
}
}

//Exercício 4 - Número Máximo e Mínimo

import java.util.Random;
public class MaiorMenorArrayAleatorio {
public static void main(String[] args) {
Random rand = new Random(); // Cria um objeto Random para gerar números aleatórios
int[] numeros = new int[15]; // Declara um array de inteiros com tamanho 15
// Preenche o array com 15 números aleatórios entre 1 e 100
for (int i = 0; i < numeros.length; i++) {
numeros[i] = rand.nextInt(100) + 1;
}
int maior = numeros[0]; // Inicializa a variável 'maior' com o primeiro valor do a
rray
int menor = numeros[0]; // Inicializa a variável 'menor' com o primeiro valor do a
rray
// Encontra o maior e o menor valor no array
for (int i = 1; i < numeros.length; i++) {
if (numeros[i] > maior) {
maior = numeros[i]; // Atualiza 'maior' se o valor atual for maior
} else if (numeros[i] < menor) {
menor = numeros[i]; // Atualiza 'menor' se o valor atual for menor
}
}
//Imprime os números do array
System.out.println("Números no array:");
for (int i = 0; i < numeros.length; i++) {
System.out.print(numeros[i] + " ");
}
//Imprime o maior e o menor valor
System.out.println("\\nMaior valor: " + maior);
System.out.println("Menor valor: " + menor);
}
}

//Exercício 5 - Contando Ímpares
import java.util.Random;
public class ContagemNumerosImpares {
public static void main(String[] args) {
Random rand = new Random(); // Cria um objeto Random para gerar números aleatórios
int[] numeros = new int[30]; // Declara um array de inteiros com tamanho 30
// Preenche o array com 30 números aleatórios entre 1 e 100
for (int i = 0; i < numeros.length; i++) {
numeros[i] = rand.nextInt(100) + 1;
}
int contadorImpares = 0; // Inicializa o contador de números ímpares
// Itera pelo array e conta quantos números são ímpares
for (int i = 0; i < numeros.length; i++) {
if (numeros[i] % 2 != 0) {
contadorImpares++; // Incrementa o contador se o número for ímpar
}
}
// Imprime os números do array
System.out.println("Números no array:");
for (int i = 0; i < numeros.length; i++) {
System.out.print(numeros[i] + " ");
}
// Imprime a contagem de números ímpares
System.out.println("\\nQuantidade de números ímpares: " + contadorImpares);
}
}

//Exercício 6 - Reversão de Array

import java.util.Random;
public class ArrayOrdemReversa {
public static void main(String[] args) {
Random rand = new Random(); // Cria um objeto Random para gerar números aleatórios
int[] numeros = new int[10]; // Declara um array de inteiros com tamanho 10
// Preenche o array com 10 números aleatórios entre 1 e 100
for (int i = 0; i < numeros.length; i++) {
numeros[i] = rand.nextInt(100) + 1;
}
// Imprime os números do array na ordem original
System.out.println("Números no array (ordem original):");
for (int i = 0; i < numeros.length; i++) {
System.out.print(numeros[i] + " ");
}
// Imprime os números do array em ordem reversa
System.out.println("\\nNúmeros no array (ordem reversa):");
for (int i = numeros.length - 1; i >= 0; i--) {
System.out.print(numeros[i] + " ");
}
}
}

//Exercício 7 - Frequência de Números

import java.util.Random;
public class ContagemNumeros {
public static void main(String[] args) {
Random rand = new Random(); // Cria um objeto Random para gerar números aleatórios
int[] numeros = new int[50]; // Declara um array de inteiros com tamanho 50
// Preenche o array com 50 números aleatórios entre 1 e 10
for (int i = 0; i < numeros.length; i++) {
numeros[i] = rand.nextInt(10) + 1;
}
// Inicializa um array para contar a ocorrência de cada número (de 1 a 10)
int[] contagem = new int[10];
// Conta quantas vezes cada número aparece no array
for (int i = 0; i < numeros.length; i++) {
int numeroAtual = numeros[i];
contagem[numeroAtual - 1]++; // Incrementa a contagem do número atual
}
// Imprime a contagem de cada número

for (int i = 0; i < contagem.length; i++) {
int numero = i + 1;
System.out.println("Número " + numero + " aparece " + contagem[i] + " veze
s.");
}
}
}

//Exercício 8 - Preenchendo o Array

import java.util.Scanner;
public class ValorMaisFrequente {
public static void main(String[] args) {
Scanner scanner = new Scanner([System.in](http://system.in/));
int[] numeros = new int[10]; // Declara um array de inteiros com tamanho 10
// Solicita ao usuário que insira 10 números
System.out.println("Digite 10 números:");
// Preenche o array com os números inseridos pelo usuário
for (int i = 0; i < 10; i++) {
System.out.print("Número " + (i + 1) + ": ");
numeros[i] = scanner.nextInt();
}
scanner.close(); // Fecha o objeto Scanner
int valorMaisFrequente = 0;
int frequenciaMaisFrequente = 0;
// Itera pelo array e encontra o valor mais frequente
for (int i = 0; i < numeros.length; i++) {
int valorAtual = numeros[i];
int frequenciaAtual = 1;
// Verifica a frequência do valor atual no restante do array
for (int j = i + 1; j < numeros.length; j++) {
if (numeros[j] == valorAtual) {
frequenciaAtual++;
}
}
// Se a frequência atual for maior que a frequência mais frequente encontrada
até agora
if (frequenciaAtual > frequenciaMaisFrequente) {
valorMaisFrequente = valorAtual;
frequenciaMaisFrequente = frequenciaAtual;
}
}
//Imprime o valor mais frequente e sua frequência
System.out.println("O valor mais frequente é: " + valorMaisFrequente);
System.out.println("Frequência: " + frequenciaMaisFrequente);
}
}


//Exercício 9 - Busca Linear

import java.util.Random;
import java.util.Scanner;
public class BuscaNumeroNoArray {
public static void main(String[] args) {
Random rand = new Random(); // Cria um objeto Random para gerar números aleatórios
int[] numeros = new int[25]; // Declara um array de inteiros com tamanho 25
// Preenche o array com 25 números aleatórios entre 1 e 100
for (int i = 0; i < numeros.length; i++) {
numeros[i] = rand.nextInt(100) + 1;
}
Scanner scanner = new Scanner(System.in);
// Solicita ao usuário que insira um número
System.out.print("Digite um número para buscar no array: ");
int numeroBusca = scanner.nextInt();
boolean encontrado = false;
// Verifica se o número de busca está no array
for (int i = 0; i < numeros.length; i++) {
if (numeros[i] == numeroBusca) {
encontrado = true;
break; // Se encontrado, sai do loop
}
}
// Informa ao usuário o resultado da busca
if (encontrado) {
System.out.println("O número " + numeroBusca + " foi encontrado no array.");
} else {
System.out.println("O número " + numeroBusca + " não foi encontrado no arra
y.");
}
scanner.close(); // Fecha o objeto Scanner
}
}


//Exercício 10 - Simulação de Jogo de Dados

import java.util.Random;
public class SimulacaoLancamentoDados {
public static void main(String[] args) {
Random rand = new Random(); // Cria um objeto Random para gerar números aleatórios
int totalLancamentos = 100; // Total de lançamentos
int contagemSete = 0; // Inicializa a contagem de soma igual a 7
for (int i = 0; i < totalLancamentos; i++) {
// Simula o lançamento de dois dados (cada dado de 1 a 6)
int dado1 = rand.nextInt(6) + 1;
int dado2 = rand.nextInt(6) + 1;
int somaDados = dado1 + dado2;
// Verifica se a soma dos dados é igual a 7
if (somaDados == 7) {
contagemSete++;
}
}
// Imprime o resultado
System.out.println("Resultados dos lançamentos:");
System.out.println("Total de lançamentos: " + totalLancamentos);
System.out.println("Quantidade de vezes que a soma foi igual a 7: " + contagemSet
e);
}
}
