import fs from 'fs';
import tratarErros from './erros/funcoesErro.js';
import {quebraParagrafos} from './app.js';
import { montaSaidaArquivo } from './helpers.js';

const caminhoArquivo = process.argv;
const link = caminhoArquivo[2];
const endereco = caminhoArquivo[3]


fs.readFile(link,'utf-8',(err,texto) => {
    try{
        if(err){throw err;}
        const listaPalavras = quebraParagrafos(texto);
        criaESalvaArquivo(listaPalavras,endereco);
    } catch(err){
        tratarErros(err); 
    }     
})

//criar um função para gerar um arquivo em txt
async function criaESalvaArquivo(listaPalavras,endereco){

    const arquivoNovo = `${endereco}/resultado.txt`;
    const textoPalavras = montaSaidaArquivo(listaPalavras);

    try{
        await fs.promises.writeFile(arquivoNovo, textoPalavras);
        console.log("Arquivo criado com sucesso!!");
    }catch(erro){
        throw erro;

    }
}