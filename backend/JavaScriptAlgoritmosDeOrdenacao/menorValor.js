const livros = require("./listaLivros");

function menorValor(arryProdutos, posicaoInicial) {
  let maisBarato = posicaoInicial;

  for (let atual = posicaoInicial; atual < arryProdutos.length; atual++) {
    if (arryProdutos[atual].precos < arryProdutos[maisBarato].precos) {
      maisBarato = atual;
    }
  }

  return maisBarato;
}

module.exports = menorValor;
