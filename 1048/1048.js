var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var sal = parseFloat(lines.shift());
var bonus;

if (sal <= 400) {
  bonus = 0.15;
} else if (sal <= 800) {
  bonus = 0.12;
} else if (sal <= 1200) {
  bonus = 0.1;
} else if (sal <= 2000) {
  bonus = 0.07;
} else {
  bonus = 0.04;
}

var reajuste = sal * bonus;
var novo = sal + reajuste;
var percent = parseInt(bonus * 100);

console.log("Novo salario: " + novo.toFixed(2));
console.log("Reajuste ganho: " + reajuste.toFixed(2));
console.log("Em percentual: " + percent + " %");
