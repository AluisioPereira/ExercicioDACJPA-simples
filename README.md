#2º EXERCÍCIO DAC 2016.1 - ADS-Cajazeiras.

## JPA

#### Versões do documento
Versão      |       Alteração               |    Data      |  Autor(es)
----------- | ----------------------------- | ------------ | --------------------------------
1.0.0       | Primeira versão do sistema    | 14/07/2016   | [Aluísio](https://github.com/AluisioPereira)


####FLUXO DE TRABALHO A SER SEGUIDO

#####1- clone esse repositório
<br>git clone https://github.com/AluisioPereira/ExercicioDACJPA-simples.git

#####2- Na pasta raiz do projeto, crie e cheque sua branch
<br>git checkout -b bNOME_DA_SUA_BRANCH

#####3- Mescle as outras branchs com a sua branch para que sua branch receba mudanças dos outros colaboradores:
<br>git merge origin/bALUISIO
<br>git merge origin/bLAERTON

#####4- Faça um push da sua branch
<br>git push origin bNOME_DA_SUA_BRANCH

#####5- Antes de implementar alguma funcionalidade, verifique as outras branchs possuem atualizações
<br>git pull origin bJOE
<br>git pull origin bLAERTON

#####6- Caso existam atualizações, novamente mescle as outras branchs a sua branch
<br>git merge origin/bJOE
<br>git merge origin/bLAERTON

#####7- Finalmente faça suas alterações e então comite e faça push
<br>git add .
<br>git commit -m "mensagem de commit"
<br>git push origin bNOME_DA_SUA_BRANCH

#####8- Sempre repita os passos 5 e 6 antes de realizar mudanças. Isso ajuda a evitar conflitos
