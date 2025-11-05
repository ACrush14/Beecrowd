var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var num = parseInt(lines.shift());

var ano = Math.floor(num / 365);

num = num % 365;

var mes = Math.floor(num / 30);

var dia = num % 30;

console.log(ano + " ano(s)");
console.log(mes + " mes(es)");
console.log(dia + " dia(s)");
