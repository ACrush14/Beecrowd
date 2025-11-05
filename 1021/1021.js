var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var num = parseFloat(lines.shift());

var valor = Math.floor(num * 100 + 0.5);

var notas = [10000, 5000, 2000, 1000, 500, 200];
var moedas = [100, 50, 25, 10, 5, 1];

console.log("NOTAS:");
for (var i of notas) {
  var qtde = Math.floor(valor / i);
  valor = valor % i;

  console.log(qtde + " nota(s) de R$ " + (i / 100).toFixed(2));
}

console.log("MOEDAS:");
for (var i of moedas) {
  var qtde = Math.floor(valor / i);
  valor = valor % i;

  console.log(qtde + " moeda(s) de R$ " + (i / 100).toFixed(2));
}
