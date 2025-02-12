import fs from "fs";
import path from "path";
import tratarErros from "./erros/funcoesErro.js";
import { quebraParagrafos } from "./app.js";
import { montaSaidaArquivo } from "./helpers.js";
import { Command } from "commander";
import chalk from "chalk";

const program = new Command();
program
  .version("0.0.1")
  .option("-t,--texto <string>", "caminho do texto a ser processado")
  .option(
    "-d,--destino <string>",
    "caminho da pasta onde salvar o arquivo de resultados"
  )
  .action((options) => {
    const { texto, destino } = options;

    if (!texto || !destino) {
      console.error(
        chalk.red("erro: favor insrir caminho de origme e destino")
      );
      program.help();
      return;
    }

    const caminhoTexto = path.resolve(texto);
    const caminhoDestino = path.resolve(destino);

    try {
      procerssaArquivo(caminhoTexto, caminhoDestino);
      console.log(chalk.green("Texto processado com sucesso"));
    } catch (erro) {
      console.log("ocorreu um erro no processamento", erro);
    }
  });

program.parse();

function procerssaArquivo(texto, destino) {
  fs.readFile(texto, "utf-8", (err, texto) => {
    try {
      if (err) {
        throw err;
      }
      const listaPalavras = quebraParagrafos(texto);
      criaESalvaArquivo(listaPalavras, destino);
    } catch (err) {
      tratarErros(err);
    }
  });
}

//criar um função para gerar um arquivo em txt
async function criaESalvaArquivo(listaPalavras, endereco) {
  const arquivoNovo = `${endereco}/resultado.txt`;
  const textoPalavras = montaSaidaArquivo(listaPalavras);

  try {
    await fs.promises.writeFile(arquivoNovo, textoPalavras);
    console.log("Arquivo criado com sucesso!!");
  } catch (erro) {
    throw erro;
  }
}
