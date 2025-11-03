var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var cardapio = {
  1: 4.0,
  2: 4.5,
  3: 5.0,
  4: 2.0,
  5: 1.5,
};

var valores = lines.shift().split(" ");

var ent = parseInt(valores[0]);
var qtde = parseInt(valores[1]);

var uni = cardapio[ent];

var total = uni * qtde;

console.log("Total: R$ " + total.toFixed(2));
