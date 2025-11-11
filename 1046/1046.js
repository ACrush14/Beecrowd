var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var valores = lines[0].split(" ");

var inicio = parseInt(valores[0]);
var fim = parseInt(valores[1]);
var total = 0;

if (inicio == fim) {
  total = 24;
} else if (inicio > fim) {
  fim = fim + 24;
  total = fim - inicio;
} else {
  total = fim - inicio;
}

console.log("O JOGO DUROU " + total + " HORA(S)");
