var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");
var lines = input.split("\n");

var [cod1, num1, valor1] = lines[0].split(" ").map(Number);

var [cod2, num2, valor2] = lines[1].split(" ").map(Number);

var total = num1 * valor1 + num2 * valor2;

console.log("VALOR A PAGAR: R$ " + total.toFixed(2));
