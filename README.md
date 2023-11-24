
# Aplicativo: Super-Herois.

Dupla: Carolina de Oliveira Alves e João Vitor Sátiro Pardin

(O aplicativo está na ramificação Master)

### Descrição do Aplicativo:

  O Aplicativo SUPER-HEROIS estará tratando sobre os Super-Heróis das empresas Marvel e DC comics, como as suas ações positivas influeciam em consequencias que afetam o meio ambiente, criando uma conexão entre herois e a sustentabilidade.

### Estrutura do APP:

1 Activity: Essa primeira tela será a capa do aplicativo sendo para o usuario a tela de apresentação visual, será incluido uma logo do APP com respectivas empresas, uma mensagem de "Seja Bem Vindo!" e abaixo um botão de "Continuar" para prosseguir com a apresentação.

2 Activity: Nesse momento o úsuario irá se deparar com o objetivo e "Quem somos" do APP, " Os SUPER-HEROIS são nossos protetores e amigos da vizinhaça, mas como os mesmos afetam o meio ambiente? A seguir veremos o porque a sustentabilidade e os herois estão conectados.". Logo abaixo no será incluido uma imagem de herois e o mesmo botão da Activity anterior para o usuario prosseguir.

3 Activity: Será apresentado uma pergunta "Qual time de herois irá escolher?", e um seletor de tema no qual o usuario deverá escolher as opções de MARVEL ou DC, o plano de fundo ficará neutro, possuirá um botão no canto superior para voltar a tela anterior.

4 Activity: Se a opção escolhida for "DC", aparecerá o menu de heróis da dc onde possuirá os nomes e uma imagem representativa dos heróis batman e aquaman, e um botão pra voltar caso o usuario quiser selecionar outro tema (3 activity).

5 Activity: Se a opção escolhida for "MARVEL", aparecerá o menu de heróis da marvel, onde possuírá os nomes e imagens representativas dos heróis homem de ferro e pantera negra, e um botão pra voltar caso o usuario quiser selecionar outro tema (3 activity).

4 Activity: O usuario ao escolher o heroi "Aquaman" nas opções da tela "DC", a tela do herói irá mostrar uma breve e pequena biografia do herói com uma foto do memso e logo abaixo um texto da sua relação com a sustentabilidade e uma imagem representativa dessa ação sustentavel e uma TextView para o usuario ao clicar será direcionado a um video hospedado no youtube contando sobre a história do heroi. O botão para voltar será incluido para poder selecionar o outro herói da dc (activity 4).

5 Activity: A tela do herói "Batman", possui uma breve biografia e foto do herói e logo abaixo a sua relação com a sustentabilidade e uma imagem para representat-la e uma TextView para o usuario ao clicar será direcionado a um video hospedado no youtube contando sobre a história do heroi. O botão para voltar para selecionar outro herói da dc (activity 4).

6 Activity: O usuário ao escolher o heroi "Homem de Ferro", nas opçoes da tela "MARVEL", a tela do herói irá apresentar, uma pequena biografia e foto do herói, a sua relação com a sustentabilidade com uma imagem representativa e uma TextView para o usuario ao clicar será direcionado a um video hospedado no youtube contando sobre a história do heroi. O botão para voltar para o usuario selecionar outro herói da marvel (activity 5).

7 activity: A tela do herói "Pantera Negra", possui uma breve biografia e foto do herói e logo abaixo a sua relação com a sustentabilidade com uma imagem representativa e uma TextView para o usuario ao clicar será direcionado a um video hospedado no youtube contando sobre a história do heroi. O botão para voltar para selecionar outro herói da marvel (activity 5).

Cada uma das interações do app são feitas com image buttons, que são usados para mudar de uma tela pra outra ou para voltar para a tela passada.

#### Atualização do aplicativo com sensores, mostraremos o passo a passo do código

![image](https://github.com/Carolinacss/AppNovo/assets/128003160/7de1422b-e6ed-44dd-ad5e-4667f76587dc)

Aqui acontece a importação das classes relacionadas a aplicação como sensores e áudios por exemplo.
<hr>

![image](https://github.com/Carolinacss/AppNovo/assets/128003160/7dfff2c4-31fe-49d1-8884-7ab39765d5a7)

Aqui acontece a declaração das variáveis para o gerenciamento específico como por exemplo do sensor ou áudio.
<hr>

![image](https://github.com/Carolinacss/AppNovo/assets/128003160/3058ac7d-72ba-4d5d-b374-fa50103c0a37)

Aqui acontece é a inicialização do layout das atividade de sensores e áudios.
<hr>

![image](https://github.com/Carolinacss/AppNovo/assets/128003160/5304c6a0-1631-4219-8e2d-8a780f5df9af)

Aqui acontece o cancelamento dos registros do SensorEventListener.
<hr>

![image](https://github.com/Carolinacss/AppNovo/assets/128003160/f9681f34-0c8d-478a-b9e6-20387a6bd018)

Aqui acontece o registramento das mudanças de movimento do hardware com base nos valores do acelerômetro.
<hr>

![image](https://github.com/Carolinacss/AppNovo/assets/128003160/c8768aeb-7092-41f7-867c-314b0e345947)

Aqui temos um método que toda vez que a precisão muda, o método realiza alguma ação mas como no código diz não necessário.
<hr>

![image](https://github.com/Carolinacss/AppNovo/assets/128003160/dce31728-8e6f-452c-bc73-821d9a7672af)

Aqui temos o botão para voltar de uma activity para outra com o intent, também temos uma textview que inicia a reprodução da estenção adicionada.
<hr>

### Vídeo do aplicativo 
https://github.com/Carolinacss/app/assets/127458533/794586e9-7a3c-4331-9b18-30f88a0e7a08

