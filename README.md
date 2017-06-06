# LPOO_FinalProject

Carolina da Ponte Rocha 201304026 up201304026@fe.up.pt

Manuel Fernando Sequeira Pereira 201205052 ee12314@fe.up.pt

## Architecture Design
### UML
![Screenshot](UML.png)


### Design Patterns
#### Singleton Pattern
É usada na package "mySQLConnection" para as classes da package server não criarem várias instâncias de modo a fazerem vários logIns no MySQL e evitar colisões de acesso à  base de dados.

## GUI Design

A janela inicial é usada para o utilizador fazer log in no chat ou sign in caso não se encontre registado.

![Screenshot](NewMockup1.png)

Esta janela é a que resulta da escolha do botão Sign In, na janela inicial. Aqui, o utilizador poderá escolher um username, email e password com que deseja ser identificado.

![Screenshot](NewMockup2.png)

Esta janela é a janela principal do chat. É possivel fazer pesquisa de amigos, visualizar a lista de amigos online, selecionar o amigo e enviar-lhe mensagens, assim como ver o histórico de mensagens à medida que estas são enviadas. Também é possível fazer log out ou alterar informações da conta (settings). 

![Screenshot](NewMockup3.png)

Ao pesquisar por amigos, abre esta janela com uma lista de possiveis amigos. Será possível selecionar o nome desejado e adicionar à lista de amigos.

![Screenshot](NewMockup4.png)

Ao selecionar Settings será possível editar qualquer informação relacionada com o utilizador.

![Screenshot](NewMockup5.png)

No pdf ChatPrototype encontra-se o protótipo com os links entre as páginas.

## Test Design
#### Registo de cliente 
Fazer um registo e ir procurar à base de dados se foi registado com sucesso;

#### LogIn 
Fazer logIn e verificar se na base de dados ficou online;

#### Registo de cliente com mesmo email 
Deve dar um erro de que já existe um cliente com o mesmo email;

#### LogOut 
Fazer log out e ver se na base de dados o user ficou a offline;

#### Enviar e receber mensagens 
Enviar mensagem para si próprio e verificar que recebe;

#### Procura de amigos com mesmo nome 
Verificar que user não pode ser amigo de si mesmo;
