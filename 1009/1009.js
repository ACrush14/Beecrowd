var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var nome = lines.shift();
var sal = parseFloat(lines.shift());
var vendas = parseFloat(lines.shift());

var bonus = vendas * 0.15;

var total = sal + bonus;

console.log("TOTAL = R$ " + total.toFixed(2));
