# CInterativo
Aplicação que permite que os alunos possam avaliar  os professores e publicar sua opinião anonimamente.

## Método Ágil
O método ágil escolhido pelo grupo foi o kanban.

## Project Model Canvas
![PMC](https://user-images.githubusercontent.com/64909008/158611801-ef1bf08a-6df8-403d-a471-5906d28eb428.png)(https://docs.google.com/presentation/d/1YBN_1IKkRhObODS4tK5xIKE04G5Fl9pxkn7CJPvqZU4/edit?usp=sharing)
## Product Backlog
### Histórias de Usuários
#### Eu, como aluno gostaria de
*   Poder avaliar os professores
*   Ver a avaliação que outros alunos fizeram dos professores

#### Eu, como professor gostaria de
*   Receber o feedback do alunos(saber no que posso melhorar)
*   Ver a meu desempenho em relação a outros professores

#### Eu, como gestor gostaria de
*   Ver a avaliação que os alunos fizeram dos professores
-----------------------------------------------------------------
![Captura de tela de 2022-03-16 11-57-37](https://user-images.githubusercontent.com/64909008/158619813-9f884dba-e3ac-4408-8a33-fab7d2407a0c.png)(https://trello.com/b/ZL8Ah9KN/cinterativo)

## UML

### Diagrama de casos de uso
![Captura de tela de 2022-03-22 10-44-55](https://user-images.githubusercontent.com/64909008/159497478-c5ae98af-a7a5-4624-bf84-780426150347.png)
(https://cloud.smartdraw.com/share.aspx/?pubDocShare=20602831C89C80D332CFFD501C8B0CEDE41)

### Diagrama de classes
*   Controller(classe criada para funções acima das pessoa)
*   Pessoa
*   Herdam de Pessoa -> Professor, Gestor e Aluno
*   Atributos
  *   Professor -> nome, matŕicula, usuário, senha, notaAvaliacao
  *   Aluno -> nome, matŕicula, usuário, senha 
  *   Gestor -> nome, matŕicula, usuário, senha
*   Métodos
  *   Professor -> verRanking, verAvaliacao, interagir
  *   Aluno -> verRanking, avaliarProfessor, verAvaliacao, interagir
  *   Gestor -> verRanking, verAvaliacao    
*   Controller
  *   Métodos
    *   Rankear
    *   salvar
    *   gerenciarInteracao
