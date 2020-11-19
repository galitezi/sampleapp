#language: pt


Funcionalidade: Cadastro Seguro Veiculo 

Contexto: Usuário acessa tela de cadastro de seguro veiculo 
Dado que o usuário abriu navegador
Quando acessar a url do sistema  
Então sistema deve apresentar a tela de cadastro de seguro veiculo


@teste1
  Cenário: Cadastrar Veiculo na aplicaçãom de seguro auto
    Dado que Preencheu o formulario na aba Vehcile Data 
    E Preencheu o formulario na aba Insurante Data 
    E Preencheu o formulario na aba Product Data 
    E Preencheu o formulario na aba Select Price Option 
    E Preencheu p formulario na aba Sen quote 
    Quando Acionou a opção Concluir
    Então  Sistema deve apresentar mensagem de sucesso
    E registra as informações preenchidas no sistema seguro auto 
    