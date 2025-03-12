const livros = require("./listaLivros");
const menorValor = require("./menorValor");

for (let atual = 0; atual < livros.length - 1; atual++) {
  let menor = menorValor(livros, atual);

  let livrosAtual = livros[atual];
  let livrosMenorPreco = livros[menor];

  livros[atual] = livrosMenorPreco;
  livros[menor] = livrosAtual;
}

console.log(livros);
