//1) Primeiro problema (video 01)
// pegar o texto splitando pelo espaço e jogar num array 
// pegar essa palavra e jogar dentro de um objeto, se repetir ele conta 

//2) Segundo problema (video 02)
// pensar num jeito para quebrar o texto em paragrafos para nao colocar no meu dic o '\n'
// pegar todo texto tirar a diferenciação de maiuscula e minuscula

//3) Terceiro problema (video 03)
// retirar os caracteres especiais 
// retirar as plavras curtas ( a, o ,e )


function limparPalavra(palavra){
    return  palavra.replace(/[.,\/#!$%\^&\*;:{}=\-_`~()]/g ,'');
}


export function quebraParagrafos(texto){
    const listaParagrafos = texto.toLowerCase().split('\n');
    const novoDicPalavras =  listaParagrafos.flatMap((paragrafos) =>{
        if(!paragrafos){return[]};
        return criacaoObejtoContandoPalavras(paragrafos); 
    });
    console.log( novoDicPalavras)
}


function criacaoObejtoContandoPalavras(texto){
    const listaPalavras = texto.split(' ');
    const dicPalavras = {};
    listaPalavras.forEach(palavra => {
        if(palavra.length >3){
            const palavraLimpa_02 = limparPalavra(palavra)
            dicPalavras[palavraLimpa_02] = (dicPalavras[palavraLimpa_02] || 0)+1;
        };
    })

    return dicPalavras ;
}