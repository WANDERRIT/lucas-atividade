function calcularFrete(){

let entrega = prompt("digite o valor da sua entrega");
const freteJdHelena = 12;
const freteJdNoemia = 10;
const freteJdMaia = 15;

let entregajdHelena =  + entrega + freteJdHelena 
console.log(entregajdHelena);

let entregajdNoemia = + entrega + freteJdNoemia;
console.log(entregajdNoemia);

let entregaJdMaia = + entrega + freteJdMaia;
console.log(entregaJdMaia);
const id = document.getElementById('id').innerHTML = "o frete para jardim Helena é " + entregajdHelena;
const id2 = document.getElementById('id2').innerHTML = "o frete para jardim Noemia é " + entregajdNoemia;
const id3 = document.getElementById('id3').innerHTML = "o frete para jardim Maia é " + entregaJdMaia;
}
calcularFrete();
