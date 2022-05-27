## Exercícios de POO

1- Crie um programa onde um entregador pergunta para alguns Moradores se no imóvel
  tem  ou  não  cachorro...Se  não  tiver  cachorro,  ele    “Entrega  a  Correspondência” ,  se
  tiver  cachorro  ele  “Não  Entrega  a  Correspondência”.  Por  f im  mostre  o  resultado  de
  quantas correspondências foram entregues em casas de número ímpar.

Regras:  
• É obrigatório criar uma classe para representar Moradores.  
• A classe deverá possuir dois dados privados: telefone e número da residência.  
•  A  classe  deverá  possuir  métodos  de  acesso  para  permitir  que  o  usuário
armazene/leia os dados dos dois dados privados. 

2- Faça um programa que apresente o menu de opções a seguir, que permita ao usuário
  escolher  a  opção  desejada,  receba  os  dados  necessários  para  executar  e  mostrar  o
  resultado.

Menu de opções:
1.  Idade
2. IMC
3.  Sair                            .
    Digite a opção desejada:

•  Na opção 1: recebe o ano de nascimento e o ano atual e mostra a idade.
•  Na opção 2: recebe altura e peso e faz o cálculo matemático.
• Na opção 3: sair do programa.

Verifique a possibilidade de opção inválida, mostrando uma mensagem.

3- Em  uma  loja  de  venda de  peças  impressas  em  3D  tem  uma  política  de  desconto.  Os
descontos iniciam acima dos R$300. A cada R$100 acima dos R$300 o cliente ganha
1% de desconto cumulativo até 20%.

Ex: R$300 = 1% | R$400 = 2% ...etc...

Crie um programa onde exiba essa tabela de descontos no seguinte formato:

ValordaCompra – Porcentagem de desconto – Valor Final 

4- A GFT quer manter o registro da vida acadêmica de todos os seus colaboradores, de
modo  que o  m odelo deve  contemplar o  registro das  seguintes  informações,  de  forma
incremental:
Para o colaborador que não estudou, apenas o nome e matrícula;
Para o colaborador que concluiu o ensino básico, adiciona a escola;
Para o colaborador que concluiu o ensino superior, adiciona a universidade.

Apresente a implementação, considerando os conceitos de encapsulamento, herança
e polimorfismo do paradigma de POO. 

5- Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as
seguintes operações:
void armazenaPessoa(String nome, int idade, float altura);
void removePessoa(String nome);
int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da
agenda.

6- Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares
no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão
presentes nele. A classe deve também disponibilizar os seguintes métodos:
Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de
andares no prédio (os elevadores sempre começam no térreo e vazio);
Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver
espaço);
Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);
Sobe : para subir um andar (não deve subir se já estiver no último andar);
Desce : para descer um andar (não deve descer se já estiver no térreo);
Encapsular todos os atributos da classe (criar os métodos set e get).

7-Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e
trocar os canais da televisão. O controle de volume permite:
* aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
* aumentar e diminuir o número do canal em uma unidade
* trocar para um canal indicado;
* consultar o valor do volume de som e o canal selecionado.
