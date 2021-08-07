[#TOC]

# S.O.L.I.D: 5 principios para POO

SOLID sao 5 principios da POO que facilitam o desenvolvimento de aplicacoes garantindo uma boa manutenabilidade

    S: Single Responsibility  
    O: Open-Closed Principle 
    L: Liskov Substituition principle 
    I: Interface Segregation Principle    
    D: Dependency Inversion Principle


## 1- S: Single Responsibility

    O principio da responsabilidade unica defende que cada classe tenha uma e somente uma responsabilidade; Classes com mais de uma responsabilidade em algum momento vao acabar tornando o sistema dificil de manter.

## 2- O: Open-Closed Principle 

    Objetos ou entidades devem estar abertos para extensão, mas fechados para modificação, ou seja, quando novos comportamentos e recursos precisam ser adicionados no software, devemos estender e não alterar o código fonte original.

## 3- L: Liskov Substituition principle

    O princípio da substituição de Liskov foi   introduzido por Barbara Liskov em sua     conferência “Data abstraction” em 1987;

    Este principio defende que, se S é um subtipo de T, então os objetos do tipo T, em um programa, podem ser substituídos pelos objetos de tipo S sem que seja necessário alterar as propriedades deste programa.

## Interface Segregation Principle

    Princípio da Segregação da Interface — Uma classe não deve ser forçada a implementar interfaces com métodos que não irão utilizar.

    Este principio defende que deve se dar preferencia a multiplas interfaces com metodos especificos do que a uma unica interface com metodos genericos.

## Dependency Inversion Principle

    DIP, um módulo de alto nível não deve depender de módulos de baixo nível, ambos devem depender da abstração. Exemplo: Se uma classe utiliza conexao com DB, deve se criar dependencia de uma interface de conexao e nao de uma implementacao.