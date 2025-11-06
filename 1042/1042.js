var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var linhaInteira = lines.shift();

var valoresStr = linhaInteira.split(" ");

var [a, b, c] = valoresStr.map(Number);

var original = [a, b, c];

var ordenados = [a, b, c];

ordenados.sort((x, y) => x - y);

console.log(ordenados[0]);
console.log(ordenados[1]);
console.log(ordenados[2]);

console.log();

console.log(original[0]);
console.log(original[1]);
console.log(original[2]);
