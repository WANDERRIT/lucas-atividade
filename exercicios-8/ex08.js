
function mercadoFerreirinha(){
let totalCompra = prompt("total da sua compra");

let parcelas = totalCompra / 6;

if(parcelas < 20.00){
console.log("Não é possível parcelar a compra com o valor da parcela abaixo de 20")
const id = document.getElementById('id').innerHTML = "sua com deu " + totalCompra + " logo não é possivel parcelar pois a parcela seria abaixo de 20R$ " + parcelas;

}else{
    console.log(" sua compra pode ser parcelada em 6x de " + parcelas)
    const id = document.getElementById('id').innerHTML = "sua compra pode ser parcelada em 6x de " + parcelas;

}



}
mercadoFerreirinha();