const livros = require("./listaLivros");

let maisBarato = 0;

for (let atual = 0; atual < livros.length; atual++) {
  if (livros[atual].precos < livros[maisBarato].precos) {
    maisBarato = atual;
  }
}

console.log(
  `O livro ${livros[maisBarato].titulo} é o mais barato ${livros[maisBarato].precos}`
);
