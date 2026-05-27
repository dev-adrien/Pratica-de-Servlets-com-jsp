Atividade

A arquitetura de uma aplicação Java Web utilizando Servlets e JSPs é baseada no modelo MVC (Model-View-Controller). Explique o papel de cada componente (Model, View e Controller) nessa arquitetura e como eles interagem entre si para processar as requisições dos usuários e gerar as respostas adequadas.
O protocolo HTTP é baseado em um modelo de requisição-resposta. Explique como as requisições HTTP são processadas em uma aplicação Java Web utilizando Servlets, desde o momento em que o usuário envia uma requisição até o momento em que a resposta é gerada e enviada de volta ao cliente. Inclua detalhes sobre o ciclo de vida de um Servlet, como ele lida com os diferentes tipos de requisições (GET, POST, etc.) e como podemos configurar cabeçalhos HTTP, como o Content-Type.
Uma das características importantes de uma aplicação Web é a forma como o conteúdo de resposta é gerado e formatado. Com base nisso, no ecosistema de desenvolvimento Java Web (com Servlets e JSPs), responda:
R:
O MVC separa as funções: o Model cuida dos dados e do que o sistema precisa fazer, a View (JSP) é a cara da página que o usuário vê, e o Controller (Servlet) é quem manda em tudo, recebendo o pedido do usuário, buscando os dados no Model e escolhendo qual página mostrar.
No HTTP, o servidor recebe o pedido, cria objetos que seguram as informações (req e resp) e passa para o Servlet. O Servlet nasce com o init, trabalha (faz o que precisa no doGet ou doPost) no service e morre no destroy. Pra configurar o tipo de conteúdo, você só usa o comando response.setContentType no código.

a) Explique como arquivos estáticos (como HTML, CSS e JavaScript) e arquivos dinâmicos (como JSPs) são utilizados em uma aplicação Java Web para gerar o conteúdo de resposta.
R: Arquivos estáticos são entregues pelo servidor exatamente como estão, sem passar por processamento. Já os arquivos jsp são processados pelo servidor, que executa o código Java dentro deles para criar um HTML na hora, que só então é enviado para o usuário.

b) Qual pasta do projeto é geralmente usada para armazenar arquivos estáticos? Por padrão, os arquivos estáticos, dentro dessa pasta, são acessíveis publicamente?
R: Na webapp. eles são públicos e qualquer um pode acessar digitando o link direto.

c) Qual pasta do projeto é geralmente usada para armazenar arquivos dinâmicos (JSPs), que representam a camada de visualização? Por padrão, os arquivos JSPs, dentro dessa pasta, são acessíveis publicamente?
R: No diretório servlets que é padrão criar dentro do projeto java. Exemplo: src/main/java/com.exemplo.servlets.
