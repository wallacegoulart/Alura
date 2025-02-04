import fs from 'fs';
import tratarErros from './erros/funcoesErro.js';
import {quebraParagrafos} from './app.js'


const caminhoArquivo = process.argv;
const link = caminhoArquivo[2];

fs.readFile(link,'utf-8',(err,texto) => {
    try{
        if(err){throw err;}
        quebraParagrafos(texto);
    } catch(err){
        tratarErros(err); 
    }     
})