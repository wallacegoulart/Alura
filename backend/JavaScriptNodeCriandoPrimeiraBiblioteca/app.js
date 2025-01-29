const fs = require('fs');

const caminhoArquivo = process.argv;
const link = caminhoArquivo[2];

fs.readFile(link,'utf-8',(err,texto) => {
    if(err){throw err;}
    console.log(texto);
})

console.log(link);