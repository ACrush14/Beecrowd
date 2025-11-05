var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

var valor = parseInt(lines.shift());

console.log(valor);

var cont100 = 0,
  cont50 = 0,
  cont20 = 0,
  cont10 = 0,
  cont5 = 0,
  cont2 = 0,
  cont1 = 0;

while (valor >= 100) {
  valor -= 100;
  cont100 += 1;
}
while (valor >= 50) {
  valor -= 50;
  cont50 += 1;
}

while (valor >= 20) {
  valor -= 20;
  cont20 += 1;
}

while (valor >= 10) {
  valor -= 10;
  cont10 += 1;
}

while (valor >= 5) {
  valor -= 5;
  cont5 += 1;
}
while (valor >= 2) {
  valor -= 2;
  cont2 += 1;
}
while (valor >= 1) {
  valor -= 1;
  cont1 += 1;
}
console.log(cont100 + " nota(s) de R$ 100,00");
console.log(cont50 + " nota(s) de R$ 50,00");
console.log(cont20 + " nota(s) de R$ 20,00");
console.log(cont10 + " nota(s) de R$ 10,00");
console.log(cont5 + " nota(s) de R$ 5,00");
console.log(cont2 + " nota(s) de R$ 2,00");
console.log(cont1 + " nota(s) de R$ 1,00");
