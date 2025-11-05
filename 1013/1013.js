var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var linha = lines.shift().split(" ");

var a = parseInt(linha[0]);
var b = parseInt(linha[1]);
var c = parseInt(linha[2]);

var maiorAB = (a + b + Math.abs(a - b)) / 2;

var maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

console.log(maiorABC + " eh o maior");
