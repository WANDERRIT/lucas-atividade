function concessionaria(){
    let nome ="wander"
console.log(nome)
let modelo = prompt("digite o modelo:")
let preco = prompt("preço do veiculo:")
let carro = prompt("digite o nome do carro:")

// não sei retirar casas decimais
if(modelo !="" & preco != 0 & carro !=""){
    let entrada = 0.30 * preco
    let parcela = preco / 12
console.log(carro + " tem entrada de: "+ entrada + " e pode ser parcelado em 12x de: " + parcela)
const id = document.getElementById('id').innerHTML = carro + " tem entrada de: "+ entrada + " e pode ser parcelado em 12x de: " + parcela

}

}
concessionaria();
