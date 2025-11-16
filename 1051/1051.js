var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var salario = parseFloat(lines.shift());
var imposto = 0;

if (salario <= 2000) {
  console.log("Isento");
} else if (salario <= 3000) {
  imposto = (salario - 2000) * 0.08;
  console.log("R$ " + imposto.toFixed(2));
} else if (salario <= 4500) {
  imposto = 1000 * 0.08 + (salario - 3000) * 0.18;
  console.log("R$ " + imposto.toFixed(2));
} else {
  imposto = 1000 * 0.08 + 1500 * 0.18 + (salario - 4500) * 0.28;
  console.log("R$ " + imposto.toFixed(2));
}
