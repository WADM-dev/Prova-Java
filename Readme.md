# Apontamentos da Prova

- Toda interface é por padrão public e abstract
- "Adicione métodos específicos para cada classe", isso significa que independente de uma classe estar abaixo de uma classe mãe, ela pode ter as suas particularidades
- Quando se trate de herança, eu sempre deixo na superclasse (classe mãe/pai) atributos e métodos que são compartilhados
- Considerem sempre o embelezamento do projeto de vocês: Identação (serve tanto para espaços e enters absurdos, quanto para código e chaves fora do lugar)


## ToDO

- Quando usar uma classe abstrata? Quando eu crio? Como utilizo?
- Pesquisar sobre camelCase, pascalCase, snakeCase
- Pesquisar InstanceOf

## Respostas:

O que é GIT?

R: Sistema de Controle de Versões.


O que é GITHUB?

R: É uma Ferramenta que gerencia projeto código na nuvem.


O que é Herança e como usar no JAVA?

R: Ela é um ferramenta que permite a criação de classes que herdam as características de outras Classes. Para usa-la chamar o método "Extends".


O que é polimorfismo e como usar no JAVA?

R: O polimorfismo permite que objetos de diferentes classes se comportem de maneira semelhante quando usados em um contexto comum. Para usa-lo chamar o método "implements".

O que é Capsulamento?

R: É a prática de esconder os detalhes de implementação de uma classe.

Quais são os modificadores de acesso do JAVA e seus niveis de permissão?

-Public é o atributo que todos tem acesso;
-Private é o atributo exclusivo da Classe;
-Default - Tem acesso ao modificador todas as classes dentro do mesmo PACKAGE (com a ausência de um modificador);
-Protected - O acesso é por pacote e por Herança;

Qual a sequência de comandos para entregar um código no repósitorio remoto?
- git init 
- git add . 
- git commit -m "first commit"
- git branch -M main
- git remote add origin "Link do repositorio"
- git push -u origin main

Quando usar uma classe abstrata? 

R: Quando eu preciso que as subclasses herdam um tipo específico de comportamento;

Quando eu crio? 

R: precisar ser criada for um conceito, ou seja, algo que possa ser refinado e espacializado, deve-se utilizar uma classe abstrata

Como utilizo?
1º Para ter um objeto de uma classe abstrata é necessário criar uma classe mais especializada herdando dela e então instanciar essa nova classe. 
Os métodos da classe abstrata devem então serem sobrescritos nas classes filhas.
2º Uma classe abstrata não pode ser instaciada, ela serve para ser herdada;
3º Ela adiciona uma comportamente específico para cada subclasse;


Pesquisar sobre camelCase, pascalCase, snakeCase
- camel case que consiste basicamente em iniciar com a primeira letra minúscula e a primeira de cada nova palavra subsequente em maiúscula.
- pascal case realiza a combinação de palavras colocando todas com a primeira letra maiúscula.
- snake case, onde basicamente utilizamos um underline no lugar do espaço para separar as palavras.

Pesquisar InstanceOf

- é um operador que permite testar se um objeto é uma instância de um tipo específico de uma class, subclass ou interface.


