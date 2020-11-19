$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CadastroAuto.feature");
formatter.feature({
  "name": "Cadastro Seguro Veiculo",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.background({
  "name": "Usuário acessa tela de cadastro de seguro veiculo",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que o usuário abriu navegador",
  "keyword": "Dado "
});
formatter.match({
  "location": "stepFiles.CadastroAutoSteps.que_o_usuário_abriu_navegador()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acessar a url do sistema",
  "keyword": "Quando "
});
formatter.match({
  "location": "stepFiles.CadastroAutoSteps.acessar_a_url_do_sistema()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sistema deve apresentar a tela de cadastro de seguro veiculo",
  "keyword": "Então "
});
formatter.match({
  "location": "stepFiles.CadastroAutoSteps.sistema_deve_apresentar_a_tela_de_cadastro_de_seguro_veiculo()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cadastrar Veiculo na aplicaçãom de seguro auto",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@teste1"
    }
  ]
});
formatter.step({
  "name": "que Preencheu o formulario na aba Vehcile Data",
  "keyword": "Dado "
});
formatter.match({
  "location": "stepFiles.CadastroAutoSteps.que_Preencheu_o_formulario_na_aba_Vehcile_Data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preencheu o formulario na aba Insurante Data",
  "keyword": "E "
});
formatter.match({
  "location": "stepFiles.CadastroAutoSteps.preencheu_o_formulario_na_aba_Insurante_Data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preencheu o formulario na aba Product Data",
  "keyword": "E "
});
formatter.match({
  "location": "stepFiles.CadastroAutoSteps.preencheu_o_formulario_na_aba_Product_Data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preencheu o formulario na aba Select Price Option",
  "keyword": "E "
});
formatter.match({
  "location": "stepFiles.CadastroAutoSteps.preencheu_o_formulario_na_aba_Select_Price_Option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preencheu p formulario na aba Sen quote",
  "keyword": "E "
});
formatter.match({
  "location": "stepFiles.CadastroAutoSteps.preencheu_p_formulario_na_aba_Sen_quote()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Acionou a opção Concluir",
  "keyword": "Quando "
});
formatter.match({
  "location": "stepFiles.CadastroAutoSteps.acionou_a_opção_Concluir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sistema deve apresentar mensagem de sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "stepFiles.CadastroAutoSteps.sistema_deve_apresentar_mensagem_de_sucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "registra as informações preenchidas no sistema seguro auto",
  "keyword": "E "
});
formatter.match({
  "location": "stepFiles.CadastroAutoSteps.registra_as_informações_preenchidas_no_sistema_seguro_auto()"
});
formatter.result({
  "status": "passed"
});
});