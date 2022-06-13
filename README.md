# Cantina do Ifal

Integrantes do grupo: Fernando Jorge, Normando Vinícius, Eliel Cirino e Vinícius Santos Germano. 

## Requisitos Funcionais

<ul>
  <li>Guardar a informação dos itens do estoque da cantina (nome, descrição, preço de compra, preço de venda e
quantidade comprada, quantidade vendida)</li>
  <li>Permitir que o administrador da cantina cadastre novos itens no estoque, ou adicione novas quantidadea itens já
existentes</li>
  <li>Não permitir que sejam cadastrados itens com preços inválidos, inclusive preço devenda menor que o preço de
compra</li>
  <li>Não permitir que a quantidade de itens disponíveis seja inválida</li>
  <li>Dar baixa nos itens vendidos do estoque</li>
  <li>Mostrar um resumo dos itens e suas quantidades disponíveis ordenado pela descrição ou quantidade disponível, a
critério do usuário</li>
  <li>Mostrar resumo dos itens com quantidade baixa no estoque(abaixo de 50 itens)</li>
  <li>Mostrar resumo do lucro/prejuízo de acordo com a baixa dos produtos no estoque</li>
</ul>

## Como rodar?
Vá em config.java do pacote database e ajuste os dados do banco de dados para si. Para ter o banco de dados do projeto, você pode baixar ele aqui e importar no phpmyadmin: https://github.com/nandowastaken/estoque
Depois use o terminal para usar o programa. Da interface, somente o login funciona. 

## Desenvolvimento do projeto
Os requisitos funcionais (cadastrar, vender, resumos, acrescentar) foram cumpridos. A interface e a conexão também estão ok, entretanto a interface do funcionário não tem funcionalidade (é necessário usar o terminal). 
