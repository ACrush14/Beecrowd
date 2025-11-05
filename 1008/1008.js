var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var num = parseInt(lines.shift());
var hora = parseInt(lines.shift());
var recebe = parseFloat(lines.shift());

var salario = hora * recebe;

console.log("NUMBER = " + num);
console.log("SALARY = U$ " + salario.toFixed(2));
